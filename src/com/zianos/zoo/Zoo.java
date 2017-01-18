package com.zianos.zoo;

import com.zianos.animals.Animal;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by andrew on 1/18/17.
 */
public class Zoo {
    ArrayList<Animal> animals = new ArrayList<Animal>();
    ArrayList<ZooKeeper> keepers = new ArrayList<ZooKeeper>();

    public void hireZooKeeper(ZooKeeper keeper){
        this.keepers.add(keeper);
    }

    public void buyAnimal(Animal animal){
        this.animals.add(animal);
    }

    public void feedAllAnimals(){
        for(Animal animal : this.animals){
            boolean animalFed = false;

            for(ZooKeeper keeper : this.keepers){
                if(keeper.canFeed(animal)){
                    keeper.feedAnimal(animal);
                    animalFed = true;

                    break;
                }
            }
            if(animalFed == false){
                System.out.println("Unable to feed " + animal + "!");
            } else{
                System.out.println("Animal " + animal + " has been fed "
                        + animal.getTimesFed());
            }
        }
    }
}
