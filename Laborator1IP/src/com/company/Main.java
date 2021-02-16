package com.company;

public class Main {

    public static void main(String[] args) {
        Zoo myZoo = new Zoo();
        myZoo.addBuilding("bird");
        myZoo.addBuilding("predatory");
        myZoo.addBuilding("fish");
        myZoo.addAnimal(0, new Penguin());
        myZoo.addAnimal(2, new Salmon());
        myZoo.printBuildings();
    }
}
