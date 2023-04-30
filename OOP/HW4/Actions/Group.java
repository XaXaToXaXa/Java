package OOP.HW4.Actions;

import OOP.HW4.Characters.BaseClass;
import OOP.HW4.Characters.Lancer;

import java.util.ArrayList;
import java.util.List;

public class Group<T extends BaseClass> {
    List<T> group = new ArrayList<>();

    public Group<T> addMember(T warrior) {
        group.add(warrior);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder groupMembers = new StringBuilder();
        for (T item : group) {
            groupMembers.append(item);
            groupMembers.append("\n");

        }
        groupMembers.append("Team parameters: ");
        groupMembers.append("\n");
        groupMembers.append(String.format("Total healths: %d", healthPoints()));
        groupMembers.append("\n");
        groupMembers.append(String.format("Total demage: %d", getDamage()));
        groupMembers.append("\n");
        groupMembers.append(String.format("Max range: %d", maxRange()));

        return groupMembers.toString();
    }

    public int healthPoints() {
        int sum = 0;
        for (T warrior : group) {
            sum += warrior.getHp();
        }
        return sum;
    }

    public int getDamage() {
        int sum = 0;
        for (T warrior : group) {
            sum += warrior.getWeapon().damage();
        }
        return sum;
    }

    public int maxRange() {
        int max = 0;
        for (T warrior : group) {
            if (warrior instanceof Lancer) {
                if (max < ((Lancer) warrior).getWeapon().range()) {
                    max = ((Lancer) warrior).getWeapon().range();
                }
            }
        }
        return max;
    }

    public int minBlock() {
        int min = 100;
        for (T warrior : group) {
            if (min > warrior.block()) {
                min = warrior.block();
            }
        }
        return min;
    }

    public List<T> getWarriors() {
        return group;
    }

//    public void whoHasMinDefense(String teamName) {
//        System.out.println("*****************************************");
//        System.out.printf("самую минимальную защиту в команде %s имеет:%n", teamName);
//        this.getWarriors().sort(new SortByDefensePoint());
//        System.out.println(this.getWarriors().get(0));
//        System.out.println("*****************************************");
//    }
}

