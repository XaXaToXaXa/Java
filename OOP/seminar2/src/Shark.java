public class Shark extends Predator implements Swimible{

    public Shark(String name){
        super(name);
    }
    @Override
    public String say() {
        return "Arr-rrr-rrr";
    }

    @Override
    public int speedSwim() {
        return 130;
    }
}
