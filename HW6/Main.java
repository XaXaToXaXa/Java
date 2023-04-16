package HW6;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.addGoods(new Laptop("Samsung", 15.6, 8, 256, "no OS", "Black"))
                .addGoods(new Laptop("HP", 13.3, 16, 512, "Windows 11", "Silver"))
                .addGoods(new Laptop("HP", 17.3, 32, 256, "Windows 10", "Silver"))
                .addGoods(new Laptop("ASUS", 15.6, 16, 1024, "Ubuntu 22/04", "White"))
                .addGoods(new Laptop("Dell", 17.3, 32, 2048, "Kali", "Blue"))
                .addGoods(new Laptop("Apple", 16, 96, 8192, "Mac Os", "Pink"));

        shop.start();

    }
}
