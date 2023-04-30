package OOP.HW4.Actions;


import OOP.HW4.Characters.BaseClass;


public class Battle {
    private BaseClass first;
    private BaseClass second;
    public Battle(BaseClass first, BaseClass second){
        this.first = first;
        this.second = second;
    }

    public BaseClass fight() {
        System.out.println(String.format("\t%s HP is:  %s", first.getName(), first.getHp()));
        System.out.println(String.format("\t%s HP is:  %s", second.getName(), second.getHp()));
        while (first.getHp() > 0 && second.getHp() > 0) {
            Attack(first, second);

            if (second.getHp() <= 0) {
                return first;
            }
            Attack(second, first);
            if (first.getHp() <= 0) {
                return second;
            }
        }
        return second;
    }
    private void  Attack(BaseClass first, BaseClass second){
        int attack;
        attack = first.hit();
        System.out.println(String.format("%s hit %s", first.getName(), attack));
        attack = attack - second.block();
        if (attack < 0) {
            attack = 0;
        }
        System.out.println(String.format("\t%s blocked %d, damage received  - %d", second.getName(), second.block(), attack));
        second.setHp(second.getHp() - attack);
        if (second.getHp() <= 0) {
            System.out.println(String.format("\t\t%s died", second.getName()));
        } else {
            System.out.println(String.format("\t\t%s HP is:  %s", second.getName(), second.getHp()));
        }
    }
}
