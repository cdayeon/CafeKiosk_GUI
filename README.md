# 스무디킹 키오스크

## 개발 인원
총 1명(백엔드 1명 - 개인 프로젝트)

## 프로젝트 소개
IT전문교육기관에서 웹&앱개발 교육 중 GUI를 개발하는 단체 프로젝트를 진행했었습니다. 첫 단체 프로젝트이다보니 부족한 부분이 많았고, 완성도가 높지 않아 스스로 만족스럽지 않았습니다. 그래서 부족한 부분을 보완하고자 개인 GUI 개발 프로젝트를 진행하였습니다. 일상생활에서 많이 사용되는 GUI를 고민하다가 키오스크를 떠올렸고, 카페를 주제로 삼아 스무디킹 키오스크 GUI개발을 선택하게 되었습니다.

## 프로젝트 기간
#### 2023. 03 ~ 2023. 03 (2주 소요)

## Stack
<img src="https://img.shields.io/badge/Java-66CFE3?style=for-the-badge&logo=JAVA&logoColor=white" /> <img src="https://img.shields.io/badge/JavaSwing-F37C20?style=for-the-badge&logo=JAVA&logoColor=black" /> <img src="https://img.shields.io/badge/Eclipse-2C2255?style=for-the-badge&logo=eclipseide&logoColor=white" />

------
## 화면 구성
<img width="484" alt="스크린샷 2024-01-26 오후 6 41 31" src="https://github.com/cdayeon/CafeKiosk_GUI/assets/119835857/5961252c-4c38-4f1c-83cf-d9343f788e15">
<br/>
<img width="484" alt="스크린샷 2024-01-26 오후 6 41 51" src="https://github.com/cdayeon/CafeKiosk_GUI/assets/119835857/8250c989-bbec-4f3d-8ebb-1aff06090eb8">

------
## 프로젝트 구현 기능
1. 배너 화면
    - **매장, 포장**
        - 매장, 포장 버튼을 누르면 메뉴 화면으로 이동
2. 메뉴 화면
    - **FITNESS 스무디, FRUIT 스무디, COFFEE & TEA, FOOD**
        - 각 버튼을 누르면 메뉴 패널 간 이동
    - **음료 이미지, +, -, 확인**
        - 음료 이미지를 누르면 확인 버튼 활성화
        - +, -로 수량 추가, 감소 가능
        - 확인 버튼 누르면 주문 목록에 메뉴 이름, 가격, 수량, 합계 금액이 보여짐
    - **이전, 초기화, 결제**
        - 이전 : 메뉴 화면에서 배너 화면으로 이동
        - 초기화 : 주문 목록에 담겨있던 메뉴들 모두 삭제
        - 결제 : 주문 목록 확인 안내창 등장 후 배너 화면으로 이동
          
------
### 3. 회고
* JavaSwing을 통해 키오스크 GUI가 만들어지는 과정을 알게 되었습니다.
* 하나의 생성자 안에 많은 코드를 입력하여 코드의 가독성이 떨어진다는 점이 아쉬웠습니다. 메서드를 활용해 메뉴의 종류별로 코드를 분리했다면 코드의 가독성이 더 좋지 않았을까 생각됩니다.
* 부가적인 디자인 요소를 추가한다면 더 완성도있는 키오스크 GUI가 될 것이라고 생각합니다.
