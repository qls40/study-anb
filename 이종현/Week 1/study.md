Week 1 (2019/04/22~04/28)
=====

###### https://www.evernote.com/shard/s229/client/snv?noteGuid=7711f148-fbd8-4143-bd5a-38d7ad2ae98c&noteKey=9fdd6b5b071c8edb309c8833cdf73642&sn=https%3A%2F%2Fwww.evernote.com%2Fshard%2Fs229%2Fsh%2F7711f148-fbd8-4143-bd5a-38d7ad2ae98c%2F9fdd6b5b071c8edb309c8833cdf73642&title=1%25EC%25A3%25BC%25EC%25B0%25A8

## 1. 기호의 발음
> 개발중 자주 접할 수 있는 특수문자 및 기호에 대한 학습
> https://ascii.cl/htmlcodes.htm 목록 참조

-  `공백`
    - space
    - 말그대로 공백, 띄어쓰기

-  `!` (느낌표)
    - exclamation point
    - 일반 문장에서는 주로 강조격의 의미로 쓰인다.
    - 개발에서는 주로 부정연산자로 쓰인다.
    
-  `"` (쌍따음표)
    - double quotes
    - 문자열(String)을 입력할때 주로 사용한다.


-  `'` (따음표)
    - single quote
    - 단일문자(char)을 입력할때 주로 사용한다.

-  `#` (따음표)
    - number sign
    - 숫자의 포맷을 정해줄때 사용(?)

-  `$` (달러)
    - dollar sign
    - JSP에서 EL(Expression Language)로 많이사용
        - ex) ${param.object}
    - javascript 라이브러리인 Jquery에서는 Jquery를 의미하기도 한다.
        - ex)

        ```javascript
        $(function() {

        });    
         ```
-  `%` (퍼센트)
    - percent sign
    - 나누기의 나머지를 구하는 연산자로 사용
    - %d, %f, %s 와같이 format()메소드에서 포맷지정 하는 기호(?)로 사용
    - 줄바꿈 할때 %n 사용
        - ex)
        ```java
            System.out.format("나머지: %d%n", 19 % 2);
        ```

- `&` (앤드)
    - ampersand
    - 비트연산자 AND 로 사용

- `(` (여는 괄호)
    - opening parenthesis

- `)` (닫는 괄호)
    - closing  parenthesis

- `*` (별/애스터리스크)
    - asterisk
    - 곱하기 연산자로 사용
    - 와일드 카드로서 임의의 문자열에 대응
        - ex) com.test.pakage.* / *.txt

- `+` (플러스/더하기)
    - plus sign
    - 더하기 연산자로 사용
    - 숫자를 연산하거나 문자의 결합으로 사용

- `,` (콤마)
    - comma
    - 구분자로 사용
        - ex) 
        ```java
        testMethod("string", 2, Class);
        ```

- `-` (마이너스)
    - minus sign, hyphen
    - 빼기 연산자로 사용

- `.` (마침표)
    - period, dot

- `/` (슬래쉬)
    - slash
    - 나누기 연산자로 사용

- `:` (콜론)
    - colon
    - 삼항연산자, for-each, while 문 등에 사용

- `;` (세미콜론)
    - semicolon
    - 코드(구문), 선언의 끝을 의미

- `<` (lt)
    - less than sign
    - 비교연산자(비교대상 보다 작다)로 사용

- `=` (이퀄)
    - equal sign
    - 대입 연산자로 사용
        - ex) int a = 1;
    - 2개 붙이면 비교연산자
        - ex) 2 == 2

- `>` (rt)
    - greater than sign
    - 비교연산자(비교대상 보다 크다)로 사용

- `?` (물음표)
    - question mark
    - 삼항연산자에서 사용

- `@` (골뱅이)
    - at symbol
    - 어노테이션으로 사용
    

## 2. 캐릭터셋

>개발하면서 흔히 접할 수 있는 캐릭터셋을 요약하고
주로 사용하는 통합 개발 환경(IDE)에서 어떻게 캐릭터셋을 설정하고 유의해야 할 사항들을 정리.
-  `ASCII(American Standard Code for Information Interchange)`
    - 최초의 문자 집합
    - 총 127개 문자(제어 문자, 특수 문자, 숫자, 알파벳 등)로 이루어져 있다.
    - 유럽같은 경우에는 일부 문자를 표현할 수 없어서 이를
확장하여 총 256개까지 표현가능한 `Extended ASCII` 를 정의하여 `ISO-8859` 인코딩 방식을 유럽 통일 표준안으로 제정되었다.


- 한글의 표현방법과 인코딩
    - 한글을 표현하는 방법에는 크게 조합형과 완성형으로 나눌 수 있다.
        - 여기서 조합형이라는 것은 초성, 중성, 종성에 각각 코드를 할당하는 방식.
        - 완성형은 완성된 문자에 코드를 할당하는 방식이다.
        - 이 중 완성형이 한글 표준안으로 채택되었다.
    - 대표적인 한글 문자 인코딩 방식은 `EUC-KR`(2,350자 표현 가능)과 `CP949(MS949)`(11,172자 한글 표현 가능) 이다.

- `유니코드(Unicode)`
    - 한글, 중국어, 일본어 각각 해당 언어를 표현할 수 있는 독자적인 문자 집합을 동시에 표현하는 것을
    - 해결하기 위해서 전 세계적으로 사용되는 모든 문자 집합을 하나로 모아 `유니코드`를 탄생시켰다.
    - 값을 나타내기 위해 코드 포인트(code point)를 사용하는데, 보통 U+를 붙여 표시한다.
        - 예를 들어, 'A'의 유니코드 값은 U+0041로 표현한다.
    - `UTF-8`, `UTF-16`, `UTF-32`등의 인코딩이 있고
이 중 `ASCII`와 호환이 가능하면서 유니코드를 표현할 수 있는 `UTF-8` 인코딩이 가장 많이 사용된다.

그래서 IDE에서 보통 UTF-8로 설정하여 사용한다.

eclipse를 예로 들면 설정창에서 encdoing을 검색하여
text content Type과 Web File, XML File등을 모두 UTF-8로 변경한다.

Web경우 JSP에서도 변경, Web.xml에서 펄터를 이용하여 인코딩 필터를 UTF-8로 적용해준다.

## 3. 부동 소수점

>float는 소수점이 있는 실수 데이터를 저장할 수 있는 타입입니다.
>부동소수점 방식의 특징과 부동소수점이 가진 단점을 보완할 수 있는 방법을 코드로 작성.

부동 소수점은 넓은 범위의 수에 대해 정확한 근사치를 빨리 산출하기 위해 설계되었다.

그러나 정확한 결과를 제공하지 않으므로, 근사치가 아닌 정확한 결과가 필요한 곳에 사용하면 안된다.
float 과 double 타입은 돈 계산에는 특히 부적당하다.

JAVA에서는 정확한 값을 구하려면 BigDecimal, int, long 타입 중 하나를 사용해야 한다.

- 부정확한 값 예시
```java
double num1 = 704.1;
double num2 = 285.3;
		
//704.1 + 285.3 = 989.4 원하는 게산과 결과
double result = num1 + num2; 

//실행 결과 : 989.4000000000001
System.out.println(result); 
```

- `BigDecimal`
    - 단점
        - 기본 데이터 타입을 사용할 떄보다 불편하다.
        - 실행 속도가 느려진다.
    - 사용 예시
    ```java
    BigDecimal b1 = new BigDecimal("704.1");
    BigDecimal b2 = new BigDecimal("285.3");

    BigDecimal result = b1.add(b2);
    System.out.println(result); //실행 결과 : 989.4

    /*double형 생성자를 이용하면 정확한 값이 안나온다.
    String 생성자를 이용해야한다.
    아래와 같이 valueOf()를 이용할 수 도있다.*/
    BigDecimal b3 = new BigDecimal.valueOf(704.1);
    BigDecimal b4 = new BigDecimal.valueOf(285.3);

    BigDecimal result2 = b3.add(b4);
    System.out.println(result2); //실행 결과 : 989.4

    ```

- `int, long`
    - 소숫점을 없앤 형태로 계산.
    - 사용 예시
    ```java
    //int num1 = 1;
    //double num2 = 0.9;
    //double resut = num1 - num2; //결과는 0.09999999999999998
    //System.out.println(resut);

    int num1 = 1;
    double numS1ize = num2*10;
    int num2 = 9;
    int tmep = numSize - num2;
    double resut = temp / 10.0;
    
    System.out.println(resut); //결과는 0.1
    ```

## 4. 증감연산자

>증감연산자 ++와 —가 변수의 앞에 위치할 때와 뒤에 위치할 때의 차이를 확인할 수 있는 코드를 작성.

- `전위 연산자`
    - 증감 연산자를 변수 앞에 사용한 것.
        - ex) `--x`, `++x`
    - ex)
    ```java
    int num1 = 3;
    int num2 = 3;
    int result1, result2;

    result1 = ++num1; //값을 1 증가시킨 후 result1에 할당
    result2 = --num2; //값을 1 감소시킨 후 result2에 할당

    System.out.printf("%d %d", result1, result2); //결과는 4 2
    System.out.printf("%d %d", num1, num2); //결과는 4 2
    ```
    

- `후위 연산자`
    - 증감 연산자를 변수 뒤에 사용한 것.
        - ex) `x--`, `x++`
    - ex)
    ```java
    int num1 = 3;
    int num2 = 3;
    int result1, result2;

    result1 = num1++; //result1에 할당 후 값을 1 증가
    result2 = num2--; //result2에 할당 후 값을 1 감소

    System.out.printf("%d %d", result1, result2); //결과는 3 3
	System.out.printf("%d %d", num1, num2); //결과는 4 2
    ```

- 종합 예제

    ```java
    int num1 = 3;
    int num2 = 3;
    int result1, result2;

    result1 = ++num1 + 10;
    result2 = num2-- + 10;

    
    System.out.printf("전위 증가 연산자 결과 값 : %d\n", result1); //전위 증가 연산자 결과 값 : 14
    
    System.out.printf("num1 값 :  : %d\n", num1); //num1 값 : 4

    System.out.printf("후위 감소 연산자 결과 값 : %d\n", result2); //후위 증가 연산자 결과 값 : 13

    System.out.printf("num2 값 : %d\n", num2); //num2 값 : 2
    ```
## 5. 논리 연산

>논리곱(&), 논리합(|), 조건부 논리곱(&&), 조건부 논리합(||)의 차이점을 코드로 작성합니다.
작성된 코드로 조건부 논리곱과 조건부 논리합 만을 사용하는 이유를 찾기.


- `|(논리합)`
    - 두 비트 중 하나라도 1이면 연산 결과 1
        - ex) 00010101 | 00001001 => 00011101
- `&(논리곱)`
    - 두 비트 모두 1인 경우에만 연산 결과 1
        - ex) 00010101 & 00001001 => 00000001

- `||(조건부 논리합)`
    - 조건중 하나라도 true인 경우에 true를 반환한다.
- `&&(조건부 논리곱)`
    - 조건이 모두 true인 경우에만 true를 반환, 나머지 경우에는 false를 반환한다.

```java
/*
&(논리곱)과 &&(조건부 논리곱)의 차이점은
논리곱의 경우에는 무조건 두개의 조건을 다 수행하지만
조건부 논리곱의 경우에는 앞의 조건이 false인 경우에 뒤의 조건은 수행하지 않는다.

|(논리합)과 ||(조건부 논리합)의 경우
논리합은 논리곱과 마찬가지로 무조건 두개의 조건을 다 수행.
조건부 논리곱은 반대로 앞조건이 true인 경우에 뒤의 조건은 수행하지 않는다.
*/
int num1 = 1;
int num2 = 2;

if(num1==num2 & ++num1==num2) {
    System.out.println("true");
}
else {
    System.out.println("false");
}
System.out.println(num1); //2
System.out.println(num2); //2 (증감연산자에 의해 1증가된 값 출력)


int num3 = 3;
int num4 = 4;

if(num1==num2 && ++num1==num2) {
    System.out.println("true");
}
else {
    System.out.println("false");
}
System.out.println(num3); //3
System.out.println(num4); //4 (뒤 조건이 실행되지 않아 4그대로 출력)
```
## 6. 객체 생성

>new 키워드를 이용하여 인스턴스화 할 수 있으며 이렇게 인스턴스화하여 생성한 개체를 인스턴스라 합니다.
이 인스턴스는 메모리 힙 영역으로 할당되어 참조 주소가 생성되며 가비지 콜렉터에 의해 최종 소멸 됩니다.

>new 키워드를 이용하여 인스턴스화하는 코드를 작성해보고 작성된 코드 조각 하나하나를 풀어 한글로 설명해 봅니다.

```java
Study test = new study();

/*
Study : 클래스(객체)
test : 객체변수명 참조 값이 저장됨.
new : 인스턴스 생성, 메모리(Heap영역)에 할당, 객체에 참조값을 리턴해줌
Study() : 생성자 호출
*/
```
## 7. 반복문(while, do while, for, foreach)

>Java에는 다양한 반복문이 존재하며 차이가 있지만 반복문이라는 용어처럼 반복적인 작업을 구현할 때 작성하게 됩니다.
반복문들의 차이점을 코드로 표현하고 읽기 좋은 코드 관점으로 보았을 때 어떤 반복문이 가장 큰 이점을 가지고 있는지 설명해 봅니다.
```java
for(int i=0; i<10; i++){
    System.out.println((i+1)+"번째 for문");
}

int i=0;
while (i < 10) {
    System.out.println((i+1)+"번째 while문");
    i++;
}
System.out.println("while 종료후" + i);


int j=0;
do {
    System.out.println((j+1)+"번째 while문");
    j++;
} while (j < 10);
System.out.println("do~ while 종료후" + j);
/*
for 문은 특정한 범위를 가진 loop에 이용.
while 문은 조건에 만족하는 결과를 얻기 위한 loop에 이용된다.
do~ while의 경우 조건에 만족하던 안하던 일단 do 블럭에 있는 코드를 1회 실행.
*/

for(Element e : elements){
    ...
}

/*for-each 향상된 for문(enhanced for statement)를 사용해야하는 이유.
반복자와 인덱스 변수를 사용하지 않아서 코드가 깔끔해지고 오류가 날 일이 없어진다...
하지만 for-each를 사용할 수 없는 경우도 있다.
1. 값을 변경하거나 삭제 할때.
2. 병렬적인 반복일 때.
/*
```


## 8. final 키워드

>final 키워드를 사용할 때 클래스, 메서드, 변수에 따라 각기 다른 성격을 가집니다.
이에 대한 이해를 할 수 있는 코드를 작성해 봅니다.
final 키워드를 사용할 때 Thread와의 관계는 이번 단계에서는 다루지 않아도 됩니다.

- `final Class`
    - 상속 불가, 자식 클래스를 만들 수 없음
```java
//클래스에 final 키워드
public final class Study {
    public String name;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
```

- `final Method`
    - Override 불가
```java
public class Study {
    public String name;

    public void setName(String name) {
        this.name = name;
    }
    //메소드에 final 키워드
    public final String getName() {
        return name;
    }
}
```

- `final variables`
    - 변수 선언과 동시에 초기화
    - 값을 변경 할 수 없음.
```java
static final double PI = 3.14;
```