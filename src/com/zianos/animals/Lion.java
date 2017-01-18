package com.zianos.animals;

import com.zianos.util.Name;

/**
 * Created by andrew on 1/18/17.
 */
public class Lion implements Animal {

    private Name name;
    private boolean sick;
    private int timesFed;

    public Lion(String nameStr){
        this.name = new Name(nameStr);
        this.sick = false;
        this.timesFed = 0;
    }

    @Override
    public void feed() {
        this.timesFed++;
    }

    @Override
    public int getTimesFed() {
        return this.timesFed;
    }

    @Override
    public boolean isSick() {
        return this.sick;
    }

    @Override
    public String getName() {
        return name.toString();
    }

    @Override
    public String toString(){
        return this.getName();
    }

    @Override
    public void setName(Name name) {
        this.name = name;
    }

    public void roar(){
        System.out.print("ROAR!");
    }
}
