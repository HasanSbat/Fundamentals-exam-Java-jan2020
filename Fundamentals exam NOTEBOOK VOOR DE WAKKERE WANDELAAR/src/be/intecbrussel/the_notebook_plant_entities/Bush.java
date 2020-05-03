package be.intecbrussel.the_notebook_plant_entities;

public class Bush extends Plant {
	private String fruit;
	private Leaftype leaftype;
	
	public Bush(String name) {
		super(name);
	}
	
	public Bush(String name, double height) {
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

	public String getFruit() {
		return fruit;
	}

	public void setFruit(String fruit) {
		this.fruit = fruit;
	}

	public Leaftype getLeaftype() {
		return leaftype;
	}

	public void setLeaftype(Leaftype leaftype) {
		this.leaftype = leaftype;
	}

	@Override
	public String toString() {
		return "Plant type : " + getClass().getSimpleName() +" ,  Name plant : "+  getName() + " , Leaftype plant : "+
				 getLeaftype() + " , Height plan : " + getHeight()
				 +"The product of this Bush :  " + fruit +  "\n" ;
	}
}
