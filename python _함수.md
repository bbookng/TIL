# 함수

### [1] 함수 기초

- 함수를 왜 사용할까 ?

  - Decomposition(분해)

    기능을 분해하고, 재사용 가능하게 만들고

  - Abstraction(추상화)

#### 	(1) 함수의 종류

1. 내장 함수

: 파이썬에 기본적으로 포함된 함수

2. 외장 함수

: import 문을 통해 사용하며, 외부 라이브러리에서 제공하는 함수

3. 사용자 정의 함수

: 직접 사용자가 만드는 함수

#### 	(2) 함수의 정의

- 함수(Function)
  - 특정한 기능을 하는 코드의 조각(묶음)
  - 특정 코드를 매번 다시 작성하지 않고, 필요시에만 호출하여 간편히 사용

#### 	(3) 함수 기본 구조

##### 1. 선언과 호출 (define & cell)

```python 
def pstdev(data, mu=None) : # keyword, name, parameters

return var.sqrt()`#function body
```

- 함수의 선언은 def  키워드를 활용함
- 들여쓰기를 통해 Funtion body(실행될 코드 블록)를 작성함
  - Docstring은 함수 body 앞에 선택적으로 작성 가능
    - 작성 시에는 반드시 첫 번째 문장에 문자열 """

- 함수는 parameter를 넘겨줄 수 있음
- 함수는 동작 후에 return을 통해 결괏값을 전달함

---



##### 2. 입력 (Input)

###### [ Parameter와 Argument ]

- **Parameter** : 함수를 정의할 때, 함수 내부에서 사용되는 변수
- **Argument** : 함수를 호출할 때, 넣어주는 값
  - 함수 호출 시 함수의 parameter를 통해 전달되는 값
  - Argument는 소괄호 안에 할당 func_name(argument)
    - 필수 Argument : 반드시 전달되어야 하는 argument
    - 선택 Argument : 값을 전달하지 않아도 되는 경우는 기본값이 전달

###### [ Argument ]

- **Positional Arguments**
  - **기본적으로** 함수 호출 시 Argument는 위치에 따라 함수 내에 전달됨
- **Keyword Arguments**
  - 직접 변수의 이름으로 특정 Argument를 전달할 수 있음
  - **Keyword Argument 다음에 Positional Argument를 활용할 수 없음**
- **Default Arguments Values**
  - 기본값을 지정하여 함수 호출 시 argument 값을 설정하지 않도록 함
    - 정의된 것 보다 더 적은 개수의 argument 들로 호출될 수 있음
- **Asterisk(*****)와 가변 인자(*args)**
  - *는 스퀸스 연패킹 연산자라고도 불리며, 말 그대로 시퀀스를 풀어 헤치는 연산자
    - 주로 튜플이나 리스트를 언패킹하는데 사용
    - *를 활용하여 가변 인자를 만들 수 있음 
- **가변인자란 ?**
  - 여러 개의 Positional Argument를 하나의 필수 parameter로 받아서 사용

- 가변인자는 언제 사용하는가 ?
  - 몇 개의 Positional Argument를 받을지 모르는 함수를 정의할 때 유용

- **가변 키워드 인자`(**kwargs)` 예시**
  - 가변인자와 가변 키워드 인자를 함께 사용할 수 있음

````python
def print_family_name(*parents, **pets):
    print("아버지 :", parents[0])
    print("어머니 :", parents[1])
    if pets:
        print("반려동물들..")
        for title, name in pets.items():
            print('{} : {}'.format(title, name))
            
print_family_name('아부지', '어무이', dog='멍멍이', cat='냥냥이')

```
아버지 : 아부지
어머니 : 어무이
반려동물들..
dog : 멍멍이
cat : 냥냥이
```
````



- **패킹 / 언패킹**

  - 가변 인자를 이해하기 위해서는 패킹, 언패킹은 이해해야 함

  - **패킹** : 여러 개의 데이터를 묶어서 변수에 할당하는 것

  - **언패킹** : 시퀀스 속의 요소들을 여러 개의 변수에 나누어 할당하는 것

  - ```python
    numbers = (1, 2, 3, 4, 5) # 패킹
    a, b, c, d, e, = numbers # 언패킹
    ```

  - 언패킹시 변수의 개수와 할당하고자 하는 요소의 갯수가 동일해야함

  - 언패킹시 왼쪽의 변수에 `asterisk(*)`를 붙이면, 할당하고 남은 요소를 리스트에 담을 수 있음

```python
def function(ham): # parameter : ham
    return ham

function('spam') # argument : 'spam'
# 함수 리턴값 : spam
```

---



##### 3. 문서화 (Docstring)

---



##### 4. 범위 (Scope)

###### [Python의 범위(Scope)]

- 함수는 코드 내부에 local scope를 생성하며,

  그 외의 공간인 global scope로 구분

- scope
  - global scope :  코드 어디에서든 참조할 수 있는 공간
  - local scope : 함수가 만든 scope. 함수 내부에서만 참조 가능

- variable
  - global variable : global scope에 정의된 변수
  - local variable : local scope에 정의된 변수

###### [변수 수명주기(lifecycle)]

-  변수는 각자의 수명주기(lifecylce)가 존재

  - bulit-in scope
    - 파이썬이 실행된 이후부터 영원히 유지

  - global scope
    - 모듈이 호출된 시점 이후 혹은 인터프리터가 끝날 때까지 유지
  - local scope
    - 함수가 호출될 때 생성되고, 함수가 종료될 때까지 유지

#### - 이름검색규칙(Name Resolution)

- 파이썬에서 사용되는 이름(식별자)들은 이름공간(namespace)에 저장되어 있음
- 아래와 같은 순서로 이름을 찾아나가며, LEGB Rule이라고 부름
  - **L**ocal scope
  - **E**nclosed scope
  - **G**lobal scope
  - **B**uilt-in scope

- 함수 내에서는 바깥 Scope의 변수에 접근 가능하나 수정은 할 수 없음

##### [global 문]

- 현재 코드 블록 전체에 적용되며, 

```python
a = 0
b = 1
def enclosed():
    a = 10
    c = 3
    def local(c):
        print(a, b, c) # 10 1 300
    local(300)
    print(a, b, c) # 10 1 3
enclosed()
print(a, b) # 0 1
```



---



##### 5. 결과값 (Output)

- 값에 따른 함수의 종류

  - Void function
    - 명시적인 return 값이 없는 경우, None을 반환하고 종료

  - Value returning function
    - 함수 실행 후, return문을 통해 값 반환
    - return을 하게 되면, 값 반환 후 함수가 바로 종료

```python
# Void function
print('hello python')  #print는 값을 출력하지만, 값을 반환하진 않습니다.

# Value returning function
float('3.14') # 3.14
```

- print 함수와 return의 차이점
  - print를 사용하면 호출될 때마다 값이 출력됨 (주로 테스트를 위해 사용)
  - 데이터 처리를 위해서는 return 사용
- REPL(Read-Eval-Print Loop) 환경에서는 마지막으로 작성된 코드의 리턴 값을 보여주므로 같은 동작을 하는 것으로 착각할 수 있음

##### - 튜플을 활용하여 두 개 이상의 값 반환

- 반환 값으로 튜플 사용

  ```python
  def minus_and_product(x, y):
      return x - y, x * y
  
  y = minus_and_product(4, 5)
  print(y) # (-1, 20)
  print(type(y)) # <class 'tuple'>
      
  ```

##### [ 함수 반환 정리 ]

- return X > None
- return O > 하나를 반환
- 여러 개를 원하면, Tuple 활용 (혹은 리스트와 같은 컨테이너 활용)

```python
# 똑바로 읽어도 거꾸로 읽어도 같은 단어를 찾는 함수 

word_list = ['우영우', '기러기', '별똥별', '파이썬']
def is_palindrome(word_list):
    palindrome_list = []
    for word in word_list:
        if word == word[::-1]:
            palindrome_list.append(word)
    return palindrome_list
print(is_palindrome(word_list))
# ['우영우', '기러기', '별똥별']
```





# 모듈

- 모듈 : 다양한 기능을 하나의 파일로 묶은 것

- 패키지 : 다양한 파일을 하나의 폴더로 묶은 것

- 라이브러리 : 다양한 패키지를 하나의 묶음으로 묶은 것

### 모듈

- 특정 기능을 하는 코드를 파이썬 파일(.py) 단위로 작성한 거

### 패키지

- 특정 기능과 관련된 여러 모듈의 집합
- 패키지 안에는 또 다른 서브 패키지를 포함

```python
import module
from module import var, function, Class
from module import *

from package import module
from package.module import var, function, Class
```



### 파이썬 패키지 관리자(pip) 명령어

#### 패키지 관리하기

- 아래의 명령어들을 통해 패키지 목록을 관리[1]하고 설치할 수 있음[2]
- 일반적으로 패키지를 기록하는 파일의 이름은 requirements.txt로 정의함

```python
$pip freeze > requirements.txt
$pip install-r requirements.txt
```

