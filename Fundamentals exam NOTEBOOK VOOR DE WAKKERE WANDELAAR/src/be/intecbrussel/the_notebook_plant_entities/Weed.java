package be.intecbrussel.the_notebook_plant_entities;

public class Weed extends Plant {
	private double area;
	
	public Weed(String name) {
		super(name);
	}
	
	public Weed(String name, double height) {
		super(name,height);
	}
	
	@Override
	public boolean equals(Object o) {
		return super.equals(getName());
		
	}
	@Override
	public int hashCode() {
		return super.hashCode();
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public String toString() {
		
		return "Plant type : " + getClass().getSimpleName() + " , Name plant : "+  getName() + " , Height plan : " + getHeight()+
		" , The total area of this Weed : " + area +"\n";
	}
}
