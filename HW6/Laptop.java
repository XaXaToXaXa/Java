package HW6;
//Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы. Реализовать в Java.
//Создать множество ноутбуков.
//Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.
//Критерии фильтрации можно хранить в Map. Например:
//Введите цифру, соответствующую необходимому критерию:
//        1 - ОЗУ
//        2 - Объём ЖД
//        3 - Операционная система
//        4 - Цвет …
//Далее нужно запросить минимальные значения для указанных критериев — сохранить параметры фильтрации можно также в Map.
//Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.


public class Laptop {

    public String getName() {
        return name;
    }

    public double getSize() {
        return size;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public String getOs() {
        return os;
    }

    public String getColour() {
        return colour;
    }

    private String name;
    private double size;
    private int ram;
    private int hdd;
    private String os;
    private String colour;

    public Laptop(String name, double size, int ram, int hdd, String os, String colour) {
        this.name = name;
        this.size = size;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return String.format("Производитель: %s \nДиагональ: %.1f' \nОбъем оперативной памяти: %d Гб \nОбъем накопителя: %d Гб \nОС: %s \nЦвет: %s \n",
                this.name, this.size, this.ram, this.hdd, this.os, this.colour);
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Laptop) return this.name.equals(((Laptop) obj).name) && this.ram == ((Laptop) obj).ram
                && this.hdd == ((Laptop) obj).hdd && this.os.equals(((Laptop) obj).os)
                && this.colour.equals(((Laptop) obj).colour) && this.size == ((Laptop) obj).size;
        return false;

    }
}
