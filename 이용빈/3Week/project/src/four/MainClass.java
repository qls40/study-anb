package four;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		System.out.println("HashMap");
		Map<String,String> hashMap = new HashMap();
		hashMap.put("1", "leeyongbin");
		hashMap.put("2", "anb");
		hashMap.put("3", "chungnam");
		hashMap.put("4", "gongju");
		hashMap.put("5", "hanbat");
		hashMap.forEach((k,v) -> System.out.println("key값 : " + k +" , value : "+ v));
		System.out.println();
		
		System.out.println("TreeMap ");
		Map<String,String> treeMap = new TreeMap();
		treeMap.put("c", "ccc");
		treeMap.put("a", "aaa");
		treeMap.put("k", "kkk");
		treeMap.put("b", "bbb");
		treeMap.forEach((k,v) -> System.out.println("key값 : "+ k +" , value : "+ v));
		System.out.println();
		
		System.out.println("linkedHashMap");
		Map<String,String> linkedHashMap = new LinkedHashMap();
		linkedHashMap.put("z", "zzz");
		linkedHashMap.put("a", "aaa");
		linkedHashMap.put("t", "ttt");
		linkedHashMap.put("h", "hhh");
		linkedHashMap.forEach((k,v) -> System.out.println("key 값 : " + k + " value 값 : " + v));
		System.out.println();
		
		System.out.println("Hashtable");
		Hashtable<String, Integer> hashTable = new Hashtable<String,Integer>();
		hashTable.put("one", 1);
		hashTable.put("two", 2);
		hashTable.put("three", 3);
		hashTable.forEach((k,v) -> System.out.println("key : " + k + ", value : " + v));
		System.out.println();
		
		System.out.println("HashSet");
		HashSet hastSet = new HashSet();
		hastSet.add(new Fruit(1,"banana","다양함",100.0,1.5));
		hastSet.add(new Fruit(2,"apple","적음",80,1.2));
		hastSet.add(new Fruit(3,"orange","다양함",30,1.1));
		hastSet.add(new Fruit(4,"melon","중간",40,0.8));
		System.out.println("hashSet Size : " + hastSet.size() );
		System.out.println(hastSet);
	}

}
