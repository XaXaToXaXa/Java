package linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1); 
        list.add("s"); 
        list.add(2);
        list.add(true);

for (Element item : list) {
System.out.println(item);
}
}
}
