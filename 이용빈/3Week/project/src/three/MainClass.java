package three;

import java.util.Optional;

public class MainClass {

	public static void main(String[] args) {
		Fruit apple = null;
		Fruit berry = new Fruit();		
		
		//value값이 null인지 확실하지 않은 경우에 사용하며, null인 경우에 empty Optional객체를 생성한다.
		Optional<Fruit> optApple = Optional.ofNullable(apple);
		Optional<Fruit> optBerry = Optional.ofNullable(berry);
		
		optApple.ifPresent(opt -> System.out.println(opt)); //비어있음
		optBerry.ifPresent(opt -> System.out.println(opt)); 
		System.out.println();
		
		//null값과 비교
		boolean result = optApple.equals(optBerry);
		System.out.println("null값과 비교 : "+result);
		System.out.println();
		
		//객체 비교
		optApple = Optional.ofNullable(new Fruit());
		result = optApple.equals(optBerry);
		System.out.println("객체 비교 : "+result);
		System.out.println();

	}
}
