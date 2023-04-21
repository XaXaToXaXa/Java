package OOP.HW1.Vending;

public class Main {

    public static void main(String[] args) {
        Machine vendingMachine = new Machine();
        vendingMachine.addProduct(new Product("Lay's", 150))
                .addProduct(new Product("Pringles", 210))
                .addProduct(new Product("Cheetos", 130))
                .addProduct(new Drink("Coca Cola", 75, 0.5))
                .addProduct(new Drink("Pepsi", 100, 1.25))
                .addProduct(new Chocolate("Lindorff", 120, "Black 75%"))
                .addProduct(new Chocolate("Ritter sport", 80, "HazelNut"));

        System.out.println("В автомате следующие товары:");
        vendingMachine.menu();
        Product found = vendingMachine.findProduct("Cheetos");
        System.out.println(" ");
        System.out.println("Ищем: " + found);
        System.out.println(" ");
        Product sold = vendingMachine.sellProduct(found);
        System.out.println("Покупаем товар: " + sold);
        System.out.println("В автомате сейчас " + vendingMachine.getAmount() + " рублей.");
        System.out.println(" ");
        vendingMachine.menu();
        System.out.println(" ");
        Product drink = vendingMachine.sellProduct(vendingMachine.findProduct("Pepsi"));
        System.out.println("Покупаем товар: " + drink);
        System.out.println(" ");
        System.out.println("Остались следующие товары:");
        vendingMachine.menu();
        System.out.println("В автомате сейчас " + vendingMachine.getAmount() + " рублей.");
        Product choco = vendingMachine.sellProduct(vendingMachine.findProduct("Lindorff"));
        System.out.println("Покупаем товар: " + choco);
        System.out.println(" ");
        System.out.println("Остались следующие товары:");
        vendingMachine.menu();
        System.out.println("В автомате сейчас " + vendingMachine.getAmount() + " рублей.");
        System.out.println(" ");

        try {
            Product perf = vendingMachine.sellProduct(vendingMachine.findProduct("Pepsi"));
            System.out.println(perf);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

}
