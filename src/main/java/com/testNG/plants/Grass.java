package com.testNG.plants;

public class Grass extends Plant{

    public Grass(Integer size_) {
        super(size_);
        // TODO Auto-generated constructor stub
    }

    @Override
    public Boolean didReproduce() {
        if (this.getSize() > this.getReproduceSize()) {
            size = size/2;
            return true;
        }
        return false;
    }


    
}
