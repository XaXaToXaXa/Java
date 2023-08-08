public class Main {
    public static void main(String[] args) {
        SingleLinkList<Note> story = new SingleLinkList<>();

        story.addToEnd(new Note(1, "Жили были"));
        story.addToEnd(new Note(2, "Дед да Бабка"));
        story.addToEnd(new Note(3, "И была у них курочка Ряба"));
        story.addToEnd(new Note(4, "И снесла она яичко"));
        story.addToEnd(new Note(5, "Да не простое а золотое"));

        for (Object test : story) {
            System.out.println(test);
        }
        story.reverse();

        System.out.println("************************************");

        for (Object test : story) {
            System.out.println(test);
        }
    }
}
