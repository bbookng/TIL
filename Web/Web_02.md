# 💫Web : 그리드 시스템 / 반응형 웹

##  ✨ CSS layout techniques

- Display
- Position
- Float (CSS1, 1996)
- Flexbox (2012)
- Grid (2017)



## ✨ Float

- 박스를 왼쪽 혹은 오른쪽으로 이동시켜 텍스트를 포함 인라인요소들이 주변을 wrapping하도록 함
- 요소가 Normal flow를 벗어나도록 함



#### 📢 Float 속성

- none : 기본값
- left : 요소를 왼쪽으로 띄움
- right : 요소를 오른쪽으로 띄움



## ✨ CSS Flexible Box Layout

- 행과 열 형태로 아이템을 배치하는 1차원 레이아웃 모델
- 축
  - main axis (메인 축)
  - cross axis (교차 축)
- 구성 요소
  - Flex Container (부모 요소)
  - Flex Item (자식 요소)

#### 📢 Flex 구성 요소

- Flex Container (부모 요소)
  - flexbox 레이아웃을 형성하는 가장 기본적인 모델
  - Flex item들이 놓여있는 영역
  - display 속성을 flew 혹은 inline-flex로 지정
- Flex Item (자식 요소)
- 컨테이너에 속해 있는 컨텐츠 (박스)

#### 📢 Flex 시작

- 부모 요소에 `display: flex` 혹은 `inline-flex`

#### 📢 Flex 속성

- 배치 설정

  - **`flex-direction`**

    - Main axis 기준 방향 설정
    - 역방향의 경우 HTML 태그 선언 순서와 시각적으로 다르니 유의 (웹 접근성에 영향)

    1. `row`
    2. `row-reverse`
    3. `column`
    4. `column-reverse`

  - **`flex-wrap`**

    - 아이템이 컨테이너를 벗어나는 겨우 해당 영역 내 배치되도록 설정
    - 즉, 기본적으로 컨테이너 영역을 벗어나지 않도록 함

    1. **wrap** : 넘치면 그 다음 줄로 배치 
    2. **nowrap** : (기본 값) 한 줄에 배치

  - **`flex-flow`**

    - flex-direction과 flex-wrap의 shorthand
    - flex-direction과 flex-wrap에 대한 설정 값을 차례로 작성
    - 예시 ) `flex-flow: row nowrap;`

- 공간 나누기

  - **`justify-content (main axis)`**

    - **Main axis**를 기준으로 공간 배분

    1. `flex-start` : 아이템들을 axis 시작점으로
    2. `flex-end` : 아이템들을 axis 끝 쪽으로
    3. `center` : 아이템들을 axis 중앙으로
    4. `space-between` : 아이템 사이의 간격을 균일하게 분배
    5. `space-around` : 아이템들을 둘러싼 영역을 균일하게 분배 (가질 수 있는 영역을 반으로 나눠서 양쪽에)
    6. `space-evenly` : 전체 영역에서 아이템 간 간격을 균일하게 분배

  - **`align-content (cross axis)`**

    - **Cross aixs**를 기준으로 공간 배분 (아이템이 한 줄로 배치되는 경우 확인할 수 없음)

    1. `flex-start` : 아이템들을 axis 시작점으로
    2. `flex-end` : 아이템들을 axis 끝 쪽으로
    3. `center` : 아이템들을 axis 중앙으로
    4. `space-between` : 아이템 사이의 간격을 균일하게 분배
    5. `space-around` : 아이템들을 둘러싼 영역을 균일하게 분배 (가질 수 있는 영역을 반으로 나눠서 양쪽에)
    6. `space-evenly` : 전체 영역에서 아이템 간 간격을 균일하게 분배

- 정렬

  - **`align-items`** 

    - 모든 아이템을 Cross axis를 기준으로 정렬

    1. `stretch` (기본 값) : 컨테이너를 가득 채움
    2. `flex-start` : 위
    3. `flex-end` : 아래
    4. `center` : 가운데
    5. `baseline` : 텍스트 baseline에 기준선을 맞춤

  - **`align-self (개별 아이템)`**

    - 개별 아이템을 Cross axis 기준으로 정렬

    1. `stretch` (기본 값) : 컨테이너를 가득 채움
    2. `flex-start` : 위
    3. `flex-end` : 아래
    4. `center` : 가운데

- 기타 속성
  - flex-grow : 남은 영역을 아이템에 분배
  - order : 배치 순서



# 💫 Bootstrap

#### 📢 CDN

- Content Delivery(Distribution) Network
- 컨텐츠(CSS, JS, Image, Text  등)을 효율적으로 전달하기 위해 여러 노드에 가진 네트워크에 데이터를 제공하는 시스템.
- 개별 end-user의 가까운 서버를 통해 빠르게 전달 가능(지리적 이점)
- 외부 서버를 활용함으로써 본인 서버의 부하가 적어짐



### ✨ Boostrap의 기본 원리

#### 📢 spacing (Margin and padding)

- `{property}{sides}-{size}`
- Where property is one of:
  - **m** - for classes that set margin
  - **p** - for classes that set padding