package com.testNG.plants;

import java.awt.Color;

public abstract class Plant {
    Color color = Color.GREEN;
    Integer reproduceSize;
    Integer size;
    Boolean isPoison = false;
    
    public Plant(Integer size_) {
        size = size_;
        reproduceSize = size_ * 2;
    }
    
    public abstract Boolean didReproduce();
    
    public void grow(Integer amount) {
        size += amount;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Integer getReproduceSize() {
        return reproduceSize;
    }

    public void setReproduceSize(Integer reproduceSize) {
        this.reproduceSize = reproduceSize;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Boolean getIsPoison() {
        return isPoison;
    }

    public void setIsPoison(Boolean isPoison) {
        this.isPoison = isPoison;
    }
    
     
    
}
