# 💫 Vue_01

## ✨ Vue intro

### 📌 Front-end Development

- Javascript 를 활용한 Frontend 개발
- Front-end 개발은?
  - `Vue.js`
  - Vue.js === JavaScript Front-end Framework



#### 💡 Front-end Famework

- Front-end(FE) 개발이란?
  - 사용자에게 보여주는 화면 만들기
- **Web APP**(SPA)을 만들 때 사용하는 도구
  - SPA - Single Page Application







## ✨ Why Vue

#### 💡 Vue CDN

- Vue 로 작업을 시작하기 위하여 CDN을 가져와야 함
- Django == Python Web Framework
  - pip install
- Vue === JS Front-end Framework
  - Bootstrap 에서 사용하였던 CDN 방식 제공
  - npm 활용











## ✨ Vue instance

#### 💡 MVVM Pattern

- 소프트웨어 아키텍처 패턴의 일종
- 마크업 언어로 구현하는 그래픽 사용자 인터페이스(view)의 개발을 Back-end(model)로부터 분리시켜 view가 어느 특정한 모델 플랫폼에 종속되지 않도록 함

![image-20221031144641256](C:\Users\SSAFY\AppData\Roaming\Typora\typora-user-images\image-20221031144641256.png)

![image-20221031144652514](C:\Users\SSAFY\AppData\Roaming\Typora\typora-user-images\image-20221031144652514.png)

- **View** - 우리 눈에 보이는 부분 = DOM
- **Model** - 실제 데이터 = JSON
- **View Model** (Vue)
  - View를 위한 Model
  - View와 연결(binding) 되어 Action 을 주고 받음
  - Model 이 변경되면 View Model 도 변경되고 바인딩된 View 도 변경됨
  - View 에서 사용자가 데이터를 변경하면 View Model의 데이터가 변경되고 바인딩된 다른 View 도 변경됨



#### 💡 MVVM Pattern 정리

- MVC 패턴에서 Controller 를 제외하고 View Model을 넣은 패턴

- View 는 Model을 모르고, Model도 View 를 모른다

  == DOM은 Data를 모른다. Data도 DOM을 모른다. (독립성 증가, 적은 의존성)

- View 에서 데이터를 변경하면 View Model의 데이터가 변경되고, 연관된 다른 View도 함께 변경된다.





## ✨ Basic of syntax

#### 💡 Template Syntax

- Vue2 guide > template syntax 참고
- **렌더링 된 DOM** 을 기본 Vue instance 의 data 에 **선언적으로 바인딩** 할 수 있는
  **HTML 기반 template syntax**를 사용
  - 렌더링 된 DOM - 브라우저에 의해 보기 좋게 그려질 HTML 코드
  - HTML 기반 template syntax - HTML 코드에 직접 작성할 수 있는 문법 제공
  - 선언적으로 바인딩 - Vue instance와 DOM 을 연결



#### 💡 Template Interpolation







### 📌 Directives

#### 💡 Directives 기본 구성

- v-접두사가 있는 특수 속성에는 값을 할당 할 수 있음
  - 값에는 JS 표현식을 작성 할 수 있음
- directive의 역할은 **표현식의 값**이 **변경**될 때 **반응적**으로 DOM에 적용하는 것







## ✨ Vue advanced

