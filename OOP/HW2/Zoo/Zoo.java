package OOP.HW2.Zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> listAnimal = new ArrayList<>();

    public List<Animal> getListAnimal(){
        return listAnimal;
    }
    public Zoo addList(Animal animal){
        listAnimal.add(animal);
        return this;
    }
    private Radio radio;

    public void setRadio(Radio radio) {
        this.radio = radio;
    }
    public List<Sayable> getSayble(){
        List<Sayable> sayables = new ArrayList<>();
        for (var item: listAnimal) {
            sayables.add(item);
        }
        sayables.add(radio);
        return sayables;
    }
    public void printAnimals(){
        for (int i = 0; i < getListAnimal().size(); i++) {
            System.out.println(getListAnimal().get(i));
        }
    }
    public void printSounds(){
        for (var item : getSayble()) {
            System.out.println(item.say());
        }
    }

    public void printWalkable(){
        for (var item : walkables()) {
            System.out.printf("%s, My speed: %d\n", item.toString(), item.walkSpeed());
        }
    }
    public void printFlyable(){
        for (var item : flyables()) {
            System.out.printf("%s, My speed: %d\n", item.toString(), item.flySpeed());
        }
    }
    public void printSwimable(){
        for (var item : swimables()) {
            System.out.printf("%s, My speed: %d\n", item.toString(), item.swimSpeed());
        }
    }
    public List<Walkable> walkables(){
        List<Walkable> walkables = new ArrayList<>();
        for (var item:listAnimal) {
            if(item instanceof Walkable)
                walkables.add((Walkable) item);
        }
        return walkables;
    }
    public List<Flyable> flyables(){
        List<Flyable> flyables = new ArrayList<>();
        for (var item:listAnimal) {
            if(item instanceof Flyable)
                flyables.add((Flyable) item);
        }
        return flyables;
    }
    public List<Swimable> swimables(){
        List<Swimable> swimibles = new ArrayList<>();
        for (var item:
             listAnimal) {
            if (item instanceof Swimable)
                swimibles.add((Swimable) item);
        }
        return swimibles;
    }
    public Walkable winnerWalk(){
        int index = 0;
        for (int i = 0; i < walkables().size(); i++){
            if(walkables().get(i).walkSpeed() > walkables().get(index).walkSpeed())
                index = i;
        }
        return walkables().get(index);
    }
    public Flyable winnerFly(){
        int index = 0;
        for (int i = 0; i < flyables().size(); i++){
            if(flyables().get(i).flySpeed() > flyables().get(index).flySpeed())
                index = i;
        }
        return flyables().get(index);
    }
    public Swimable winnerSwim(){
        int index = 0;
        for (int i = 0; i < swimables().size(); i++) {
            if(swimables().get(i).swimSpeed() > swimables().get(index).swimSpeed())
                index = i;
        }
            return swimables().get(index);
    }
}
