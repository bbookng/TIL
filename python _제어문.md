# python : 제어문 및 함수  



## [1] 제어문 (Control Statement)

- 파이썬은 기본적으로 위에서부터 아래로 차례대로 명령을 수행
- 특정 상황에 따라 코드를 선택적으로 실행(분기/조건)하거나 계속하여 실행(반복)하는 제어가 필요
- 제어문은 순서도(flowchart)로 표현이 가능

####  (1) 조건문

- 조건문은 참/거짓을 판단할 수 있는 조건식과 함께 사용 
  - 조건이 참인 경우 이후 들여쓰기 되어있는 코드 블록을 실행
  - 이외의 경우 else 이후 들여쓰기 되어있는 코드 블록을 실행
    - else는 선택적으로 활용할 수 있음

```python
# 조건문을 통해 변수 num의 값의 홀/짝 여부를 출력하시오.
# 이때 num은 input을 통해 사용자로부터 입력을 받으시오.

num = int(input('숫자 입력:'))
if num % 2 == 1:
    print('홀수')
else:
    print('짝수')
```

- 복수의 조건식을 활용할 경우 elif를 활용하여 표현함

```python
dust = 80
if dust > 150:
    print('매우 나쁨')
elif dust > 80:
    print('나쁨')
elif dust > 30:
    print('보통')
else:
    print('좋음')
print('미세먼지 확인 완료!')

#보통
#미세먼지 확인 완료!
```

#### - 중첩 조건문

```python
# 미세먼지 농도(dust값)이 300이 넘는 경우
'실외 활동을 자제하세요'를 추가로 출력하고 음수인 경우 '값이 잘못되었습니다'를 출력하시오.
dust = 500
if dust > 150:
    print('매우 나쁨')
    if dust > 300:
        print('실외 활동을 자제하세요.')
elif dust > 80:
    print('나쁨')
elif dust > 30:
    print('보통')
elif dust >= 0:
    print('좋음')
else:
    print('값이 잘못 되었습니다.')
```

#### - 조건 표현식

- 조건 표현식이란?
  - 조건 표현식을 일반적으로 조건에 따라 값을 정할 때 활용
  - 삼항 연산자로 부르기도 함

```python
true 인 경우 값 if 조건 else false인 경우 값

value = num if num >= 0 else -num #절대값을 저장하기 위한 코드

'홀수' if num % 2 else '짝수'

if num >=0:
    value = num
else:
    0

```



#### (2) 반복문

- 특정 조건을 만족할 때까지 같은 동작을 계속 반복하고 싶을 때 사용

  1. while 문
     - 종료 조건에 해당하는 코드를 통해 반복문을 종료시켜야 함
  2. for 문
     - 반복가능한 객체를 모두 순회하면 종료 (별도의 종료 조건이 필요 없음)
  3. 반복 제어
     - break, continue, for-else

  #### 1) While문

  - while문은 조건식이 참인 경우 반복적으로 코드를 실행
    - 조건이 참인 경우 들여쓰기 되어 있는 코드 블록이 실행됨
    - 코드 블록이 모두 실행되고, 다시 조건식을 검사하며 반복적으로 실행됨
    - while문은 무한 루프를 하지 않도록 종료 조건이 반드시 필요

  - **복합 연산자 (In-Place Operator)**
    - 복합 연산자는 연산과 할당을 합쳐 놓은 것
      - 예시 ) 반복문을 통해서 개수를 카운트하는 경우

  #### 2) for 문

  - for문은 시퀀스(string, tuple, list, range)를 포함한 순회 가능한 객체(iterable)의 요소를 모두 순회
    - 처음부터 끝까지 모두 순회하므로 별도의 종료 조건이 필요하지 않음

  - Iterable
    - 순회할 수 있는 자료형(string, list, dict, tuple, range, set 등)
    - 순회형 함수(range, enumerate)

  ##### for 문을 이용한 (String) 순회

  ```python
  chars = input()
  
  for idx in range(len(chars)):
      print(chars[idx])
  
  #################################################
  for char in chars:
      print(char)
      
  ```

  ##### Dictionary 순회

  ```python
  grades = {'john':80, 'eric':90}
  
  for student in grades:
      print(student)
  ```

  ##### 추가 메서드를 활용한 딕셔너리(Dictionary) 순회

  - 추가 메서드를 활용하여 순회할 수 있음
    - `keys()` :Key로 구성된 결과
    - `values()` : value로 구성된 결과
    - `items()` : (Key, value)로 구성된 결과

```python
grades = {'john':80, 'eric':90}

for student, grade in grades.items():
    print(student, grade)
```

     ##### 		enumerate 순회

````python
members = ['민수', '영희', '철수']

for idx, number in enumerate(members):
    print(idx, number)
    
```
0 민수
1 영희
2 철수
```

list(enumerate(members, start=1)) # 기본값은 0, start=1 하면 1부터 시작
````

##### 		List Comprehension

- 표현식과 제어문을 통해 특정한 값을 가진 리스트를 간결하게 생성하는 방법

  [code for 변수 in iterable]

  [code for 변수 in iterable if 조건식]

```python
# 1~3의 세제곱 리스트 만들기
cubic_list = []
for number in range(1, 4):
    cubic_list.append(number ** 3)
print(cubic_list)

###################################

cubic_list = [number ** 3 for number in range(1, 4)]
print(cubic_list)
```



##### 		Dictionary Comprehension

```python
# 1~3의 세제곱 딕셔너리 만들기
cubic_dict = {}

for number in range(1, 4):
    cubic_dic[number] = number ** 3
print(cubic_dict)

# {1: 1, 2:8, 3: 27}

cubic_dict = {number: number ** 3 for number in range(1, 4)}
print(cubic_dict)
```



####  3) 반복문 제어

- break : 반복문을 종료

- continue : continue 이후의 코드 블록은 수행하지 않고, 다음 반복을 수행

- for-else : 끝까지 반복문을 실행한 이후에 else문 실행, break를 통해 중간에 종료되는 경우 else 실행 안됨

- pass : 아무것도 하지 않음(문법적으로 필요하지만, 할 일이 없을 때 사용)

  

