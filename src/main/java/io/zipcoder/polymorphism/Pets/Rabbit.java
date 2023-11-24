package io.zipcoder.polymorphism.Pets;

public class Rabbit extends Pet{

    public Rabbit(String name) {
        super(name);
    }

    @Override
    public String speak(){
        System.out.println("Thump!");
        return "Thump!";
    }
}
