package be.intecbrussel.the_notebook_animal_entities;

import java.util.Set;

import be.intecbrussel.the_notebook_plant_entities.Plant;

public class Omnivore extends Animal {
	private Set<Plant> plantDiet;
	private double maxFoodSize;
		
	public Omnivore(String name) {
		super(name);
	}
	
	public Omnivore (String name, double weight, double height, double lenght) {
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

	public Set<Plant> getPlantDiet() {
		return plantDiet;
	}

	public void setPlantDiet(Set<Plant> plantDiet) {
		this.plantDiet = plantDiet;
	}

	public double getMaxFoodSize() {
		return maxFoodSize;
	}

	public void setMaxFoodSize(double maxFoodSize) {
		this.maxFoodSize = maxFoodSize;
	}
	
	public void addPlantToDiet(Plant plant) {
		this.plantDiet = (Set<Plant>) plant;
	}

	@Override
	public String toString() {
		return"Animal type : " + getClass().getSimpleName() + " , Name animal : " + getName()+
				", weight : "+  getWeight() + " , Height : " +  getHeight() + " , Length : " + 
				getLenght() +", MaxFoodSize = " + maxFoodSize + "\n";
				
	}

}
