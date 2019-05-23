package two;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MainClass {

	public static void main(String[] args) {
		/*****************************
		 *  class Fruit              *
		 * 	public int id;           *
		 *	public String name;      *
		 *	public String variety;   *
		 *	public double weight;    *
		 *	public double sugarLevel;* 
		 * ***************************/
		
		Fruit f1 = new Fruit(1,"banana","다양함",100.0,1.5);
		Fruit f2 = new Fruit(1,"banana","다양함",100.0,1.5);
		System.out.println("객체비교 : "+f1.equals(f2));
		
		//hash값이 동일한 경우 Map의 Size는 1이 나와야함.
		Map<Fruit, Integer> map = new HashMap<Fruit,Integer>();
		map.put(f1, 1);
		map.put(f2, 1);
		System.out.println();
		
		map.forEach((k,v) -> System.out.println("key값 : " + k +" , value : "+ v));
		System.out.println();
		
		System.out.println("Map Size :" + map.size());
		System.out.println();
		
	}

}
