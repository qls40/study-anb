package one;

public class MainClass {

	public static void main(String[] args) {
		Fruit f1 = new Fruit(1,"banana","다양함",100.0,1.5);
		Fruit f2 = new Fruit(1,"banana","다양함",100.0,1.5);
		System.out.println("객체비교 : "+f1.equals(f2));
	}
}
