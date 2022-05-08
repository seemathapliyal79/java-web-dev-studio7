package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc {

    private String name;
    private int storageCapacity;
    private int remainingCapacity;
    private int capacityUsed;
    private String diskType;
    private ArrayList<String> contents;

    //checkcapacity
   private int spaceLeft(){
       return storageCapacity-capacityUsed;
   }
    //write disk
    //disk info

    public abstract String title();



}
