package web.models;


public class Car {
    private static int COUNT_CARS = 0;

    private final int id;
    private String model;
    private String color;

    public Car() {
        id = ++COUNT_CARS;
    }

    public Car(String model, String color) {
        id = ++COUNT_CARS;
        this.model = model;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
