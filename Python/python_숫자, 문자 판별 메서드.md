## 💫 숫자, 문자 판별 메서드

#### `.isdecimal()`

- 해당 문자열이 0~9까지의 수로 이루어진 것인지 검사한다. 
- int로 바로 변환할 수 있는 수인지를 검사하는 것이다.

```python
# bokyung dictionary의 'id' key의 마지막 글자가 숫자로 끝나는지 확인하기.
    
    # .isdecimal() 메서드 사용하여 판별
    if bokyung['id'][-1].isdecimal() == True:
        return True
    else:
        return False
    
    
    
    
        
    # list를 활용하여 판별
    list = map(str, range(0, 9))    # 0부터 9까지의 정수를 list로 만들어 str으로 변환
    if bokyung['id'][-1] in list :    # 'id'의 마지막 글자가 0부터 9사이의 숫자인지 확인
        return True
    else:
        return False
```



### `.isdigit()`

- 해당 문자열이 '숫자'로 이루어져 있는지 검사한다.

```python
x = '3²'
x.isdigit()
# True
x.isdecimal()
# False
int(x)
# ERROR!!!!
```



### `.isalpha()`

- 문자열의 구성이 알파벳인지 확인하는 방법.
- 문자열에 숫자 및 공백이 포함되어 있으면 False를  return

```python
Ex1 = 'A'
 
Ex2 = 'ABC'
 
Ex3 = "앱피아"
 
Ex4 = "Hello Appia"
 
Ex5 = "100Appia"
 
#print the is the result for isalpha()
 
print(Ex1.isalpha())	# True
 
print(Ex2.isalpha())	# True
 
print(Ex3.isalpha())	# True
 
print(Ex4.isalpha())	# True
 
print(Ex5.isalpha())	# True

```

