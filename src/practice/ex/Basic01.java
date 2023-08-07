package practice.ex;

import java.util.ArrayList;

public class Basic01 {
	public static void main(String[] args) {
		// 1. 다음 출력과는?
		
		int [] values = {1,2,3,4};
		int param1, param2;
		param1 = values[0] < values[1] ? values[1] : values[0];
		System.out.println(param1);
		//2
		int [][][] arr3 = {{{1,2,3}, {4,5,6}}, {{7,8,9},{10,11,12}}};
		System.out.println(arr3[0][1][0]);
		
		int []arr1 = {0,1,2,3,4};
		int [][]arr2 = {{1,2,3,},{5,8,12},{9,23}};
		
		//3
		String [] data = {"팽수","길수","수잔","수촨","길동","동길","호섭"};
		int cnt = 0;
		for(int i =0; i < data.length; i++) {
			if(data[i].indexOf("수") >= 0) {
				cnt++;
			}
		}
		System.out.println("수가 포함된 이름의 수는:" + cnt);
		// 아래 배열에서 짝수의 개수를 카운팅 하시오
		int [] arr = {1,2,3,4,5,6,7,8,9,12,13,16,19};
		int count = 0 ; 
		for(int num : arr) {
			if(num % 2 == 0) {
				count++;
			}
		}
		System.out.println("작쑤는:" + count);
		System.out.println(data[0].indexOf("수"));
		
		/*
		 * ### Java 언어의 특징
		 * 
		 * 1. **플랫폼 독립성:** Java는 "한 번 작성하면 어디에서나 실행할 수 있다(Write Once, Run Anywhere)"는
		 * 특징을 가지고 있습니다. Java로 작성된 프로그램은 Java Virtual Machine(JVM)에서 실행되므로, JVM이 설치된 모든
		 * 플랫폼에서 동일하게 실행될 수 있습니다.
		 * 
		 * 2. **객체 지향 언어:** Java는 완전한 객체 지향 언어입니다. Java에서는 클래스와 객체를 이용하여 코드를 구조화하고, 상속,
		 * 캡슐화, 다형성 등의 객체 지향 개념을 지원합니다.
		 * 
		 * 3. **안전성:** Java는 안전성을 위한 여러 가지 체크 메커니즘을 제공합니다. 예를 들어, 포인터를 직접 조작할 수 없으며, 메모리
		 * 관리는 가비지 컬렉터에 의해 자동으로 처리됩니다.
		 * 
		 * 4. **다양한 API:** Java는 다양한 용도의 프로그래밍을 지원하는 풍부한 API를 제공합니다. GUI 프로그래밍, 데이터베이스
		 * 연동, 네트워킹 등에 필요한 클래스와 인터페이스가 제공됩니다.
		 * 
		 * 5. **다중 스레드 지원:** Java는 다중 스레드를 쉽게 구현할 수 있는 방법을 제공합니다. 이를 통해 복잡한 동시성 작업을 쉽게
		 * 처리할 수 있습니다.
		 * 
		 * ### Java 개발환경 구축하기
		 * 
		 * Java 언어로 개발하기 위해서는 몇 가지 필요한 도구와 환경 설정이 필요합니다. 여기서는 Java Development Kit(JDK)를
		 * 설치하고, 환경 변수를 설정하는 과정을 설명하겠습니다.
		 * 
		 * 1. **JDK 설치:** JDK(Java Development Kit)는 Java 개발에 필요한 컴파일러와 라이브러리 등을 포함하고
		 * 있습니다. Oracle 공식 웹사이트나 OpenJDK 웹사이트에서 운영체제에 맞는 JDK를 다운로드하여 설치합니다.
		 * 
		 * 2. **환경 변수 설정:** 설치한 JDK를 시스템에서 사용할 수 있도록 환경 변수를 설정합니다. PATH 환경 변수에 JDK의
		 * 'bin' 디렉토리 경로를 추가합니다.
		 * 
		 * 3. **설치 확인:** 설치가 제대로 되었는지 확인하기 위해, 커맨드 라인(터미널)에서 `java -version` 명령어를
		 * 입력해봅니다. 설치한 Java의 버전 정보가 제대로 출력되면 성공적으로 설치된 것입니다.
		 * 
		 * 4. **통합개발환경(IDE) 설치:** Java 개발을 보다 편리하게 할 수 있는 통합개발환경(IDE)을 설치합니다. IntelliJ,
		 * Eclipse, NetBeans 등이 있습니다.
		 * 
		 * 이렇게 하면 기본적인 Java 개발환경이 준비됩니다. 이제 Java 코드를 작성하고, 컴파일하고, 실행하는 등의 작업을 할 수 있습니다.
		 * 
		 * ### Java의 기본 타입과 참조 타입
		 * 
		 * Java는 두 가지 주요 데이터 타입을 가지고 있습니다: 기본 타입(primitive types)과 참조 타입(reference
		 * types).
		 ** 
		 * 기본 타입**은 자바가 미리 정의하고 제공하는 타입으로, 실제 값을 저장합니다. Java에는 8개의 기본 타입이 있습니다:
		 * 
		 * 1. 정수 타입: `byte`, `short`, `int`, `long` 
		 * 2. 부동소수점 타입: `float`, `double` 
		 * 3. 문자타입: `char` 
		 * 4. 논리 타입: `boolean`
		 ** 
		 * 참조 타입은 객체의 주소를 참조하는 타입으로, `클래스`, `인터페이스`, `배열` 등이 있습니다. 참조 타입의 변수는 실제 데이터
		 * 대신 데이터의 주소를 저장합니다. 객체는 힙 메모리 영역에 생성되며, 변수는 이 객체의 메모리 주소를 저장합니다.
		 * 
		 * ### Java Casting
		 * 
		 * Java에서 캐스팅은 한 타입의 값을 다른 타입으로 변환하는 과정을 의미합니다. 캐스팅은 기본 데이터 타입과 참조 타입 둘 다에서 사용할
		 * 수 있습니다.
		 * 
		 * 1. **기본 데이터 타입 캐스팅:**
		 * 
		 * 1. **자동(묵시적) 캐스팅:** 작은 크기의 타입이 큰 크기의 타입으로 변환될 때는 자동적으로 캐스팅이 이루어집니다. 데이터 손실이
		 * 없기 때문에 Java 컴파일러가 이를 자동으로 처리합니다.
		 * 
		 * ```java int myInt = 9; 
		 * double myDouble = myInt; 
		 * // 자동 캐스팅: int -> double
		 * 
		 * System.out.println(myInt); // 출력: 9 System.out.println(myDouble); // 출력: 9.0
		 * ```
		 * 
		 * 2. **강제(명시적) 캐스팅:** 반대로, 큰 크기의 타입을 작은 크기의 타입으로 변환할 때는 강제적으로 캐스팅을 해야 합니다. 이때
		 * 데이터 손실의 가능성이 있기 때문에 개발자가 명시적으로 이를 수행해야 합니다.
		 * 
		 * ```java double myDouble = 9.78; int myInt = (int) myDouble; // 강제 캐스팅: double
		 * -> int
		 * 
		 * System.out.println(myDouble); // 출력: 9.78 System.out.println(myInt); // 출력: 9
		 * ```
		 * 
		 * 2. **참조 타입 캐스팅:**
		 * 
		 * 참조 타입에서의 캐스팅은 객체 지향 프로그래밍의 특성을 활용합니다. 슈퍼클래스 타입을 서브클래스 타입으로, 또는 서브클래스 타입을
		 * 슈퍼클래스 타입으로 캐스팅할 수 있습니다.
		 * 
		 * ```java // 슈퍼클래스 타입을 서브클래스 타입으로 캐스팅 Animal myAnimal = new Dog(); Dog myDog =
		 * (Dog) myAnimal;
		 * 
		 * // 서브클래스 타입을 슈퍼클래스 타입으로 캐스팅 Dog myDog = new Dog(); Animal myAnimal = myDog;
		 * ```
		 * 
		 * 이렇게 캐스팅을 사용하면 다양한 타입 간의 변환을 수행할 수 있으며, 객체 지향 프로그래밍의 다형성을 실현할 수 있습니다.
		 * 
		 * ### Java 스코프 (Scope)
		 * 
		 * 스코프(scope)는 변수가 존재하고 접근 가능한 범위를 의미합니다. Java에서 스코프는 변수가 선언된 위치에 따라 결정됩니다. 주요
		 * 스코프 종류는 다음과 같습니다:
		 * 
		 * 1. **블록 스코프(Block Scope)**: 중괄호 `{}` 안에서 선언된 변수는 해당 블록 내부에서만 접근 가능합니다. 이 범위는
		 * `if`, `for`, `while` 등의 제어 구조 블록, 또는 메소드와 생성자의 본문을 포함합니다.
		 * 
		 * ```java { int x = 10; // 이 블록 내에서만 'x'에 접근 가능 System.out.println(x); // 가능 }
		 * System.out.println(x); // 불가능 ```
		 * 
		 * 2. **메소드 스코프(Method Scope)**: 메소드 매개변수는 메소드 내부에서만 접근할 수 있습니다.
		 * 
		 * ```java void myMethod(int parameter) { System.out.println(parameter); // 가능 }
		 * System.out.println(parameter); // 불가능 ```
		 * 
		 * 3. **클래스 스코프(Class Scope)**: 클래스 내부에 선언된 변수(필드)는 해당 클래스의 모든 메소드에서 접근할 수 있습니다.
		 * 
		 * ```java public class MyClass { int x = 10; // 클래스 필드
		 * 
		 * void myMethod() { System.out.println(x); // 가능 } } ```
		 * 
		 * 4. **전역 스코프(Global Scope)**: Java에서는 전역 변수를 지원하지 않지만, `static` 변수는 비슷한 역할을
		 * 합니다. `static` 변수는 해당 클래스의 모든 인스턴스에서 공유되며, 클래스 이름을 통해 어디에서나 접근할 수 있습니다.
		 * 
		 * ```java public class MyClass { static int x = 10; // static 변수
		 * 
		 * void myMethod() { System.out.println(MyClass.x); // 가능 } } ```
		 * 
		 * 이렇게 스코프를 이해하고 활용하면 변수의 접근 범위를 제어하고 코드의 가독성과 유지 보수성을 향상시킬 수 있습니다.
		 * 
		 * ### Java 증감 연산자
		 * 
		 * 증감 연산자는 변수의 값을 1씩 증가(`++`)하거나 감소(`--`)하는 데 사용됩니다. 이 연산자는 변수 앞에 또는 뒤에 올 수 있으며,
		 * 이에 따라 동작이 약간 다릅니다.
		 * 
		 * 1. **전위 증감 연산자 (Prefix Increment/Decrement Operator):** 변수 앞에 오는 증감
		 * 연산자(`++variable`, `--variable`)는 변수의 값을 먼저 변경하고, 그 값을 평가합니다.
		 * 
		 * ```java int num = 5; System.out.println(++num); // 출력: 6
		 * System.out.println(--num); // 출력: 5 ```
		 * 
		 * 2. **후위 증감 연산자 (Postfix Increment/Decrement Operator):** 변수 뒤에 오는 증감
		 * 연산자(`variable++`, `variable--`)는 변수의 값을 평가한 후에, 그 값을 변경합니다.
		 * 
		 * ```java int num = 5; System.out.println(num++); // 출력: 5
		 * System.out.println(num--); // 출력: 6 ```
		 * 
		 * ### Java 대입 연산자
		 * 
		 * 대입 연산자(`=`)는 오른쪽 피연산자의 값을 왼쪽 피연산자에 할당합니다. Java에는 기본 대입 연산자 외에도 여러 복합 대입
		 * 연산자(`+=`, `-=`, `*=`, `/=`, `%=`, `&=`, `|=`, `^=`, `>>=`, `<<=`, `>>>=`)가
		 * 있습니다.
		 * 
		 * 1. **기본 대입 연산자 (Assignment Operator):**
		 * 
		 * ```java int num = 5; ```
		 * 
		 * 2. **복합 대입 연산자 (Compound Assignment Operators):** 복합 대입 연산자는 연산과 대입을 한 번에
		 * 수행합니다.
		 * 
		 * ```java int num = 5;
		 * 
		 * num += 2; // 같음: num = num + 2; num은 이제 7 num -= 2; // 같음: num = num - 2;
		 * num은 이제 5 num *= 2; // 같음: num = num * 2; num은 이제 10 num /= 2; // 같음: num =
		 * num / 2; num은 이제 5 num %= 2; // 같음: num = num % 2; num은 이제 1 ```
		 * 
		 * 이렇게 증감 연산자와 대입 연산자를 이용하면 값을 효과적으로 변경하고 할당할 수 있습니다.
		 * 
		 * ### Java For문 실행 순서
		 * 
		 * Java의 for문은 주어진 조건이 만족하는 동안 일련의 명령을 반복해서 실행하는 데 사용됩니다. for문의 기본 구조는 다음과 같습니다:
		 * 
		 * ```java for (초기화; 조건문; 후처리) { // 반복할 명령 } ```
		 * 
		 * 1. **초기화 (Initialization):** for문이 시작될 때 한 번만 실행됩니다. 이 부분에서 반복을 위한 변수를 선언하고
		 * 초기화합니다.
		 * 
		 * 2. **조건문 (Condition):** 각 반복에서 조건을 평가하고, 결과가 `true`일 경우 반복을 계속하고, `false`일 경우
		 * 반복을 종료합니다.
		 * 
		 * 3. **반복할 명령 (Statement):** 조건문이 `true`를 반환하면 이 부분의 코드가 실행됩니다.
		 * 
		 * 4. **후처리 (Post-Iteration):** 반복할 명령이 실행된 후에 실행되며, 대부분 반복 변수를 증가 또는 감소하는 데
		 * 사용됩니다. 그 후에는 조건문으로 돌아가서 조건을 다시 평가합니다.
		 * 
		 * 이러한 실행 순서를 적용한 for문의 예제는 다음과 같습니다:
		 * 
		 * ```java for (int i = 0; i < 5; i++) { System.out.println("Hello, world!"); //
		 * "Hello, world!"를 5번 출력 } ```
		 * 
		 * 이 예제에서 `int i = 0`이 초기화 부분, `i < 5`가 조건문, `i++`가 후처리 부분, 그리고
		 * `System.out.println("Hello, world!");`가 반복할 명령입니다. 이 for문은 "Hello, world!"를
		 * 5번 출력합니다.
		 * 
		 * ### Java 메소드
		 * 
		 * Java에서 메소드는 특정 작업을 수행하는 코드의 집합입니다. 메소드는 코드를 재사용하고 코드의 구조를 명확하게 하는 데 도움이 됩니다.
		 * 
		 * 메소드의 기본 구조는 다음과 같습니다:
		 * 
		 * ```java 접근제어자 반환타입 메소드명(매개변수) { // 메소드 바디 // 수행할 작업 return 반환값; } ```
		 * 
		 * 1. **접근제어자 (Access Modifier):** 메소드에 접근할 수 있는 범위를 지정합니다 (`public`, `private`,
		 * `protected`, 아무것도 없음).
		 * 
		 * 2. **반환타입 (Return Type):** 메소드가 반환하는 값의 데이터 타입을 지정합니다. 반환값이 없는 경우 `void`를
		 * 사용합니다.
		 * 
		 * 3. **메소드명 (Method Name):** 메소드를 호출할 때 사용하는 이름입니다.
		 * 
		 * 4. **매개변수 (Parameter):** 메소드가 받는 입력을 지정합니다. 매개변수는 선택 사항이며, 하나 이상일 수 있습니다.
		 * 
		 * 5. **메소드 바디 (Method Body):** 중괄호 `{}`로 둘러싸인 부분이며, 메소드의 작업을 정의하는 코드를 포함합니다.
		 * 
		 * 6. **반환값 (Return Value):** `return` 키워드를 사용하여 메소드의 결과를 반환합니다.
		 * 
		 * 아래에 메소드의 간단한 예제를 제공하겠습니다:
		 * 
		 * ```java public class Main { // 접근제어자는 public, 반환타입은 int, 메소드명은 add, 매개변수는 int
		 * 타입의 a와 b public static int add(int a, int b) { int result = a + b; return
		 * result; // 반환값 }
		 * 
		 * public static void main(String[] args) { int sum = add(5, 3); // 메소드 호출
		 * System.out.println(sum); // 출력: 8 } } ```
		 * 
		 * 이 예제에서 `add` 메소드는 두 정수의 합을 계산하고 그 결과를 반환합니다. `main` 메소드에서 `add` 메소드를 호출하고 그
		 * 결과를 출력합니다.
		 * 
		 * ### Java 배열의 특징과 사용법
		 * 
		 * 배열은 같은 타입의 여러 변수를 하나의 이름으로 그룹화하여 관리하는 데이터 구조입니다.
		 * 
		 * 1. **고정된 크기:** 배열의 크기는 선언 시에 결정되며, 이후로 변경할 수 없습니다.
		 * 
		 * 2. **동일한 데이터 타입:** 배열의 모든 요소는 동일한 데이터 타입이어야 합니다.
		 * 
		 * 배열을 선언하고 초기화하는 방법은 다음과 같습니다.
		 * 
		 * ```java // 선언 int[] arr;
		 * 
		 * // 초기화 arr = new int[10];
		 * 
		 * // 선언과 초기화를 동시에 int[] arr = new int[10];
		 * 
		 * // 값으로 초기화 int[] arr = {1, 2, 3, 4, 5}; ```
		 * 
		 * 배열의 각 요소는 인덱스를 사용하여 접근할 수 있으며, 인덱스는 0부터 시작합니다.
		 * 
		 * ```java arr[0] = 1; // 배열의 첫 번째 요소에 1을 할당 int x = arr[0]; // 배열의 첫 번째 요소를 x에
		 * 할당 ```
		 * 
		 * ### Java 컬렉션: ArrayList, HashMap, HashSet
		 ** 
		 * ArrayList**
		 * 
		 * `ArrayList`는 동적 배열을 구현한 클래스입니다. 배열과 달리 `ArrayList`는 크기가 동적으로 변화하며, 객체만을 요소로
		 * 가집니다.
		 * 
		 * ```java ArrayList<String> list = new ArrayList<String>(); list.add("Java");
		 * // 요소 추가 String item = list.get(0); // 요소 접근 ```
		 ** 
		 * HashMap**
		 * 
		 * `HashMap`은 키-값 쌍을 저장하는 데 사용되는 자료구조입니다. 각 키는 유일해야 하며, 하나의 키는 하나의 값을 가리킵니다.
		 * 
		 * ```java HashMap<String, Integer> map = new HashMap<String, Integer>();
		 * map.put("Apple", 1); // 요소 추가 int value = map.get("Apple"); // 요소 접근 ```
		 ** 
		 * HashSet**
		 * 
		 * `HashSet`은 유일한 요소를 저장하는 데 사용되는 자료구조입니다. 중복된 요소를 허용하지 않으며, 요소의 순서를 유지하지 않습니다.
		 * 
		 * ```java HashSet<String> set = new HashSet<String>(); set.add("Java"); // 요소
		 * 추가 boolean isExists = set.contains("Java"); // 요소 확인 ```
		 * 
		 * ### Java 클래스와 인스턴스
		 ** 
		 * 클래스**는 객체 지향 프로그래밍의 중요한 요소로, 객체의 상태와 행동을 정의하는 데 사용되는 템플릿입니다. 클래스는 멤버 변수(상태)와
		 * 메소드(행동)를 가질 수 있습니다.
		 * 
		 * ```java public class Car { String color; // 멤버 변수
		 * 
		 * void drive() { // 메소드 // 코드 } } ```
		 ** 
		 * 인스턴스**는 클래스의 구체적인 예입니다. 클래스는 설계도와 같으며, 이 설계도를 기반으로 생성된 각 객체를 인스턴스라고 합니다
		 * 
		 * .
		 * 
		 * ```java Car car = new Car(); // Car 클래스의 인스턴스 생성 ```
		 * 
		 * 인스턴스는 클래스에 정의된 멤버 변수와 메소드를 가집니다. 각 인스턴스는 독립적인 상태를 가지며, 하나의 인스턴스의 상태가 다른 인스턴스에
		 * 영향을 주지 않습니다.
		 * 
		 * ### Java 상속과 추상 클래스
		 ** 
		 * 상속**은 부모 클래스의 속성과 메소드를 자식 클래스가 받아 사용할 수 있는 객체 지향 프로그래밍의 특징입니다. 이를 통해 코드의
		 * 재사용성이 증가하며, 코드의 구조화가 가능해집니다. Java에서는 `extends` 키워드를 사용하여 상속을 구현합니다.
		 * 
		 * ```java public class Car { // 코드 }
		 * 
		 * public class SportsCar extends Car { // Car 클래스의 모든 멤버를 상속받음 } ```
		 ** 
		 * 추상 클래스**는 하나 이상의 추상 메소드를 포함하는 클래스입니다. 추상 메소드는 선언만 있고 구현은 없는 메소드를 말하며, 이 메소드의
		 * 구현은 서브 클래스에서 담당합니다. 추상 클래스는 `abstract` 키워드를 사용하여 선언하며, 인스턴스를 직접 생성할 수 없습니다.
		 * 
		 * ```java public abstract class AbstractClass { abstract void abstractMethod();
		 * // 추상 메소드 } ```
		 * 
		 * 이를 상속하는 서브 클래스는 반드시 추상 메소드를 구현해야 합니다.
		 * 
		 * ```java public class SubClass extends AbstractClass { void abstractMethod() {
		 * // 구현 코드 } } ```
		 * 
		 * ### Java 다형성 (Polymorphism)
		 * 
		 * Java에서 다형성은 객체 지향 프로그래밍의 주요 원칙 중 하나로, "많은 형태"라는 뜻입니다. 다형성을 이용하면, 하나의 변수 이름이나
		 * 함수를 사용하여 다양한 형태의 객체를 참조하거나 다룰 수 있습니다. Java에서 다형성은 주로 오버라이딩(Overriding)과
		 * 인터페이스(Interface)를 통해 실현됩니다.
		 * 
		 * 1. **메소드 오버라이딩 (Method Overriding):** 서브클래스에서 슈퍼클래스의 메소드를 재정의하는 것을 말합니다. 이를
		 * 통해 같은 메소드 호출이지만, 객체의 타입에 따라 다른 동작을 수행할 수 있습니다.
		 * 
		 * 2. **인터페이스 (Interface):** 인터페이스는 클래스가 어떤 동작을 해야 하는지를 지정하는 메소드 집합입니다. 인터페이스를
		 * 구현하는 클래스는 해당 인터페이스의 모든 메소드를 제공해야 합니다. 이를 통해 다양한 클래스가 같은 인터페이스를 구현하면, 같은 타입으로
		 * 취급될 수 있습니다.
		 * 
		 * 아래에 다형성을 보여주는 간단한 예제를 제공하겠습니다:
		 * 
		 * ```java // 슈퍼클래스 class Animal { public void makeSound() {
		 * System.out.println("The animal makes a sound"); } }
		 * 
		 * // 서브클래스 class Cat extends Animal {
		 * 
		 * @Override public void makeSound() { System.out.println("The cat meows"); } }
		 * 
		 * class Dog extends Animal {
		 * 
		 * @Override public void makeSound() { System.out.println("The dog barks"); } }
		 * 
		 * public class Main { public static void main(String[] args) { Animal myAnimal
		 * = new Animal(); Animal myCat = new Cat(); Animal myDog = new Dog();
		 * 
		 * myAnimal.makeSound(); // 출력: The animal makes a sound myCat.makeSound(); //
		 * 출력: The cat meows myDog.makeSound(); // 출력: The dog barks } } ```
		 * 
		 * 이 예제에서 `Animal`, `Cat`, `Dog` 모두 `makeSound` 메소드를 갖지만, 그 동작은 각 클래스에 따라 다릅니다.
		 * 이를 다형성이라 합니다.
		 * 
		 */
		int[] arrs = new int[10];
		System.out.println(arrs.length);
		ArrayList<String> testArray = new ArrayList<String>();
		char c = 63;
		double x = 5000;
		
		System.out.print(x);
		System.out.println(c);
		System.out.println("123\r");
		// 다국적 정세가 탄소중립으로 가고 있으면
		// 어떤 산업이 발달할까 -> 그러인해 어떤 주식이 반사이익으로 오를까.
		// 1차원적인 기업이 주가가 올라간다면 이미 그건 선반영되서 고가일가능성이 높음
		// 그래서 그로인해
	}
}
