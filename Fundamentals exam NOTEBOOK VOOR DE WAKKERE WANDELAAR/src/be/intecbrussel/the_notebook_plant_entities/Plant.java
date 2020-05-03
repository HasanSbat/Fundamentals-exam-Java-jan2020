package be.intecbrussel.the_notebook_plant_entities;

import java.util.Objects;

public class Plant {

		private String name;
		private double height;
		
		
		public Plant() {
			
		}
		public Plant(String name) {
			this.name= name;
		}
		
		public Plant(String name, double height ) {
			this.name= name;
			this.height = height;
			
		}

		public String getName() {
			
			return name;
		}

		public double getHeight() {
			return height;
		}
		
		public void setHeight(double height) {
			this.height = height;
		}

		@Override
		public int hashCode() {
		    return Objects.hash(getName());
		}
		
		  @Override
		public boolean equals(Object o) {
		    if (this == o) return true;
		    if (!(o instanceof Plant)) return false;
		    Plant plant = (Plant)o;
		    return Objects.equals(getName(), plant.getName());
		}
		
		
}
