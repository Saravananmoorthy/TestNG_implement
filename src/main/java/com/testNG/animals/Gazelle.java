package com.testNG.animals;

import com.testNG.plants.Plant;

public class Gazelle extends Animal {

    public Gazelle(Integer size_) {
        super(size_);
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean canEat(Animal animal) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean canEat(Plant plant) {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public String printName() {
        // TODO Auto-generated method stub
        return "";
    }

}
