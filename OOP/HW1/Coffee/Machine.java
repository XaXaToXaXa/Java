package OOP.HW1.Coffee;

import java.util.ArrayList;
import java.util.List;

public class Machine {


    List<Coffee> list = new ArrayList<>();

    public int getAmount() {
        return amount;
    }

    private int amount = 0;

    public Machine addCoffee(Coffee coffee) {
        list.add(coffee);
        return this;
    }


    public List<Coffee> getList() {
        return list;
    }
    public void menu() {
        for (int i = 0; i < getList().size(); i++) {
            System.out.println(getList().get(i));
        }
    }
    public Coffee findDrink(String string) {
        for (int i = 0; i < getList().size(); i++) {
            if (getList().get(i).getName().equals(string)) {
                return getList().get(i);
            }
        }
        return null;
    }

    public Coffee sellDrink(Coffee coffee) {
        try {
            Coffee order = findDrink(coffee.getName());
            getList().remove(order);
            amount += order.getCost();
            return order;

        } catch (Exception ex) {
            throw new RuntimeException("Распродано");

        }


    }

}


