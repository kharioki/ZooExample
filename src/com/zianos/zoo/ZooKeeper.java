package com.zianos.zoo;

import com.zianos.animals.Animal;
import com.zianos.util.Name;

import java.util.ArrayList;

/**
 * Created by andrew on 1/18/17.
 */
public class ZooKeeper {
    private Name name;
    private ArrayList<Class> training = new ArrayList<Class>();
    private boolean working;

    public ZooKeeper(String nameStr){
        this.name = new Name(nameStr);
    }

    public ZooKeeper(String nameStr, ArrayList<Class> trainedAnimals){
        this.name = new Name(nameStr);
        this.training = trainedAnimals;
    }

    public void feedAnimal(Animal animal){
        System.out.println("Keeper " + this.name + ": ");
        animal.feed();
    }

    public boolean isWorking(){
        return this.working;
    }

    public void setWorking(boolean working){
        this.working = working;
    }

    public boolean canFeed(Animal animal){
        return this.training.contains(animal.getClass());
    }

    public void addTraining(Class animal){
        this.training.add(animal);
    }
}
