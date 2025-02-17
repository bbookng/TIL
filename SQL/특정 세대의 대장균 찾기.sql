WITH GEN AS (
    SELECT C.ID, C.PARENT_ID
    FROM ECOLI_DATA AS A
             JOIN ECOLI_DATA AS B ON A.ID = B.PARENT_ID
             JOIN ECOLI_DATA AS C ON B.ID = C.PARENT_ID
    ORDER BY C.ID
)

SELECT GEN.ID
FROM GEN
WHERE GEN.PARENT_ID NOT IN (SELECT GEN.ID FROM GEN);