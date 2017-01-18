package com.zianos;

import com.zianos.animals.Animal;
import com.zianos.animals.Bear;
import com.zianos.animals.Lion;
import com.zianos.animals.Tiger;
import com.zianos.util.Name;
import com.zianos.zoo.Zoo;
import com.zianos.zoo.ZooKeeper;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Zoo accraZoo = new Zoo();

        //Found 3 new Zoo Keepers
        ArrayList<ZooKeeper> newlyHiredKeepers= new ArrayList<ZooKeeper>();

        ZooKeeper keeperAndrew = new ZooKeeper("Andrew Berkowitz");
        keeperAndrew.addTraining(Tiger.class);
        keeperAndrew.addTraining(Bear.class);
        newlyHiredKeepers.add(keeperAndrew);

        ZooKeeper keeperHillary = new ZooKeeper("Hillary Clinton");
        keeperHillary.addTraining(Lion.class);
        newlyHiredKeepers.add(keeperHillary);

        ZooKeeper keeperDonald = new ZooKeeper("Donald Trump");
        keeperDonald.addTraining(Bear.class);
        newlyHiredKeepers.add(keeperDonald);

        //Hire all the ZooKeepers we found
        for(ZooKeeper keeper : newlyHiredKeepers){
            accraZoo.hireZooKeeper(keeper);
        }

        //Find some Animals
        ArrayList<Animal> foundAnimals = new ArrayList<Animal>();

        //Two Lions
        foundAnimals.add(new Lion("Jim Bob"));
        foundAnimals.add(new Lion("Bob Jim"));

        //Two Tigers
        foundAnimals.add(new Tiger("Sally Jane"));
        foundAnimals.add(new Tiger("Joseph Jo"));

        //Two Bears
        foundAnimals.add(new Bear("Sarah Jones"));
        foundAnimals.add(new Bear("Sasha Moo"));

        //Buy Animals
        for(Animal animal : foundAnimals){
            accraZoo.buyAnimal(animal);
        }

        //feed All Animals Twice
        accraZoo.feedAllAnimals();
        accraZoo.feedAllAnimals();
    }
}
