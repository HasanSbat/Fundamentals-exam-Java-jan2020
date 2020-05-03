package be.intecbrussel.the_notebook_animal_entities;

import java.util.Objects;

public class Animal {
	protected String name;
	private double weight;
	private double height;
	private double lenght;
	
	public Animal(String name) {
		this.name= name;
	}

	public Animal(String name, double weight, double height, double lenght) {
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.lenght = lenght;
	}

	public String getName() {
		return name;
	}


	@Override
	public int hashCode() {
	    return Objects.hash(getName());
	}
	
	  @Override
	public boolean equals(Object o) {
	    if (this == o) return true;
	    if (!(o instanceof Animal)) return false;
	    Animal animal = (Animal) o;
	    return Objects.equals(getName(), animal.getName());
	}
	  
	  
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getLenght() {
		return lenght;
	}

	public void setLenght(double lenght) {
		this.lenght = lenght;
	}

	
	
}
