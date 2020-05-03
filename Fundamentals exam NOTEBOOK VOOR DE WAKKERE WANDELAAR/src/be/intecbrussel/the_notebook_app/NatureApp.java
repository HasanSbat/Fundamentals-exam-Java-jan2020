package be.intecbrussel.the_notebook_app;

import java.util.HashSet;
import java.util.Set;
import be.intecbrussel.the_notebook_animal_entities.Carnivore;
import be.intecbrussel.the_notebook_animal_entities.Herbivore;
import be.intecbrussel.the_notebook_animal_entities.Omnivore;
import be.intecbrussel.the_notebook_plant_entities.Bush;
import be.intecbrussel.the_notebook_plant_entities.Flower;
import be.intecbrussel.the_notebook_plant_entities.Leaftype;
import be.intecbrussel.the_notebook_plant_entities.Plant;
import be.intecbrussel.the_notebook_plant_entities.Scent;
import be.intecbrussel.the_notebook_plant_entities.Tree;
import be.intecbrussel.the_notebook_plant_entities.Weed;
import be.intecbrussel.the_notebook_service.ForstNotebook;

public class NatureApp {

	public static void main(String[] args) {
		 ForstNotebook notbook = new ForstNotebook();
		
		//    -------------------> ( Plants ) <------------------------
		
        Flower plant_Flower1 = new Flower("Dahlia", 0.2);
        plant_Flower1.setSmell(Scent.EARTHY);
        notbook.addPlant(plant_Flower1);
        Flower plant_Flower2 = new Flower("Gladiool", 0.3);
        plant_Flower2.setSmell(Scent.MUSKY);
        notbook.addPlant(plant_Flower2);
       
        Bush plant_Bush1=new Bush("Aalbes", 1.5);
        plant_Bush1.setLeaftype(Leaftype.HAND);
        plant_Bush1.setFruit("Bessen");  
        notbook.addPlant(plant_Bush1);
        
        Bush plant_Bush2=new Bush("Hazelaar", 1.5);
        plant_Bush2.setLeaftype(Leaftype.HEART);
        plant_Bush2.setFruit("hazelaar"); 
        notbook.addPlant(plant_Bush2);
        
        Weed plant_Weed = new Weed ("Heernoes", 0.9);
        plant_Weed.setArea(19.66);
        notbook.addPlant(plant_Weed);
        
        Tree plant_Tree1= new Tree ("Amandelwilg" , 6.9);
        plant_Tree1.setLeaftype(Leaftype.SPEAR);
        notbook.addPlant(plant_Tree1);
        
        Tree plant_Tree2= new Tree ("Peer" , 3.5);
        plant_Tree2.setLeaftype(Leaftype.HEART);
        notbook.addPlant(plant_Tree2);
        
        Set<Plant> deitPlants = new HashSet<>();
        deitPlants.add(plant_Bush1);
        deitPlants.add(plant_Bush2);
        deitPlants.add(plant_Flower1);
        deitPlants.add(plant_Flower2);
        deitPlants.add(plant_Weed);
        deitPlants.add(plant_Tree1);
        deitPlants.add(plant_Tree2);
        
     
		//     -------------------> ( Animals ) <------------------------
        
        Herbivore herbivore1 = new Herbivore ("Wood mouse",0.3,0.4,0.6);
        herbivore1.setPlantDiet(deitPlants);
        notbook.addAnimal(herbivore1);
        notbook.getHerbivore().add(herbivore1);
        
        Herbivore herbivore2 = new Herbivore ("Rabbit",2.1,0.25,0.56);
        herbivore2.setPlantDiet(deitPlants);
        notbook.addAnimal(herbivore2);
        notbook.getHerbivore().add(herbivore2);

        
        Herbivore herbivore3 = new Herbivore ("Hedgehog",2.0,0.20,0.60);
        herbivore3.setPlantDiet(deitPlants);
        notbook.addAnimal(herbivore3);
        notbook.getHerbivore().add(herbivore3);

        Herbivore herbivore4 = new Herbivore ("Squirrel",1.6,0.2,0.40);
        herbivore4.setPlantDiet(deitPlants);
        notbook.addAnimal(herbivore4);
        notbook.getHerbivore().add(herbivore4);

        
        Omnivore omnivore1 = new Omnivore ("Wil pig", 25, 1.05 , 0.9);
        omnivore1.setPlantDiet(deitPlants);
        omnivore1.setMaxFoodSize(2);
        notbook.addAnimal(omnivore1);
        notbook.getOmnivore().add(omnivore1);

        Omnivore omnivore2 = new Omnivore ("Badgers", 4, 0.40 , 0.80);
        omnivore2.setPlantDiet(deitPlants);
        omnivore2.setMaxFoodSize(0.5);
        notbook.addAnimal(omnivore2);
        notbook.getOmnivore().add(omnivore2);
        
        Carnivore carnivore1 = new Carnivore ("Wolf", 40.5,1.2, 1.3);
        carnivore1.setMaxFoodSize(20);
        notbook.addAnimal(carnivore1);
        notbook.getCarnivore().add(carnivore1);
        
        Carnivore carnivore2 = new Carnivore ("Fox", 10.5,0.7, 1.0);
        carnivore2.setMaxFoodSize(5.3);
        notbook.addAnimal(carnivore2);
        notbook.getCarnivore().add(carnivore2);

        Carnivore carnivore3 = new Carnivore ("Snake", 10,0.3, 10.2);
        carnivore3.setMaxFoodSize(3.0);
        notbook.addAnimal(carnivore3);
        notbook.getCarnivore().add(carnivore3);
        
   
		//     -------------------> (  ) <------------------------

       System.out.println("------Count Plants and Animals------\n");
       System.out.println("Animals count : " + notbook.getAnimalCount());	
       System.out.println("Plants  count  : " + notbook.getPlanCount());
       System.out.println("----------------------------------------------"+"\n");
       
       System.out.println("------Plants and Animals List------");
                 notbook.printNotebook();
       System.out.println("-------------------------------------------" + "\n");
       
       System.out.println("------Herbivores List------\n");
       notbook.getHerbivore().forEach(System.out::println);
       System.out.println("-------------------------------------------" + "\n");
     
      
       System.out.println("------Omnivore List------\n");
       notbook.getOmnivore().forEach(System.out::println);
       System.out.println("----------------------------------------------" + "\n");
     
       System.out.println("------Carnivore List------\n");
       notbook.getCarnivore().forEach(System.out::println);
       System.out.println("----------------------------------------------" + "\n");
       
        
        System.out.println("------Plants and Animals List with sorting------\n");
        notbook.sortPlantsByName();
        notbook.sortAnimalsByName();
        notbook.printNotebook();
        
	}

}
