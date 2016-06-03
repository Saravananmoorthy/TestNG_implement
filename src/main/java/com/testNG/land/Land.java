package com.testNG.land;

import java.util.ArrayList;
import java.util.List;

import com.testNG.animals.Animal;
import com.testNG.plants.Plant;

public abstract class Land {
    
    List<Plant> plants = new ArrayList<Plant>();
    List<Animal> animals = new ArrayList<Animal>();
    
    
    public abstract void addPlant(Plant plant);
    public abstract void addAnimal(Animal animal);
    public abstract String printName();
    public abstract String printOverView();
    public abstract void doEating();
    public abstract void doGrowing();
    
    public List<Plant> getPlants() {
        return plants;
    }
    public void setPlants(List<Plant> plants) {
        this.plants = plants;
    }
    public Integer getNumberPlants() {
        return plants.size();
    }
    public List<Animal> getAnimals() {
        return animals;
    }
    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }
    public Integer getNumberAnimals() {
        return animals.size();
    }
    
    
    
}
