package com.testNG.animals;
import com.testNG.plants.Plant;

import static org.junit.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AnimalTest {
    // does a test of abstract class animals
    
    private class AnimalImplementation extends Animal{
        public AnimalImplementation(Integer size_) {
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
            return false;
        }

        @Override
        public String printName() {
            return "I am a mock animal";
        }
    }

    @Test
    public void whenGetsBigger_thenHasGottenBigger() {
        //example of a test pass
        AnimalImplementation goat = new AnimalImplementation(10);
        goat.getBigger(5);
        Assert.assertTrue(goat.getSize() == 15);
    }
    
    @Test
    public void whenGets2xBigger_thenHasGrown() {
        //example of a test pass
        AnimalImplementation goat = new AnimalImplementation(10);
        goat.getBigger(10);
        Assert.assertTrue(goat.didGrow());
    }
    
    @Test
    public void whenGetsSmaller_thenNothingHappens() {
        //example of a test failure
        AnimalImplementation goat = new AnimalImplementation(10);
        goat.getBigger(-5);
        Assert.assertTrue(goat.getSize() == 10);
    }
   

}
