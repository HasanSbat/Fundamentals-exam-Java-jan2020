package be.intecbrussel.the_notebook_animal_entities;

public class Carnivore extends Animal {
	private double maxFoodSize;
	
	public Carnivore(String name) {
		super(name);
	}
	
	public Carnivore (String name, double weight, double height, double lenght) {
		super (name,weight,height,lenght);
		
	}
	@Override
	public boolean equals(Object o) {
		return super.equals(getName());
		
	}
	@Override
	public int hashCode() {
		return super.hashCode();
	}

	public double getMaxFoodSize() {
		return maxFoodSize;
	}

	public void setMaxFoodSize(double maxFoodSize) {
		this.maxFoodSize = maxFoodSize;
	}

	@Override
	public String toString() {
		return "Animal type : " + getClass().getSimpleName() + " , Name animal : " + getName()+
				", weight : "+  getWeight() + " , Height : " +  getHeight() + " , Length : " + 
				getLenght() +", MaxFoodSize = " + maxFoodSize + "\n";
	}
	

}

	


