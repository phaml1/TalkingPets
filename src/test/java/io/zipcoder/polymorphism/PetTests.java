package io.zipcoder.polymorphism;
import io.zipcoder.polymorphism.Pets.Cat;
import io.zipcoder.polymorphism.Pets.Dog;
import io.zipcoder.polymorphism.Pets.Pet;
import io.zipcoder.polymorphism.Pets.Rabbit;
import org.junit.Test;
import org.junit.Assert;

public class PetTests {

    @Test
    public void rabbitConstructorTest(){
        Pet rabbit = new Rabbit("Teddy");
        String expected = "Teddy";
        Assert.assertEquals(expected, rabbit.getName());
    }

    @Test
    public void petSetName(){
        Pet dog = new Dog("");
        String expected = "Doge";
        dog.setName("Doge");
        Assert.assertEquals(expected, dog.getName());
    }

    @Test
    public void petGetName(){
        Pet cat = new Cat("Whiskers");
        String expected = "Whiskers";
        String actual = cat.getName();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void dogTestSpeak(){
        Pet dog = new Dog("");
        String expected = "Woof!";
        Assert.assertEquals(expected, dog.speak());
    }
}
