# 자동차 경주 
## 기능 요구 사항

* 초간단 자동차 경주 게임을 구현한다.
* `주어진 횟수 동안` `n대의 자동차`는 **전진** 또는 **멈출** 수 있다.
* 사용자는 몇 대의 자동차로 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
* 전진하는 조건은 `0에서 9 사이에서 random 값`을 구한 후 `random 값이 4이상일 경우`이다.
* `자동차의 상태를 화면에 출력`한다. 어느 시점에 출력할 것인지에 대한 제약은 없다.  

## 프로그래밍 요구사항
* 모든 로직에 단위 테스트를 구현한다. 단, UI(System.out, System.in) 로직은 제외
  * 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분한다.
  * UI 로직을 InputView, ResultView와 같은 클래스를 추가해 분리한다.
* 자바 코드 컨벤션을 지키면서 프로그래밍한다.
  * 참고문서: https://google.github.io/styleguide/javaguide.html 또는 https://myeonguni.tistory.com/1596
* else 예약어를 쓰지 않는다.
  * 힌트: if 조건절에서 값을 return하는 방식으로 구현하면 else를 사용하지 않아도 된다.
  * else를 쓰지 말라고 하니 switch/case로 구현하는 경우가 있는데 switch/case도 허용하지 않는다.
  
# 테스트 케이스  
* 1개의 자동차가 1번 움직일 수 있는가? 
* 1개의 자동차가 n번 움직일 수 있는가?  
* n개의 자동차가 1번 움직일 수 있는가?
* n개의 자동차가 n번 움직일 수 있는가?  

# 클래스 역할/책임  
* GameStarter : 
  * RacingController 를 실행하는 Main 클래스 
* RacingGameController :   
  * InputView/ResultView/RacingCarGame 을 조율하면서 실행   
  * InputView 을 실행해서 Request 를 받는다.
  * 받아온 Request 를 통해 RacingCarGame 실행       
  * RacingCarGame 에서 넘어온 Response 를 ResultView 으로 전달    
* InputView :   
  * 사용자에게서 `자동차 수`, `라운드`를 입력 받는다.   
  * 받은 데이터를 `RequestDto`로 묶어서 한 번에 요청을 보낸다
    * RequestDto 생성 
* RacingCarGame :
  * 레이싱을 진행
  * RacingCar, RacingRound 를 가지고 있다.
  * 얻어진 결과 값을 `ResponseDto`로 묶어서 ResultView 로 반환한다.   
    * ResponseDto 생성    
* ResultView :  
  * `RacingCarGame` 에서 얻어온 ResponseDto 를 저장/출력한다.(시점 아직 미정)  
* Car : 
  * 자동차   
  * 지나온 길의 상태를 가지고 있다.    
  * 특정 조건에 대해서 움직일 수 있는지, 없는지를 판별한다.(활성 함수와 비슷)