package be.intecbrussel.the_notebook_service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import be.intecbrussel.the_notebook_animal_entities.Animal;
import be.intecbrussel.the_notebook_animal_entities.Carnivore;
import be.intecbrussel.the_notebook_animal_entities.Herbivore;
import be.intecbrussel.the_notebook_animal_entities.Omnivore;
import be.intecbrussel.the_notebook_plant_entities.Plant;


public class ForstNotebook {
	
	private List<Carnivore> carnivore ;
	private List<Omnivore> omnivore;
	private List<Herbivore> herbivore;
	private int planCount;
	private int animalCount;
	private List<Animal> animals;
	private List<Plant> plants;
	
	public ForstNotebook() {
		carnivore= new ArrayList<Carnivore>();
		omnivore = new ArrayList<Omnivore>();
		herbivore = new ArrayList<Herbivore>();
		animals = new ArrayList<Animal>();
		plants = new ArrayList<Plant>(); 
		
		
	}

	public List<Carnivore> getCarnivore() {
		return carnivore;
	}

	public void setCarnivore(List<Carnivore> carnivore) {
		this.carnivore = carnivore;
	}

	public List<Omnivore> getOmnivore() {
		return omnivore;
	}

	public void setOmnivore(List<Omnivore> omnivore) {
		this.omnivore = omnivore;
	}

	public List<Herbivore> getHerbivore() {
		return herbivore;
	}

	public void setHerbivore(List<Herbivore> herbivore) {
		this.herbivore = herbivore;
	}

	public int getPlanCount() {
		this.planCount= plants.size();
		return planCount;
	}

	public int getAnimalCount() {
		this.animalCount=animals.size();
		return animalCount;
	}

	public void addAnimal(Animal animal) {
		if(!animals.contains(animal))
			
		animals.add(animal);
	}	

	public void addPlant(Plant plant) {
		if(!plants.contains(plant))
		plants.add(plant);		
	}
	
	public void printNotebook() {
		plants.forEach(System.out::println);
	    animals.forEach(System.out::println);
	}
	
	public void sortAnimalsByName() {
		animals.sort(Comparator.comparing(Animal:: getName));
	}
	
	public void sortPlantsByName() {
		plants.sort(Comparator.comparing(Plant:: getName));
	}
	
	public void sortAnimalsByHeight() {
		animals.sort(Comparator.comparing(Animal:: getHeight));
	}
	
	public void sortPlantsByHeight() {
		plants.sort(Comparator.comparing(Plant:: getHeight));	
	}	
}
