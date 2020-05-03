package be.intecbrussel.the_notebook_plant_entities;

public class Flower extends Plant  {
	private Scent smell;

	public Flower(String name) {
		super(name);
	}
	
	public Flower(String name, double height) {
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

	public Scent getSmell() {
		return smell;
	}

	public void setSmell(Scent smell) {
		this.smell = smell;
	}

	@Override
	public String toString() {
		return "Plant type : " + getClass().getSimpleName() +  " , Name plant : "+  getName()  + 
				" , Height plan : " + getHeight() +
			 " , The smell Flower: " + smell + "\n";
	}	
}
