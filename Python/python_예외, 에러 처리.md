# 💫 에러, 예외처리

## ✨ 디버깅

- 잘못된 프로그램을 수정하는 것을 디버깅이라 함 de(없앤다) + buggint(버그)
- 에러 메시지가 발생하는 경우
  - 해당 하는 위치를 찾아 메시지를 해결
- 로직 에러가 발생하는 경우
  - 명시적인 에러 메시지 없이 예상과 다른 결과가 나온 경우
    - 정상적으로 동작하였던 코드 이후 작성된 코드를 생각해봄
    - 전체 코드를 살펴봄
    - 휴식을 가져봄
    - 누군가에게 설명해봄

- print 함수 활용
  - 특정 함수 결과, 반복/조건 결과 등 나눠서 생각, 코드를 bisection으로 나눠서 생각
- 개발 환경(text editor, IDE) 등에서 제공하는 기능 활용
  - breakpoint 변수 조회 등
- Python tutor 활용 (단순 파이썬 코드인 경우)

- 뇌컴파일, 눈디버깅



## ✨ 에러와 예외

### [ 문법 에러 (Syntax Error) ]

- SyntaxError가 발생하면, 파이썬 프로그램은 실행이 되지 않음
- 파일이름, 줄번호, ^ 문자를 통해 파이썬이 코드를 읽어 나갈 때(parser) 문제가 발생한 위치를 표현
- 줄에서 에러가 감지된 가장 앞의 위치를 가리키는 캐럿(caret) 기호(^)를 표시



- **Invalid syntax 문법 오류** : ` while # SyntaxError : invalid syntax`
- **assign to literal 잘못된 할당** : `5=3 # SyntaxError : cannot assign to literal`
- **EOL (End of Line)** : `print('hello # SyntaxError: EOL while scanning string literal`
- **EOF (End of File)** : `print( # SyntaxError : unexpected EOF while parsing`



### [ 예외(Exception) ]

- 실행 도중 예상치 못한 상황을 맞이하면, 프로그램 실행을 멈춤
  - 문장이나 표현식이 문법적으로 올바르더라도 발생하는 에러
- 실행 중에 감지되는 에러들을 예외(Exception)라고 부름
- 예외는 여러 타입(type)으로 나타나고, 타입이 메시지의 일부로 출력됨
  - NameError, TypeError 등은 발생한 예외 타입의 종류(이름)
- 모든 내장 예외는 Exception Class를 상속받아 이뤄짐
- 사용자 정의 예외를 만들어 관리할 수 있음



- **ZeroDivisionError** : 0으로 나누고자 할 때 발생 

  `10.0 # ZeroDivisionError: division by zero`

- **NameError** : namespace 상에 이름이 없는 경우

   `print(name_error) # NameError: 'name_error' is not defined`

- **TypeError** : 

  - type 불일치

  ` 1 + '1' # TypeError: unsupported operand type(s) for +: 'int' and 'str'`

  `round('3.5') # TypeError: type str doesn't define __round__ method`

  - argument 누락

  `divmod() # TypeError: divmod expected 2 arguments, got 0`

  ```python
  import random
  random.sample()
  # TypeError: sample() missing 2 required positional arguments: 'population' and 'k'
  ```

  - argument 개수 초과

  `divmod(1, 2, 3) # TypeError: divmod expected 2 argument, got 3`

  ```python
  import random
  random.sample(range(3), 1, 2)
  # TypeError: sample() takes 3 positional arguments bet 4 were given
  ```

  - argument type 불일치

  ```python
  import random
  random.sample(1, 2)
  # TypeError: Population must be a sequance. For dicts or sets, use sorted(d).
  ```

- **ValueError** : 타입은 올바르나 값이 적절하지 않거나 없는 경우

​		`int('3.5') # ValueError: invalid literal for int() with base10: '3.5'`

​		`range(3).index(6) # ValueError: 6 is not in range`

- **IndexError** : 인덱스가 존재하지 않거나 범위를 벗어나는 경우

  ```python
  empty_list = []
  empty_list[2]
  # IndexError: list index out of range
  ```

- **KeyError** : 해당 키가 존재하지 않는 경우

  ```python
  song = {'IU':'좋은날'}
  song['BTS'] # KeyError: 'BTS'
  ```

- **ModuleNotFoundError**

  `import ssafy # ModuleNotFoundError: No module named 'ssafy'`

- **ImportError** : Module은 있으나 존재하지 않는 클래스/함수를 가져오는 경우

  ```python
  from random import samp 
  # ImportError: cannot import name 'samp' from 'random' (/usr/lib/pyhon3.9/random.py)
  ```

- **KeyboardInterrupt** : 임의로 프로그램을 종료하였을 때

- **Indentation Error** : Indentation이 적절하지 않는 경우

  ```python
  for i in range(3):
  print(i) # IndentationError: expected an indented block
  
  for i in range(3):
      print(i)
      	print(i) # IndentationError: unexpected indent
  ```

  

## ✨ 예외 처리

- try 문(statement)/ except 절(clause)를 이용하여 예외 처리를 할 수 있음
- try 문
  - 오류가 발생할 가능성이 있는 코드를 실행
  - 예외가 발생되지 않으면, except 없이 실행 종료
- except 문
  - 예외가 발생하면, except 절이 실행
  - 예외 상황을 처리하는 코드를 받아서 적절한 조취를 취함

```python
try:						# try문은 반드시 한 개 이상의 except 문이 필요
    try 명령문
except 예외그룹-1 as 변수-1 :
    예외처리 명령문 1
except 예외그룹-2 as 변수-2 :
    예외처리 명령문 2
finally: #선택사항
    finally 명령문
```

```python
try:
    num = input('숫자입력 :')
    print(int(num))
except ValueError:
    print('숫자가 입력되지 않았습니다.')
```

#### - 에러 메시지 처리(as)

- as 키워드를 활용하여 원본 에러 메시지를 사용할 수 있음
  - 예외를 다른 이름에 대입

````python
[][1] # IndexError: list index out of range

try:
    empty_list = []
    print(empty_list[-1])
except IndexError as err:
    print(f'{err}, 오류가 발생했습니다.')
```
list index out of range, 오류가 발생했습니다.
```
````

- 복수의 예외 처리 실습

```python
try:
    num = input('100으로 나눌 값을 입력하시오 : ')
    100/int(num)
except (ValueError, ZeroDivisionError):
    print('제대로 입력해줘.')
    
    
try:
    num = input('100으로 나눌 값을 입력하시오 : ')
    100/int(num)
except ValueError :
    print('숫자를 넣어주세요.')
except ZeroDivisionError:
    print('0으로 나눌 수 없습니다.')
except:
    print('에러는 모르지만 에러가 발생하였습니다.')

# 순차적으로 수행됨으로, 가장 작은 범주부터 예외처리를 해야함
```



#### - 예외 처리 종합

- try : 코드를 실행함
- except : try 문에서 예외가 발생 시 실행함
- else : try 문에서 예외가 발생하지 않으면 실행함
- finally : 예외 발생 여부와 관계없이 항상 실행함