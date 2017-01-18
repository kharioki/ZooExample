package com.zianos.util;

/**
 * Created by andrew on 1/18/17.
 */
public class Name {
    private String firstName;
    private String lastName;

    public Name(String wholeName){
        //TODO: Make sure the input is valid
        String[] nameParts = wholeName.split(" ");

        this.firstName = nameParts[0];
        this.lastName = nameParts[1];
    }

    public Name(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString(){
        return this.lastName + ", " + this.firstName;
    }
}
