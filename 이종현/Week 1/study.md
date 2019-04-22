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
## 3. 부동 소수점
## 4. 증감연산자
## 5. 논리 연산
## 6. 객체 생성
## 7. 반복문(while, do while, for, foreach)
## 8. final 키워드