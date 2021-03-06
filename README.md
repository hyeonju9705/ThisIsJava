# ThisIsJava
이것이 자바다 개인스터디

<br><br>
### 변수와 타입
문자 리터럴을 저장할 수 있는 타입은 char 하나 뿐
문자열 리터럴을 지정할 수 있는 타입은 string 하나 뿐

정수 
- byte (1byte)
- char (2byte)
- short (2byte)
- int (4byte)
- long (8byte)
<br>실수
- float (4byte)
- double (8byte)
<br>논리
- boolean (1byte)

float은 4byte의 크기인데 int(4byte)와 long(8byte)보다 더 큰 타입으로 표시했다.
그 이유는 표현할 수 있는 값의 범위가 float이 더 크기 때문이다.

### 연산자
연산의 방향과 우선순위
1. 단항, 이항, 삼항 연산자 순으로 우선순위를 가진다.
2. 산술, 비교,논리, 대입 연산자 순으로 우선순위를 가진다.
3. 단항과 대입 연산자를 제외한 모든 연산의 방향은 왼쪽에서 오른쪽이다.(->)
4. 복잡한 연산식에는 괄호()를 사용해서 우선순위를 정해준다.

부호연산자(+,-) : 부호연산자를 사용할 때 주의할 점은 부호 연산자의 산출 타입은 int 타입이 된다는 것

비트반전 연산자(~) : 피연산자를 2진수로 표현했을 때 비트값인 0을 1로, 1은0으로 반전한다.
연산 후, 부호 비트인 최상위 비트를 포함해서 모든 비트가 반전되기 때문에, 부호가 반대인 새로운 값이 선출됨

이진포맷의 가수를 사용하는 부동소수점 타입 (float, double)은 0.1을 정확히 표현할 수 없어 근사치로 처리함
```
Double.isNaN(변수명) 메소드는 매개값이 NaN이라면 true를 리턴한다.
```
XOR ^
두 비트중 하나는 1이고 다른 하나가 0일 경우 연산 결과는 1


### 참조타입

배열을 쓰기위해서 반드시 new 연산자 사용하여 생성해줄것.
ex) scores = new int[i];

배열 변수를 이미 선언한 후에 다른 실행문에서 중괄호를 사용한 배열 생성은 허용X
변수 = new 타입[] {값1, 값2, 값3} 으로 해야함

values()메소드
values() 메소드는 열거 타입의 모든 열거 객체들을 배열로 만들어 리턴

```
예시
```

## Running the tests / 테스트의 실행

어떻게 테스트가 이 시스템에서 돌아가는지에 대한 설명을 합니다

### 테스트는 이런 식으로 동작합니다

왜 이렇게 동작하는지, 설명합니다

```
예시
```

### 테스트는 이런 식으로 작성하시면 됩니다

```
예시
```

## Deployment / 배포

Add additional notes about how to deploy this on a live system / 라이브 시스템을 배포하는 방법

## Built With / 누구랑 만들었나요?

* [이름](링크) - 무엇 무엇을 했어요
* [Name](Link) - Create README.md

## Contributiong / 기여

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us. / [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) 를 읽고 이에 맞추어 pull request 를 해주세요.

## License / 라이센스

This project is licensed under the MIT License - see the [LICENSE.md](https://gist.github.com/PurpleBooth/LICENSE.md) file for details / 이 프로젝트는 MIT 라이센스로 라이센스가 부여되어 있습니다. 자세한 내용은 LICENSE.md 파일을 참고하세요.

## Acknowledgments / 감사의 말

* Hat tip to anyone whose code was used / 코드를 사용한 모든 사용자들에게 팁
* Inspiration / 영감
* etc / 기타
