package OOP.HW2.Zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.setRadio(new Radio());

        zoo.addList(new Wolf("Big Bad Wolf"))
                .addList(new Hare("Bags Bunny"))
                .addList(new Duck("Duffy Duck"))
                .addList(new Condor("Hungry Henry"))
                .addList(new Tuna("Magic Tuna"))
                .addList(new Whale("Moby dick"))
                .addList(new FlyingFish("Wonder Fish"));
        System.out.println("Welcome to our Zoo!!!\nHere you can see:");
        zoo.printAnimals();
        System.out.println("------------------");
        System.out.println("Try to guess sound you heard:");
        zoo.printSounds();
        System.out.println("------------------");
        zoo.printWalkable();
        System.out.println("-----------------");
        zoo.printFlyable();
        System.out.println("----------------");
        zoo.printSwimable();
        System.out.println("----------------");
        System.out.println("Winner: " + zoo.winnerWalk() + ". With speed: " + zoo.winnerWalk().walkSpeed());
        System.out.println("-----------------");
        System.out.println("Winner " + zoo.winnerFly() + ". With speed: " + zoo.winnerFly().flySpeed());
        System.out.println("------------------");
        System.out.println("Winner: " + zoo.winnerSwim()+ ". With speed: " + zoo.winnerSwim().swimSpeed());
    }
}