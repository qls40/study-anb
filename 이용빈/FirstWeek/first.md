# First Week

## 1. 기호의 발음
  /는 slash라고 읽는 것을 다 알고 계실거에요. 그럼 “(쌍따옴표), &, * 기호 등 우리 개발하면서 흔히 접할 수 있는<br>
  기호들의 철자와 발음에 대해 학습합니다.<br>
  <br>

```

!  exclamation point
#  number sign
(  openning parenthesis
)  close parenthesis
*  asterisk
-  hyphen
:  colon
;  semi colon
<  less than sign
>  greater than sign
[  opening bracket
]  closing bracket
^  caret - circumflex
_  underscore
`  grave accent
{  opening brace
}  closing brace
|  vertical bar
~ equivalency sign


```

## 2. Character Set
  개발하면서 흔히 접할 수 있는 캐릭터셋을 요약하고 주로 사용하는 통합 개발 환경(IDE)에서<br>
  어떻게 캐릭터셋을 설정하고 유의해야 할 사항들을 정리합니다.<br>
  <br><br>

- 문자셋(Character Set) - 하나의 언어권에서 사용하는 언어를 표현하기 위한 모든문자의 모임
- 인코딩(Encoding) - 문자셋과 컴퓨터가 이해할 수 있는 바이트와의 매핑 규칙
- 현재 가장 많이 사용하는 인코딩 방식은 "UTF-8" 이다.
<br>

< Eclipse & Spring Framework>

1. 환경설정
```

  - Text Content Types 설정
    Windows -> Preferences -> General -> Content Type -> Default encoding: UTF-8 추가

  - Workspace Text file encoding 설정
    Windows -> Preferences -> General -> WorkSpace -> Text file encoding -> Other(UTF-8)

  - Web file encoding 설정
    Windows -> Preferences -> Web -> CSS Files, HTML Files, JSP Files 모두 UTF-8 설정

  - XML Files encoding 설정
    Windows -> Preferences -> XML -> XML Files -> Encoding : ISO 10646/Unlconde(UTF-8)

```

2. web.xml 인코딩 필터 Setting (서블릿과 통신시 Data encoding 설정)
```

    <Connector port="8080" URIEncoding="UTF-8" maxHttpHeaderSize="8192" maxThreads="150" minSpareThreads="25"
     maxSpareThreads="75" enableLookups="false" redirectPort="8443" acceptCount="100"
     connectionTimeout="20000" disableUploadTimeout="true" />

```
<br>

3. JSP 파일 최상단에 UTF-8 directive 추가
```
    <%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
```
<br>

4. Maven 사용시 UTF-8 설정

```

    <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-compiler-plugin</artifactId>
        <configuration>
            <source>1.5</source>
            <target>1.5</target>
            <encoding>UTF-8</encoding>
        </configuration>
    </plugin>

    <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-javadoc-plugin</artifactId>
            <configuration>
                    <charset>UTF-8</charset>
                    <docencoding>UTF-8</docencoding>
                    <encoding>UTF-8</encoding>
                    <quiet>true</quiet>
            </configuration>
    </plugin>     

    <plugin>
      <groupId>org.apache.maven.plugins</groupId>
      <artifactId>maven-pmd-plugin</artifactId>
      <version>2.4</version>
      <configuration>
        <sourceEncoding>utf-8</sourceEncoding>
        <targetJdk>1.5</targetJdk>
        <minimumTokens>10</minimumTokens>
      </configuration>
    </plugin>


```
<br>
**유의사항**
  <br>
    특정 플러그인 설치시 해당 플러그인에서 인코딩을 별도로 설정해줘야 한다.<br>
    Git등에서 파일을 클론하기전에 IDE의 인코딩 설정을 미리하여 한글깨짐을 방지한다.<br>
    HTML의 경우 head태그안에 페이지 언어셋이 utf-8임을 명시해야한다. <meta charset="utf-8"> <br>
  <br>

## 3. 부동 소수점
  float는 소수점이 있는 실수 데이터를 저장할 수 있는 타입입니다.<br>
  부동소수점 방식의 특징과 부동소수점이 가진 단점을 보완할 수 있는 방법을 코드로 작성해 봅니다.<br>
  <br><br>

```

/*
  부동소수점 특징 : 실수를 컴퓨터 상에서 근사하여 표현할때 소수점의 위치를 고정하지 않고
  그위치를 나타내는 수를 따로 적는 것
  유효숫자를 나타내는 가수와 소수점의 위치를 풀이하는 지수로 나누어 표현한다.

  float와 double을 이용해 계산할 경우 정확한 값을 계산할 수 없다.
  (대부분 십진 소수는 정확하게 이진소수로 표현될 수 없고 이진 부동 소수점 수로 근사된다.)
  float와 double의 기본자료형에 내포된 근사치 값 계산으로 정확한 수치 계산이 불가능하다.
  이는 java.meth 패키지내 BigDecimal 클래스를 사용하여 해결가능하며
  정확한 변환을 위해서는 문자열로 매개변수를 넣는다.
*/

package com.javalec.test;
import java.math.BigDecimal;
public class MainClass {

	public static void main(String[] args) {

		// double형 : 예상결과값 1.7 -> 실제값 1.7000000000000002

		double param1 = 1.6;
		double param2 = 0.1;
		System.out.println("실수 더하기 : " + (param1 + param2));
		System.out.println();

		// BigDecimal사용, 매개변수 double형 :  예상결과값 1.7 -> 실제값 1.7000000000000000943689570931383059360086917877197265625

		BigDecimal bigDecimalParam1 = new BigDecimal(1.6);
		BigDecimal bigDecimalParam2 = new BigDecimal(0.1);
		System.out.println("bigDecimal 더하기" + bigDecimalParam1.add(bigDecimalParam2));
		System.out.println();

		// BigDecimal사용, 매개변수 문자형 : 예상결과값 1.7 -> 실제값 1.7

		BigDecimal bigDecimalParam3 = new BigDecimal("1.6");
		BigDecimal bigDecimalParam4 = new BigDecimal("0.1");		
		System.out.println("bigDecimal 더하기" + bigDecimalParam3.add(bigDecimalParam4));

	}
}


```


## 4. 증감연산자의 동작
  증감연산자 ++와 —가 변수의 앞에 위치할 때와 뒤에 위치할 때의 차이를 확인할 수 있는 코드를 작성합니다.
  <br><br>

```

// 전위증감 연산자는 실행문에서 값이 먼저 증가/감소해서 적용된다.

int i = 1;      
int j = ++i;    
System.out.println("i : "+i+", j : "+j); // 결과값 i : 2, j : 2

i = 1;          
j = i++;       
System.out.println("i : "+i+", j : "+j); // 결과값 i : 2, j : 1


// 후위증감 연산자는 실행문에서 값이 후에 증가/감소해서 적용된다.

i = 1;
j = --i;
System.out.println("i : "+i+", j : "+j); // 결과값 i : 0, j : 0

i = 1;
j = i--;
System.out.println("i : "+i+", j : "+j); // 결과값 i : 0, j : 1


/*
  전위 증감 연산자는 변수자체의 값을 1증가/감소해서 반환하지만, 후위 증감 연산자는
  다른 변수에 현재 변수 값을 저장하고 변수 값을 1증가/감소하고 이전에 저장된 값을
  반환한다.
*/


```

## 5. 논리 연산
  논리곱(&), 논리합(|), 조건부 논리곱(&&),조건부 논리합(||)의 차이점을 코드로 작성합니다.<br>
  작성된 코드로 조건부 논리곱과 조건부 논리합 만을 사용하는 이유를 찾아 봅니다.<br>
  <br>

```

/*
    A&&B - A과 B가 모두 참이면 참, A이 거짓이면 B를 평가하지 않음
    A||B - A이나 B 둘 중 하나라도 참이면 참, A이 참이면 B를 평가하지 않음
    A&B - A과 B가 모두 참이면 참, A이 거짓이여도 B를 평가함
    A|B - A이나 B 둘 중 하나라도 참이면 참, A이 조건이 참이어도 B를 평가함
*/

package com.javalec.test;
import java.math.BigDecimal;
public class MainClass {

	public static void main(String[] args) {

    System.out.println("boolean을 통한 비교 source");

		System.out.println("논리합(|) 연산자 사용");
        if (False() | True()) {
            System.out.println("false | true 조건만족");
        }
        System.out.println();

        if (True() | False()) {
            System.out.println("true | false 조건만족");
        }
        System.out.println();

        System.out.println("조건부 논리합(||) 연산자 사용");
        if (False() || True()) {
            System.out.println("false || true 조건만족");
        }
        System.out.println();

        if (True() || False()) {
            System.out.println("true || false 조건만족");
        }
        System.out.println();

        System.out.println("논리곱(&) 연산자 사용");
        if(True() & False()) {
        	System.out.println("true & False 조건만족");
        }
        System.out.println();

        if(False() & True()) {
        	System.out.println("False & True 조건만족");
        }
        System.out.println();

        System.out.println("조건부 논리곱(&&) 연산자 사용");
        if(True() && False()) {
        	System.out.println("True & False 조건만족");
        }
        System.out.println();        

        if(False() && True()) {
        	System.out.println("False & True 조건만족");
        }
        System.out.println();        


    }

    public static boolean True() {
        System.out.println("True");
        return true;
    }

    public static boolean False() {
        System.out.println("False");
        return false;
    }


}

결과

논리합(|) 연산자 사용
False
True
false | true 조건만족

True                  
False                 // ------> short-circuit 적용안됨, False Func() 호출
true | false 조건만족

조건부 논리합(||) 연산자 사용
False
True
false || true 조건만족

True
true || false 조건만족 // ------->  short-circuit 적용됨, False Func() 호출X

논리곱(&) 연산자 사용
True
False                 

False                
True                   //--------> short-circuit 적용안됨, True Func() 호출O

조건부 논리곱(&&) 연산자 사용
True
False

False                  // -------> short-circuit 적용됨, True Func() 호출X


```

  즉, 연산결과에서 보이는 것 처럼 논리합(|), 논리곱(&) 연산은 조건문의 조건이 만족하여도 `short-circuit`<br>
  연산이 적용되지 않아 불필요한 연산을 하게되기때문에조건부 논리합(||), 조건부 논리곱(&&)연산을 많이 사용한다.<br>
  <br>

## 6. 객체 생성
  new 키워드를 이용하여 인스턴스화 할 수 있으며 이렇게 인스턴스화하여 생성한 개체를 인스턴스라 합니다.<br>
  이 인스턴스는 메모리 힙 영역으로 할당되어 참조 주소가 생성되며 가비지 콜렉터에 의해 최종 소멸 됩니다.<br>
  new 키워드를 이용하여 인스턴스화하는 코드를 작성해보고 작성된 코드 조각 하나하나를 풀어 한글로 설명해 봅니다.<br>
  <br><br>

```

MainClass.java

public class MainClass {

	public static void main(String[] args) {

		// PersonClass에서 new생성자를 통해 독립적인 주소값을 가진 인스턴스객체 3개를 만든다 ,
    // 실제값은 메모리상 어딘가에 위치하며 레퍼런스 변수는 이 주소값을 가르킨다.

    PersonClass person1 = new PersonClass("이용빈",30);
		PersonClass person2 = new PersonClass("홍길동",35);
		PersonClass person3 = new PersonClass("유해진",23);

		System.out.println("person1 이름 : "+person1.getName()+"나이 : "+person1.getAge());
		System.out.println("person1 이름 : "+person2.getName()+"나이 : "+person2.getAge());
		System.out.println("person1 이름 : "+person3.getName()+"나이 : "+person3.getAge());
	}
}

PersonClass.java

public class PersonClass {

	/* 외부에서 바로 접근하지 못하도록 접근 제어자를 private로 변수를 선언하고,
	   외부에서 접근할수 있는 public 메서드를 통해 클래스 내부에 선언된 변수값을 변경하게 한다.
	   getter,setter를 통해 값을 변경할 경우, 조건을통해 값을 입력받게 할수있어 안전장치 역할을 할수있다.
	*/

	private String name;
	private int age;

	/*생성자 new를 통해 객체를 생성하며 name과 age 두개의 매개변수가 필요하다.
	  this 키워드는 해당 객체 자신을 가르킨다.  
	*/
	public PersonClass(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//PersonClass의 getter, setter method
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

```

## 7. while, do while, for, foreach
  Java에는 다양한 반복문이 존재하며 차이가 있지만 반복문이라는 용어처럼 반복적인 작업을 구현할 때 작성하게 됩니다.<br>
  반복문들의 차이점을 코드로 표현하고 읽기 좋은 코드 관점으로 보았을 때 어떤 반복문이 가장 큰 이점을 가지고 있는지 설명해 봅니다.<br>
  <br><br>

```

package assign;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {


		/* while문 - while문은 조건식이 true일 경우에 계속해서 반복한다.
		 * 구조- while( 조건식 ) { 조건식이 true일 경우  실행문 }  */

		System.out.println("=======while문======== ");

		int i = 0;
		int result = 0;
		while(true) {
			i++;
			result += i;
			System.out.println("while문 " + i +"번째 result값 : "+result);
			if(i == 10)break;
		}

		System.out.println();

		/* do..while문 - 무조건 중괄호 { 실행문 } 블럭을 한번 실행하고, 조건을 검사하여 반복을 결정한다.
		 * 구조- do{ 실행부  }while(조건식); */

		System.out.println("=======do..while문======== ");

		i = 0;
		result = 0;
		do {
			++i;
			result += i;
			System.out.println("do...while문 "+ i +"번째 result 값 :"+result);
			if(i == 10)break;
		}while( i > 0 );

		System.out.println();


		//문제 6번의 PersonClass사용
		PersonClass person1 = new PersonClass("이용빈",30);
		PersonClass person2 = new PersonClass("홍길동",27);
		PersonClass person3 = new PersonClass("유해진",32);
		ArrayList<PersonClass> personArrayList = new ArrayList<PersonClass>();
		personArrayList.add(person1);
		personArrayList.add(person2);
		personArrayList.add(person3);

		/* for문 - 반복횟수를 알고있을때 주로 사용한다
		 * 구조- for(초기화식 ; 조건식 ; 증감식){ 실행문  } */
		System.out.println("=======for문======== ");

		for(i = 0; i<=personArrayList.size()-1; i++) {
			for(int j=0; j<1; j++) {
				PersonClass person = new PersonClass();
				person = personArrayList.get(i);
				System.out.println("PersonName : "+person.getName()+" , PersonAge : "+person.getAge() );
			}
		}

		System.out.println();

		/* forEach문 - 향상된 for문이라고 불린다.
		 * 오직 배열의 값을 가져다 사용(Read)만 가능하며, 수정(write) 할수없는 특징이 있다.
		 * 구조- for(변수타입 변수이름 : 배열이름){ 실행문 } */

		System.out.println("=======forEach문======== ");

		for(PersonClass person : personArrayList){
			System.out.println("PersonName : "+person.getName()+" , PersonAge : "+person.getAge() );

		}

	}
}


```
<br>
배열 및 클래스 객체를 ArraList와 사용할 경우 forEach문을 사용하면 기존 for문보다 코드가 간결하고 복잡하게 보이지 않는 이점이 있다.
<br><br>


## 8. final 키워드
  final 키워드를 사용할 때 클래스, 메서드, 변수에 따라 각기 다른 성격을 가집니다.이에 대한 이해를 할 수 있는 코드를 작성해 봅니다.<br>
  •final 키워드를 사용할 때 Thread와의 관계는 이번 단계에서는 다루지 않아도 됩니다.<br>
  <br><br>

  | 값 | 의미 |
  |---|:---:|
  | `final 클래스` | 상속 불가 클래스를 의미  |
  | `final 메소드` | 상속 받은 클래스 에서 오버라이딩 불가  |
  | `final 변수` | 변수값 초기화 가능/값 변경 불가(상수) |  

```

/* 1. final로 선언된 클래스는 상속 불가 클래스를 의미한다.

      final로 선언한 부모클래스  

      package com.javalec.finaltest;

      public final class ParentClass {

      	public void Method() {
      		System.out.println("ParentClass에서 작성된 Method()");
      	}

      	public final void FinalMethod() {
      		System.out.println("ParentClass에서 작성된 Finalmethod()");
      	}

      }


      fianl로 선언한 부모클래스를 상속받는 자식클래스
      에러발생 - The type ChildClass cannot subclass the final class ParentClass

      package com.javalec.finaltest;

        public class ChildClass extends ParentClass {

        	@Override
        	public void Method() {
        		System.out.println("ChildClass에서  Override하여 작성된 Method()");
        	}


        	 @Override public final void FinalMethod() {
        		 System.out.println("ChildClass에서  Override하여  작성된Finalmethod()");
        	 }


        }


   2. final로 선언된 메소드는 그 메소드가 포함된 클래스를 상속받은 클래스에서 오버라이딩을 통해 재정의가
      불가능하다.

      부모 클래스 ParentClass

      package com.javalec.finaltest;

      public class ParentClass {

      	public void Method() {
      		System.out.println("ParentClass에서 작성된 Method()");
      	}

      	public final void FinalMethod() {
      		System.out.println("ParentClass에서 작성된 Finalmethod()");
      	}

      }

      자식 클래스 ChildClass ------- (ParentClass 상속)

      package com.javalec.finaltest;

      public class ChildClass extends ParentClass {

      	@Override
      	public void Method() {
      		System.out.println("ChildClass에서  Override하여 작성된 Method()");
      	}

        /* 에러발생 MethodOverride 불가 - Cannot override the final method from ParentClass */
      	@Override public final void FinalMethod() {
      		System.out.println("ChildClass에서  Override하여  작성된Finalmethod()");
      	}

      }       


   3. final로 선언된 변수는 값을 초기화만 할수 있고, 그 값의 변경 및 새로운 할당이 불가능한 상수가 된다.

       package com.javalec.finaltest;

         public class MainClass {
           static int not_Final = 10;
           static final int FINAL_VARIABLE = 10;

         public static void main(String[] args) {


           not_Final = 20;
           FINAL_VARIABLE = 20;    //----> final로 선언된 변수는 값을 변경 할 수 없다.(에러발생)
         }

       }


*/

```
