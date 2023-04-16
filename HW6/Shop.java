package HW6;

import java.util.*;

public class Shop {
    List<Laptop> list = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public Shop addGoods(Laptop laptop) {
        list.add(laptop);
        return this;
    }

    public List<Laptop> getList() {
        return list;
    }

    public void printList() {
        for (int i = 0; i < getList().size(); i++) {
            System.out.println(getList().get(i));
        }
    }

    public Map<Integer, String> searchParametr() {
        Map<Integer, String> config = new HashMap<>();
        config.put(1, "Производитель");
        config.put(2, "Диагональ");
        config.put(3, "ОЗУ");
        config.put(4, "Жесткий диск");
        config.put(5, "Цвет");
        return config;
    }


    public void searchName(String string) {
        for (int i = 0; i < getList().size(); i++) {
            if (getList().get(i).getName().equals(string)) {
                System.out.println(getList().get(i));
            }
        }
        System.out.println("***");
    }

    public void searchColour(String col) {
        for (int i = 0; i < getList().size(); i++) {
            if (getList().get(i).getColour().equals(col)) {
                System.out.println(getList().get(i));
            }
        }
        System.out.println("***");
    }

    public void searchHdd(int hdd) {
        for (int i = 0; i < getList().size(); i++) {
            if (getList().get(i).getHdd() == hdd) {
                System.out.println(getList().get(i));
            }
        }
        System.out.println("***");
    }

    public void searchSize(double size) {
        for (int i = 0; i < getList().size(); i++) {
            if (getList().get(i).getSize() == size) {
                System.out.println(getList().get(i));
            }
        }
        System.out.println("***");
    }

    public void searchRam(int ram) {
        for (int i = 0; i < getList().size(); i++) {
            if (getList().get(i).getRam() == ram) {
                System.out.println(getList().get(i));
            }
        }
        System.out.println("***");
    }

    public String getOperations() {
        String text = "   --------------\n        Меню \n   --------------\n " +
                "1. Выбор параметра \n " +
                "2. Список ноутбуков\n " +
                "3. Выход";
        System.out.println(text);
        System.out.print(" Сделайте выбор -> ");
        String answer = sc.next();
        return answer;
    }

    public int getSearch() {
        String text = "   --------------\n        Поиск \n   --------------\n " +
                "1. По производителю.\n " +
                "2. По диагонали.\n " +
                "3. По ОЗУ.\n " +
                "4. По объему ЖД.\n " +
                "5. По цвету.\n " +
                "6. Выход.";
        System.out.println(text);
        System.out.print(" Сделайте выбор -> ");
        int answer = sc.nextInt();
        return answer;
    }

    public void start() {
        boolean flag = true;
        while (flag) {
            String operation = getOperations();
            if (operation.equals("3")) {
                flag = false;
                sc.close();
            } else if (operation.equals("2")) {
                printList();
            } else if (operation.equals("1")) {
                int search = getSearch();
                while (search != 6) {
                    if (search == 1) {
                        System.out.println("Укажите брэнд: ");
                        String temp = sc.next();
                        searchName(temp);
                        break;
                    }
                    if (search == 2) {
                        System.out.println("Укажите диагональ: ");
                        double temp = sc.nextDouble();
                        searchSize(temp);
                        break;
                    }
                    if (search == 3) {
                        System.out.println("Укажите объем ОЗУ: ");
                        int temp = sc.nextInt();
                        searchRam(temp);
                        break;
                    }
                    if (search == 4) {
                        System.out.println("Укажите объем ЖД: ");
                        int temp = sc.nextInt();
                        searchHdd(temp);
                        break;
                    }
                    if (search == 5) {
                        System.out.println("Укажите цвет: ");
                        String temp = sc.next();
                        searchColour(temp);
                        break;
                    }
                }
            }
        }
    }
}


