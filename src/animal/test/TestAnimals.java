/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal.test;

import animal.animals.Animal;
import animal.animals.Cat;
import animal.animals.Fish;
import animal.animals.Pet;
import animal.animals.Spider;

/**
 *
 * @author Java FUND
 */
public class TestAnimals {

    public static void TestAnimal(Animal an){
        if(an instanceof Pet){
            Pet p = (Pet) an;
            System.out.println("Animal name: "+p.getName());
        }
        an.walk();
        an.eat();
        System.out.println("");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fish f  = new Fish();
        Cat c  = new Cat("Garfild");        
        Animal a = new Fish();
        Animal b = new Spider();
        Pet p = new Cat();
        
        Animal[] animals = {f,c,a,b, (Animal) p};
        for (Animal t : animals) {
            TestAnimal(t);
        }
        
    }
    
}
