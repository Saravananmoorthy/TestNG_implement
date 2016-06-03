package com.testNG.land;

import com.testNG.animals.Animal;
import com.testNG.plants.Plant;

public class Savannah extends Land{

    @Override
    public void addPlant(Plant plant) {
       getPlants().add(plant);
    }

    @Override
    public void addAnimal(Animal animal) {
       getAnimals().add(animal); 
    }

    @Override
    public String printName() {
        return "a Savannah";
    }

    @Override
    public String printOverView() {
        return "There are" + this.getNumberAnimals() + " animals and " + this.getNumberPlants() + " plants on " + this.printName();        
    }

    @Override
    public void doEating() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void doGrowing() {
        System.out.println("Time has passed and the plants are growing!");
        for (Plant plant : plants) {
            plant.grow(3);
        }
        
        
        
    }
    
    

    
    
}
