package OOP.HW2.Aqua;

import OOP.HW2.Aqua.Animals.*;

public class Main {
    public static void main(String[] args) {
        Aquarium aqua = new Aquarium();

        aqua.addAnimal(new Dolphin("Flipper"))
                .addAnimal(new Frogfish("Clown"))
                .addAnimal(new KillerWhale("Willy"))
                .addAnimal(new Octopus("Lucky"))
                .addAnimal(new Shark("Sam"))
                .addAnimal(new РermitСrab("Homer"));
        System.out.println("        Let`s see who lives here:");
        aqua.printAnimals();
        System.out.println("        Let`s see who can swim:");
        aqua.printSwimable();
        System.out.println("        Let`s see who can walk:");
        aqua.printwalkables();
    }
}
