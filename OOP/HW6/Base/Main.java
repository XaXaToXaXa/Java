public class Main{
    public static void main(String[] args){
        Persister user1 = new Persister("Bob");
        Saveable saveable = new SaveUser(user1);
        saveable.save();
        Reportable reportable = new ReportUser(user1);
        reportable.report();
        Lazy user2 = new Lazy("Sam");
        user2.save();
        user2.report();

    }
}