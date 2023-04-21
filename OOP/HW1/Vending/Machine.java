package OOP.HW1.Vending;

import java.util.ArrayList;
import java.util.List;

public class Machine {


    List<Product> list = new ArrayList<>();

    public int getAmount() {
        return amount;
    }

    private int amount = 0;

    public Machine addProduct(Product product) {
        list.add(product);
        return this;
    }


    public List<Product> getList() {
        return list;
    }

    public Product findProduct(String string) {
        for (int i = 0; i < getList().size(); i++) {
            if (getList().get(i).getName().equals(string)) {
                return getList().get(i);
            }
        }
        return null;
    }

    public Product sellProduct(Product product) {
        try {
            Product prodFound = findProduct(product.getName());
            getList().remove(prodFound);
            amount += prodFound.getCost();
            return prodFound;

        } catch (Exception ex) {
            throw new RuntimeException("Распродано");

        }


    }
    public void menu() {
        for (int i = 0; i < getList().size(); i++) {
            System.out.println(getList().get(i));
        }
    }
}


