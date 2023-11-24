package io.zipcoder.polymorphism;

import io.zipcoder.polymorphism.Pets.Cat;
import io.zipcoder.polymorphism.Pets.Dog;
import io.zipcoder.polymorphism.Pets.Pet;
import io.zipcoder.polymorphism.Pets.Rabbit;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Pet> pets;

    public static void main(String[] args){
        System.out.println("How many pets do you have?");
        int petNum = input.nextInt();
        String[] petType = new String[petNum];
        String[] petName = new String[petNum];
        for(int i = 0; i <petNum; i++) {

            System.out.println("What kind of pet?");
            petType[i] = input.nextLine();
            System.out.println("What is their name?");
            petName[i] = input.nextLine();
        }
        for (int i = 0; i < petNum; i++){
            switch (petType[i].toLowerCase()){
                case "dog":
                    Pet dog = new Dog(petName[i]);
                    pets.add(dog);
                case "cat":
                    Pet cat = new Cat(petName[i]);
                    pets.add(cat);
                case "rabbit":
                    Pet rabbit = new Rabbit(petName[i]);
                    pets.add(rabbit);
            }
        }
        System.out.println(pets);
    }

}
