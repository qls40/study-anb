## C# 자료구조

```
컬렉션(Collection)은 간단히 말해 데이터 모음(자료구조) 이다.
```
![제목 없음](https://user-images.githubusercontent.com/49777498/58000059-958a3000-7b12-11e9-9766-23f18785026a.png)


---

## Array List
```
ArrayList는 배열과 비슷한 컬렉션이다.

ArrayList는 크기 지정없이 요소의 추가,삭제에 따라 자동으로 크기를 늘였다 줄였다 한다.

또한 ArrayList 컬렉션 하나로 모든 타입의 변수를 담을 수 있다는 장점이 있다.

( ArrayList뿐만 아니라 C#에서 제공하는 모든 컬렉션은 모든 타입의 변수를 담을 수 있다.

컬렉션 요소는 어떤 타입이든지 object 타입으로 저장되기 때문이다.)

```
![array](https://user-images.githubusercontent.com/49777498/57999863-e6e5ef80-7b11-11e9-9df3-608ea7c1f7e6.png)

---

## Queue
```
큐는 선입선출(FIFO)의 자료구조다.

큐는 ArrayList처럼 원하는 위치에 데이터를 입,출력하는 것이 불가능하고, 

오직 출력은 큐의 앞에서, 입력은 큐의 뒤에서만 가능하다.

```
![queue](https://user-images.githubusercontent.com/49777498/58000067-a33fb580-7b12-11e9-8803-b42eb3baa285.png)
![queue2](https://user-images.githubusercontent.com/49777498/58000068-a33fb580-7b12-11e9-84af-e77756c30bbe.png)

---

## Stack
```
스택은 큐와 반대로 후입선출(LIFO)의 자료구조이다

후입선출은 나중에 들어온 데이터가 먼저 출력되는 구조로 

뒤로 입력되고 앞으로 출력되는 큐와 달리, 스택은 뒤로 입력되고 뒤로 출력된다.



( Stack은 데이터 입력을 Push라고 하고, 데이터 출력을 Pop이라 한다. )

```
![stack](https://user-images.githubusercontent.com/49777498/58000080-ad61b400-7b12-11e9-8fab-86954f8e111d.png)
![stack2](https://user-images.githubusercontent.com/49777498/58000079-acc91d80-7b12-11e9-9646-3c7d47bcd648.png)

---

## Hashtable
```
해쉬테이블은 키(Key)와 값(Value)을 가진 데이터를 저장하는 자료구조이다.

```
![Hash](https://user-images.githubusercontent.com/49777498/58000477-d46cb580-7b13-11e9-92c4-1024e97b3574.png)
```

해쉬테이블은 마치 영한사전 프로그램에서 

'Apple'이라는 단어를 치면 '사과'라는 뜻이 출력되는 것과 같다.

Ex) Apple -> 사과,    Banana -> 바나나,    Orange -> 오렌지

여기서 'Apple'이 키가 되고 '사과'가 값이 되는 것이다.
※ 배열은 인덱스로 숫자만을 사용하지만, 해쉬테이블은 키값으로 어떤 타입(int, float, string, class)이든 사용할 수 있기 때문에 상당히 활용도가 높다.
```
![hash2](https://user-images.githubusercontent.com/49777498/58000479-d6367900-7b13-11e9-86fc-b0b3d393a175.png)


---
