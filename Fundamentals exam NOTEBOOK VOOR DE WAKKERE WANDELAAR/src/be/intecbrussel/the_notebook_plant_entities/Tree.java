package be.intecbrussel.the_notebook_plant_entities;

public class Tree extends Plant{
	
	private Leaftype leaftype;
	
	public Tree (String name ) {
		super(name);
	}

	public Tree( String name , double height) {
		super(name , height);
	}
	
	@Override
	public boolean equals(Object o) {
		return super.equals(getName());
		
	}
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	

	public Leaftype getLeaftype() {
		return leaftype;
	}

	public void setLeaftype(Leaftype leaftype) {
		this.leaftype = leaftype;
	}

	@Override
	public String toString() {
		return "Plant type : " + getClass().getSimpleName() +" , Name plant : "+  getName() + " , Leaftype plant : "+
		 getLeaftype() + " , Height plan : " + getHeight() +"\n";
	}
}
