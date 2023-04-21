package OOP.HW1.Coffee;

import OOP.HW1.Vending.Product;

public class Main {
    public static void main(String[] args) {
        Machine coffeeMachine = new Machine();
        coffeeMachine.addCoffee(new Coffee("Espresso", 0.2, "Hot", 90))
                .addCoffee(new Coffee("Americano", 0.3, "Medium", 90 ))
                .addCoffee(new Coffee("Capuchino", 0.3, "Hot", 120))
                .addCoffee(new Coffee("Capuchino", 0.4, "Medium", 150))
                .addCoffee(new Tea("Black", 0.3, "Hot", 90, true))
                .addCoffee(new Tea("Green", 0.4, "Cold", 90, false));
        System.out.println("В автомате следующие напитки:");
        coffeeMachine.menu();
        Coffee orderTest = coffeeMachine.findDrink("Espresso");
        Coffee order1 = coffeeMachine.sellDrink(orderTest);
        System.out.println("Покупаем товар: " + order1);
        System.out.println("В автомате сейчас " + coffeeMachine.getAmount() + " рублей.");
        System.out.println(" ");
        coffeeMachine.menu();
        System.out.println(" ");
        Coffee order2 = coffeeMachine.sellDrink(coffeeMachine.findDrink("Capuchino"));
        System.out.println("Покупаем товар: " + order2);
        System.out.println(" ");
        System.out.println("Остались следующие товары:");
        coffeeMachine.menu();
        System.out.println("В автомате сейчас " + coffeeMachine.getAmount() + " рублей.");
        Coffee order3 = coffeeMachine.sellDrink(coffeeMachine.findDrink("Green"));
        System.out.println("Покупаем товар: " + order3);
        System.out.println(" ");
        System.out.println("Остались следующие товары:");
        coffeeMachine.menu();
        System.out.println("В автомате сейчас " + coffeeMachine.getAmount() + " рублей.");
        System.out.println(" ");


    }

}
