package OOP.HW2.Aqua;

import OOP.HW2.Zoo.Swimable;
import OOP.HW2.Zoo.Walkable;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    private List<MarineLife> marineLifeList = new ArrayList<>();

    public List<MarineLife> getMarineLifeList() {
        return marineLifeList;
    }

    public Aquarium addAnimal(MarineLife animal) {
        marineLifeList.add(animal);
        return this;
    }

    public void printAnimals() {
        for (int i = 0; i < getMarineLifeList().size(); i++) {
            System.out.println(getMarineLifeList().get(i));
        }
    }
    public List<OOP.HW2.Aqua.Interface.Swimable> swimables() {
        List<OOP.HW2.Aqua.Interface.Swimable> swimibles = new ArrayList<>();
        for (var item : marineLifeList) {
            if (item instanceof OOP.HW2.Aqua.Interface.Swimable)
                swimibles.add((OOP.HW2.Aqua.Interface.Swimable) item);
        }
        return swimibles;
    }

    public List<OOP.HW2.Aqua.Interface.Walkable> walkables(){
        List<OOP.HW2.Aqua.Interface.Walkable> walkables = new ArrayList<>();
        for (var item:marineLifeList) {
            if(item instanceof OOP.HW2.Aqua.Interface.Walkable)
                walkables.add((OOP.HW2.Aqua.Interface.Walkable) item);
        }
        return walkables;
    }
    public void printSwimable(){
        for (var item : swimables()) {
            System.out.printf("%s, My speed: %d\n", item.toString(), item.swimingSpeed());
        }
    }
    public void printwalkables(){
        for (var item : walkables()) {
            System.out.printf("%s, My speed: %d\n", item.toString(), item.movingSpeed());
        }
    }
}
