package OOP.HW3;

public class Main {
    public static void main(String[] args) {
        Linked linked = new Linked();
        linked.addToList(3)
                .addToList(5)
                .addToList(1)
                .addToList("Two")
                .addToList("Four")
                .addToList(false);
        for (Element item : linked) {
            System.out.println(item);
        }
    }
}
