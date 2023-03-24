public class Lec {
    public static void main(String[] args) {
        // var a = 123;
        // System.out.println(a);
        // System.out.println(getType(a));
        // var b = 123.3465;
        // System.out.println(b);
        // System.out.println(getType(b));
        // b = 5468;
        // System.out.println(b);
        // System.out.println(getType(b));
        int a = 123;
        a = a-- - --a;
        System.out.println(a);
        a = --a - a--;
        System.out.println(a);
        boolean c = 123 != 345;
        System.out.println(c);

    }
    static String getType(Object o){
        return o.getClass().getSimpleName();
    }
}
