package com.testNG.animals;

import java.awt.Color;

import com.testNG.plants.Plant;

public abstract class Animal {
    
    boolean isVegetarian = true;
    Color color = Color.DARK_GRAY;
    Integer size;
    Integer reproduceSize;
    
    
    public abstract boolean canEat(Animal animal);
    public abstract boolean canEat(Plant plant);
    public abstract String printName();
    public Boolean didGrow(){
       if (size > reproduceSize) {
           size = size/2;
           return true;
       }
        return false;
    }
    
    
    public Integer getReproduceSize() {
        return reproduceSize;
    }
    public void setReproduceSize(Integer reproduceSize) {
        this.reproduceSize = reproduceSize;
    }
    public Animal(Integer size_) {
        size = size_;
    }
    
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public boolean isVegetarian() {
        return isVegetarian;
    }
    public void setVegetarian(boolean isVegetarian) {
        this.isVegetarian = isVegetarian;
    }
    public Integer getSize() {
        return size;
    }
    public void setSize(Integer size) {
        this.size = size;
    }
    

}
