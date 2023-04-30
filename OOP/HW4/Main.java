package OOP.HW4;

import OOP.HW4.Actions.Battle;
import OOP.HW4.Actions.Group;
import OOP.HW4.Characters.BaseClass;
import OOP.HW4.Characters.Knight;
import OOP.HW4.Characters.Lancer;
import OOP.HW4.Characters.Warrior;
import OOP.HW4.LeftHand.Buckler;
import OOP.HW4.LeftHand.EmptySlot;
import OOP.HW4.LeftHand.TowerShield;
import OOP.HW4.RightHand.Blunt;
import OOP.HW4.RightHand.Lance;
import OOP.HW4.RightHand.Sword;


public class Main {
    public static void main(String[] args) {
        Group<Lancer> lancers = new Group<>();
        lancers.addMember(new Lancer("Samael", 150, new Lance(), new EmptySlot()))
                .addMember(new Lancer("Cú Chulainn", 300, new Lance(), new EmptySlot()))
                .addMember(new Lancer("Pal Palich", 200, new Lance(), new EmptySlot()));
        Group<Warrior> blunters = new Group<>();
        blunters.addMember(new Warrior("Semen", 400, new Blunt(), new Buckler()))
                .addMember(new Warrior("Fedya", 350, new Blunt(), new Buckler()))
                .addMember(new Warrior("Misha", 450, new Blunt(), new Buckler()));

        System.out.println(lancers);
        System.out.println();
        System.out.println(blunters);
        System.out.println();
        System.out.printf("Lancers HP: %s \n", lancers.healthPoints());
        System.out.printf("Blunters HP: %s \n", blunters.healthPoints());
        System.out.printf("Lancers Block: %s \n", lancers.minBlock());
        System.out.printf("Blunters Block: %s \n", blunters.minBlock());

        Warrior firstWarrior = new Warrior("Mordred", 200, new Blunt(), new Buckler());
        Knight secondWarrior = new Knight("Arthur Pendragon", 200, new Sword(), new TowerShield());


        Battle ring = new Battle(firstWarrior, secondWarrior);
        BaseClass winner = ring.fight();
        System.out.printf("And the winner is: %s", winner.getName());


    }
}
