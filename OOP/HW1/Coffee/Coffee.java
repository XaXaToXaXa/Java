package OOP.HW1.Coffee;

public class Coffee {
    public String getName() {
        return name;
    }

    public Double getVolume() {
        return volume;
    }

    public String getTemperature() {
        return temperature;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    private final String name;
    private final Double volume;
    private String temperature;
    private Integer cost;


    public Coffee(String name, Double volume, String temperature ,Integer cost) {
        this.name = name;
        this.volume = volume;
        this.temperature = temperature;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return String.format("%s, %.2f, %s, %d", name, volume, temperature, cost);

    }
}
