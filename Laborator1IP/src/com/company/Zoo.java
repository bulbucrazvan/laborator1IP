package com.company;

import java.util.ArrayList;

public class Zoo {
    ArrayList<Building> zooBuildings = new ArrayList<Building>();
    public void printBuildings(){
        for (Building b : zooBuildings){
            b.printBuildingAnimals();
        }
    }
    public void addBuilding(String type){
        zooBuildings.add(new Building(type));
    }
    public void addAnimal(int buildingNumber, Animal animal){
        Building currentBuilding = zooBuildings.get(buildingNumber);
        currentBuilding.addAnimal(animal);
        zooBuildings.set(buildingNumber, currentBuilding);
    }
}