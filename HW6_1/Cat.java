import java.util.Objects;

public class Cat {
    int id;
    int age;
    String color;
    String name;
    @Override
    public String toString() {
        return String.format("Номер котика: %d; Имя: %s; Возраст: %d; Цвет: %s!", id, name, age,  color);
    }
    @Override
    public boolean equals(Object o) {
        Cat cats = (Cat) o;
        return age == cats.age && Objects.equals(color, cats.color);
    }
    @Override
    public int hashCode() {
        return Objects.hash(age, color);
    }

}
