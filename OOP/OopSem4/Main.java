package OopSem4;

public class Main {
    public static void main(String[] args) {
        Team<Archer> archersTeam = new Team<>();
        archersTeam.add(new Archer("George", new Bow(), 30))
                    .add(new Archer("Bob", new Bow(), 25));
        
        Team<Assasin> assasinTeam = new Team<>();
        assasinTeam.add(new Assasin("Ecio",new Knife(), 20))
                    .add(new Assasin("Maria", new Knife(), 35));

        System.out.println(archersTeam);
        System.out.println(assasinTeam);
        
        Battle placeOfBattle = new Battle(new Archer("Henry", new Bow(), 30), 
                               new Assasin("Jonny", new Knife(), 34));
        Warrior winner = placeOfBattle.fight();

        System.out.println(winner);
    }
    
}
