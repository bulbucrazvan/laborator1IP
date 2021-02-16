package com.company;
import java.io.FileWriter;
import java.io.IOException;
public class Main {

    public static void main(String[] args) {

        Zoo myZoo = new Zoo();
        myZoo.addBuilding("bird");
        myZoo.addBuilding("predatory");
        myZoo.addBuilding("fish");
        myZoo.addAnimal(0, new Penguin());
        myZoo.addAnimal(2, new Salmon());
        myZoo.addAnimal(1, new Tiger());
        myZoo.addAnimal(1, new Tuna());
        myZoo.addAnimal(1, new Wolf());
        myZoo.printBuildings();

        try {
            FileWriter myWriter = new FileWriter("Zoo.txt");
            myWriter.write(myZoo.getInfo());
            myWriter.close();
            System.out.println();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
