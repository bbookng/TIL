# https://velog.io/@gnsl1465/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-Lv5-%EB%A9%B8%EC%A2%85%EC%9C%84%EA%B8%B0%EC%9D%98-%EB%8C%80%EC%9E%A5%EA%B7%A0-%EC%B0%BE%EA%B8%B0#-%EB%AC%B8%EC%A0%9C-%ED%92%80%EC%9D%B4

  with recursive tmp as (
    select id, parent_id, 1 as generation
    from ecoli_data
    where parent_id is null
    union all
    select s.id, s.parent_id, tmp.generation + 1
    from tmp join ecoli_data s
    on tmp.id = s.parent_id
)

select count(*) count, generation
from tmp
where id not in (
    select distinct parent_id
    from tmp
    where parent_id is not null)
group by generation
order by 2