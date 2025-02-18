package web.model;

public class Car {
    private int id;
    private String model;
    private String brand;

    public Car() {
    }

    public Car(int id, String model, String brand) {
        this.id = id;
        this.model = model;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brend) {
        this.brand = brend;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", brend='" + brand + '\'' +
                '}';
    }
}
