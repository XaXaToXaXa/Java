public class Lazy extends User implements Saveable,Reportable{
    public Lazy(String name) {
        this.name =  name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void report() {
        System.out.println("Report for lazy user: " + getName());
    }

    @Override
    public void save() {
        System.out.println("Save lazy user: " + getName());
    }
}
