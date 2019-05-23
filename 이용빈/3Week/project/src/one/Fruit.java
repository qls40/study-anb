package one;

public class Fruit {
	public int id;
	public String name;
	public String variety;
	public double weight;
	public double sugarLevel; 
      
	public Fruit(int id, String name, String variety, double weight, double sugarLevel) {
		this.id = id;
		this.name = name;
		this.variety = variety;
		this.weight = weight;
		this.sugarLevel = sugarLevel;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVariety() {
		return variety;
	}
	public void setVariety(String variety) {
		this.variety = variety;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getSugarLevel() {
		return sugarLevel;
	}
	public void setSugarLevel(double sugarLevel) {
		this.sugarLevel = sugarLevel;
	}
	
	@Override
	public boolean equals(Object obj) {
		// 매개변수 obj값이 null이 아니고 매개변수 obj가 Fruit타입으로 형변환이 가능한 경우 if문 실행
		if(obj != null && obj instanceof Fruit) {
			return this.id == ((Fruit)obj).id 
				&& this.name ==((Fruit)obj).name
				&& this.variety ==((Fruit)obj).variety
				&& this.weight == ((Fruit)obj).weight
				&& this.sugarLevel == ((Fruit)obj).sugarLevel;
		}else {
			return false;
		}
	}
	
}
