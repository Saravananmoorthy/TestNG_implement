package com.testNG.plants;


public class Tree extends Plant{
    
    public Tree(Integer size_) {
        super(size_);
        // TODO Auto-generated constructor stub
    }

    @Override
    public Boolean didReproduce() {
        if (size > reproduceSize) {
            size = size/2;
            return true;
        }
         return false;

    }
    
}
