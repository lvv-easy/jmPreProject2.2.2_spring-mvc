package web.model;

public class Car {

    private String manufacturer;
    private String model;
    private String engine;

    public Car() {};

    public Car(String manufacturer, String model, String engine) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.engine = engine;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "\nCar{" +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", color='" + engine + '\'' +
                '}';
    }
}
