package OOP.HW5.model;

public class NewUserMapper extends UserMapper{
    public String map(User user, String splitter) {
        String text = String.join(splitter, user.getId(), user.getFirstName(), user.getLastName(), user.getPhone());
        return text;
    }


    public User map(String line, String splitter) {
        String[] lines = line.split(splitter);
        return new User(lines[0], lines[1], lines[2], lines[3]);
    }
}
