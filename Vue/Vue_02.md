# 💫 Vue_02

## ✨ Vue CLI

### 📌 Node.js

#### 💡 `Node.js`

- 자바스크립트는 브라우저를 조작하는 유일한 언어
  - 하지만 브라우저 밖에서는 구동할 수 없었음
- 자바스크립트를 구동하기 위한 런타임 환경인 `Node.js` 로 인해 브라우저가 아닌 환경에서도 구동할 수 있게 됨
  - Chrome V8 엔진을 제공하여 여러 OS 환경에서 실행할 수 있는 환경을 제공
  - Browser만 조작 가능했으나, Server-Side-Programming 또한 가능



#### 💡 NPM (Node Package Manage)

- 자바스크립트 패키지 관리자
  - `Python` 에 `pip` 가 있다면 `Node.js` 에는 `npm`
  - pip 와 마찬가지로 다양한 의존성 패키지를 관리
- `Node.js` 의 기본 패키지 관리자
- `Node.js` 설치 시 함께 설치됨



### 📌 Vue CLI

- Vue 개발을 위한 표준 도구
- 프로젝트의 구성을 도와주는 역할
- 확장 플러그인, GUI, Babel 등 다양한 tool 제공



#### 💡 Vue CLI Quick Start

- **설치**

```
$ npm install -g @vue/cli
```

- **프로젝트 생성**
  - vscode terminal 에서 진행

```
$ vue create vue-cli
```

- **Vue 버전 선택 (Vue2)**

- 프로젝트 생성 성공

```bash
```



### 📌 Vue CLI 프로젝트 구조

#### 💡 node_modules  - `Babel`

- "JavaScript compiler"
- 자바스크립트의 ES6+ 코드를 구버전으로 번역/변환 해주는 도구
- 자바스크립트의 파편화, 표준화의 영향으로 작성된 코드의 스펙트럼이 매우 다양
  - 최신 문법을 사용해도 브라우저의 버전 별로 동작하지 않는 상황이 발생
  - 버전에 따른 같은 의미의 다른 코드를 작성하는 등의 대응이 필요해졌고, 이러한 문제를 해결하기 위한 도구
  - 원시 코드 (최신 버전)를 목적 코드(구 버전)으로 옮기는 번역기가 등장하면서 코드가 특정 브라우저에서 동작하지 않는 상황에 대해 크게 고민하지 않게 됨 



#### 💡 node_modules - `Webpack`

- "static module bundler"
- 모듈 간의 의존성 문제를 해결하기 위한 도구
- 프로젝트에 필요한 모든 모듈을 매핑하고 내부적으로 종속성 그래프를 빌드함



#### 💡 Module 의존성 문제

- 모듈의 수가 많아지고 라이브러리 혹은 모듈 간의 의존성 (연결성) 이 깊어지면서 특정한 곳에서 발생한 문제가 어떤 모듈 간의 문제인지



#### 💡 `Bundler`

- 모듈 의존성 문제를 해결해주는 작업이 Bundling
- 이러한 일을 해주는 도구가 Bundler 이고, Webpack 은 다양한 Bundler 중 하나
- 모듈들을 하나로 묶어주고 묶인 파일은 하나(혹은 여러개)



#### 💡 `package.json`

- 프로젝트의 종속성 목록과 지원되는 브라우저에 대한 구성 옵션을 포함



#### 💡 `package-lock.json`

- `node_modules`에 설치되는 모듈과 관련된 모든 의존성을 설정 및 관리
- 협업 및 배포 환경에서 정확히 동일한 종속성을 설치하도록 보장하는 표현
- 사용 할 패키지의 버전을 고정
- 개발 과정 간의 의존성 패키지 충돌 방지
- python 의 `requirements.txt` 역할



### 📌 Vue component

#### 💡 Vue component 구조









## ✨ SFC











## ✨ Pass Props & Emit Events

### 📌 Data in components

#### 💡 Data in components

- 우리는 정적 웹페이지가 아닌, 동적 웹페이지를 만들고 있음

  - 즉, 웹페이지에서 다뤄야 할 데이터가 등장
  - User data, 게시글 data, 등등 ...

- 한 페이지 내에서 같은 데이터를 공유 해야 함

  - 하지만 페이지들은 component 로 구분이 되어 있음

  

#### 💡 `pass props` & `emit event`

- 부모 > 자식으로의 데이터의 흐름
  - **pass props** 의 방식
- 자식 > 부모로의 데이터의 흐름
  - **emit event**의 방식



### 📌 Pass Props

- 요소의 속성(property)을 사용하여 데이터 전달
- props 는 부모(상위) 컴포넌트의 정보를 전달하기 위한 사용자 지정 특성
- 자식(하위) 컴포넌트는 props 옵션을 사용하여 수신하는 props 를 명시적으로 선언해야 함

- 부모 > 자식 으로의 data 전달 방식
- 정적인 데이터를 전달하는 경우 static props 라고 명시하기도 함
- 요소에 속성을 작성하듯이 사용 가능하여, `prop-data-name="value"` 의 형태로 데이터를 전달
  - 이 때 속성의 키 값은 **kebab-case** 를 사용