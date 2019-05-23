package two;

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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(sugarLevel);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((variety == null) ? 0 : variety.hashCode());
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(sugarLevel) != Double.doubleToLongBits(other.sugarLevel))
			return false;
		if (variety == null) {
			if (other.variety != null)
				return false;
		} else if (!variety.equals(other.variety))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}



	
}
