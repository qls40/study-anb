# First Week

<em>1.기호의 발음</em>
/는 slash라고 읽는 것을 다 알고 계실거에요. 그럼 “(쌍따옴표), &, * 기호 등 우리 개발하면서 흔히 접할 수 있는 기호들의 철자와 발음에 대해 학습합니다.

```

!  exclamation point
#  number sign
(  openning parenthesis
)  close parenthesis
*  asterisk
-  hyphen
:  colon
;  semi colon
< less than sign
> greater than sign
[  opening bracket
] closing bracket
^  caret - circumflex
_  underscore
`  grave accent
{  opening brace
}  closing brace
|  vertical bar
~ equivalency sign

```

<em>2. Character Set <em>
개발하면서 흔히 접할 수 있는 캐릭터셋을 요약하고
주로 사용하는 통합 개발 환경(IDE)에서 어떻게 캐릭터셋을 설정하고 유의해야 할 사항들을 정리합니다.

```

문자셋(Character Set) - 하나의 언어권에서 사용하는 언어를 표현하기 위한 모든문자의 모임
인코딩(Encoding) - 문자셋과 컴퓨터가 이해할 수 있는 바이트와의 매핑 규칙
가장 많이 사용하는 인코딩 방식은 "UTF-8", "KSC5601", "ISO-8859-1" 이다.


Spring 프레임워크
- Text Content Types 설정
Windows -> Preferences -> General -> Content Type -> Default encoding: UTF-8 추가
- Workspace Text file encoding 설정
Windows -> Preferences -> General -> WorkSpace -> Text file encoding -> Other(UTF-8)
- Web file encoding 설정
Windows -> Preferences -> Web -> CSS Files, HTML Files, JSP Files 모두 UTF-8 설정
- XML Files encoding 설정
Windows -> Preferences -> XML -> XML Files -> Encoding : ISO 10646/Unlconde(UTF-8)


- web.xml 인코딩 필터 Setting (서블릿과 통신시 Data encoding 설정)
<Connector port="8080" URIEncoding="UTF-8" maxHttpHeaderSize="8192"
               maxThreads="150" minSpareThreads="25" maxSpareThreads="75"
               enableLookups="false" redirectPort="8443" acceptCount="100"
               connectionTimeout="20000" disableUploadTimeout="true" />


- JSP 파일 최상단에 UTF-8 directive 추가
<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>

- 메이븐 사용시 UTF-8 설정
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


* 유의사항
특정 플러그인 설치시 해당 플러그인에서 인코딩을 별도로 설정해줘야 한다.
Git등에서 파일을 클론하기전에 인코딩 설정을 미리하여 한글깨짐을 방지한다.

```
