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
    
}
