package com.testNG.animals;
import com.testNG.plants.Plant;

import org.testng.annotations.Test;

public class AnimalTest {
    // does a test of abstract class animals
    
    private class AnimalMock extends Animal{
        public AnimalMock(Integer size_) {
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
    public void test1() {
        System.out.println("hello world");
    }
   

}
