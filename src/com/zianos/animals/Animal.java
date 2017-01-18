package com.zianos.animals;

import com.zianos.util.Name;

/**
 * Created by andrew on 1/18/17.
 */
public interface Animal {

    void feed();

    int getTimesFed();

    boolean isSick();

    String getName();

    void setName(Name name);
}
