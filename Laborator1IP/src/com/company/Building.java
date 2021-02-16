package com.company;

import java.util.ArrayList;

public class Building {
    String buildingType;
    ArrayList<Animal> buildingAnimals = new ArrayList<Animal>();
    public Building(String type){
        this.buildingType = type;
    }
    public Building(int type){
        if (type == 0) {
            buildingType = "bird";
        }
        else if (type == 1){
            buildingType = "predatory";
        }
        else if (type == 2){
            buildingType = "fish";
        }
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
    public void wakeAnimals(){
        for (Animal a : buildingAnimals){
            a.wake();
        }
    }
}
