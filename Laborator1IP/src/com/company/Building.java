package com.company;

import java.util.ArrayList;

public class Building {
    String buildingType;
    ArrayList<Animal> buildingAnimals = new ArrayList<Animal>();
    public Building(String type){
        this.buildingType = type;
    }
    public void addAnimal(Animal animal){
        if (this.buildingType.equals(animal.getType())){
            buildingAnimals.add(animal);
        }
    }
    public String getInfo() {
        String display=new String();
        display+="Building of type: " + buildingType + " - ";
        for (Animal a : buildingAnimals){
            display+=a.getName() + " ";
        }
        display+='\n';
        return display;
    }
    public void printBuildingAnimals(){
        System.out.print("Building of type: " + buildingType + " - ");
        for (Animal a : buildingAnimals){
            System.out.print(a.getName() + " ");
        }
        System.out.println();
    }
}
