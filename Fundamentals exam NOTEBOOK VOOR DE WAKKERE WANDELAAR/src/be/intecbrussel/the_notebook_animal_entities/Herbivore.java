package be.intecbrussel.the_notebook_animal_entities;

import java.util.Set;

import be.intecbrussel.the_notebook_plant_entities.Plant;

public class Herbivore extends Animal {
	Set<Plant> plantDiet;
	
	public Herbivore (String name) {
		super(name);
	}

	public Herbivore (String name, double weight, double height, double lenght) {
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
	
	public void addPlantToDiet(Plant plant) {
		this.plantDiet = (Set<Plant>) plant;
	}
	
	public void printDiet() {
		
	}

	@Override
	public String toString() {
		return "Animal type : " + getClass().getSimpleName() + " , Name animal : " + getName()+
				", weight : "+  getWeight() + "Height : " +  getHeight() + "Length : " +  getLenght() + "\n";
	}
}
