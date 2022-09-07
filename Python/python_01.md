# Python_01

## 저장

###  1. 변수(Variable)

- 기본 입력은 string으로 받는다.
- 숫자(int)
- 글자(string) `''` 또는`""` 를 사용한다.
- 참 / 거짓 
  - `True` 또는 `False`
  - 조건/반복을 위해 사용한다.

```python
dust = int(input())
```



###  2. 리스트(list)

- 대괄호로 나타낸다. `[1, 2, 3, 4, ...]`
- index 숫자는 0부터 시작한다.

```python
menu = ["돼지고기", "닭고기", "소고기"]
print(menu[0])
# 출력값은 '돼지고기'가 나온다.
```





###  3. 딕셔너리(dictionary)

- 이름표를 단 여러 개의 값을 저장할 수 있는 공간
- 중괄호로 나타낸다. `{}`
  - `{"김보경": '010-8956-6525', "홍길동": '1234-1234'}`
  - `{key1 : value1, key2 : value2}`

- key는 중복이 되면 안된다.

```python
menu = {"홍콩반점":'1234-1234', "초원삼겹살":'5678-5678', "새마을식당":'051-385-1122'}

print(menu["홍콩반점"])
# 출력값은 1234-1234 가 나온다.
```



## 조건

###  - if 문

- flow chart 논리흐름도를 참고하는 것이 좋다.
- `if 조건 :`, `elif 조건:`, `else :`를 사용한다.

```python
dust = int(input())

if dust > 150:
    print("매우 나쁨")
elif 80 < dust <= 150:
    print("나쁨")
elif 30 < dust <= 80:
    print("보통")
else:
    print("좋음")
```



## 반복

###  1. While 문

- 횟수의 제한이 없는 반복
- 탈출코드 : while 문을 빠져 나가기 위한 조건

```python
while n < 1 :
    n = 4
    print("안녕하세요") 
    n -=1
    
# 출력값
안녕하세요
안녕하세요
안녕하세요
안녕하세요
```



###   2. for 문

- 횟수의 제한이 있는 반복

```python
dusts = [59, 24, 102]
for i in dusts: #dusts 의 갯수만큼
    print(i)
    
# 출력값
59
24
102
```

- range(start, end, step)

```python
a = "안녕하세요"
for _ in range(4): #0에서 3까지 범위만큼 반복
    print(a)

# 출력은
안녕하세요
안녕하세요
안녕하세요
안녕하세요
```



## 모듈







* python pep8 = 오픈소스 규칙 (매너)



