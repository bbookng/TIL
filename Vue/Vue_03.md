# 💫 Vue_03

## ✨ Vuex

### 📌 State Management

#### 💡 상태 관리 (State Management)

- 상태 (State) 란?
  - **현재에 대한 정보(data)**
- Web Application 에서의 상태는 어떻게 표현할까 ?
  - **현재 App이 가지고 있는 Data로 표현**



#### 💡 Centralized Store

- 중앙 저장소 (store) 에 데이터를 모아서 상태 관리
- 각 component 는 중앙 저장소의 데이터를 사용
- component 의 계층에 상관없이 중앙 저장소에 접근해서 데이터를 얻거나 변경할 수 있음
- 중앙 저장소의 데이터가 변경되면 각각의 component는 해당 데이터의 변화에 반응하여 새로 변경된 데이터를 반영함
- 규모가 크거나 컴포넌트 중첩이 깊은 프로젝트의 관리가 매우 편리



#### 💡 Vuex

- "state management pattern + Library" for vue.js (상태 관리 패턴 + 라이브러리)
- 중앙 저장소를 통해 상태 관리를 할 수 있도록 하는 라이브러리
- 데이터가 예측 가능한 방식으로만 변경 될 수 있도록 하는 **규칙을 설정하며, Vue의 반응성을 효율적으로 사용하는 상태 관리 기능**을 제공
- Vue의 공식 도구로써 다양한 기능을 제공



### 📌 Vuex 시작하기

















## ✨ Lifecycle Hooks

### 📌 Lifecycle Hooks

- 각 Vue 인스턴스는 생성과 소멸의 과정 중 단계별 초기화 과정을 거침
  - Vue 인스턴스가 생성된 경우, 인스턴스를 DOM에 마운트하는 경우, 데이터가 변경되어 DOM을 업데이트하는 경우 등
- 각 단계가 트리거가 되어 특정 로직을 실행할 수 있음







## ✨ Todo with Vuex

