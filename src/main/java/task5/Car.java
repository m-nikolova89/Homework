package task5;

public class Car extends Vehicle {
    //Instance variables
    private String manufacturerName;
    private String model;
    private int year;
    private String color;
    private String fuel;
    private String gearBox;
    private float engine;//todo validations for the variables

    //Getter & Setters
    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getGearBox() {
        return gearBox;
    }

    public void setGearBox(String gearBox) {
        this.gearBox = gearBox;
    }

    public float getEngine() {
        return engine;
    }

    public void setEngine(float engine) {
        this.engine = engine;
    }

    //Constructor
    public Car(String manufacturer, String model, int year, String color,
               String fuel, String gearBox, float engine) {

        this.manufacturerName = manufacturer;
        this.model = model;
        this.year = year;
        this.color = color;
        this.fuel = fuel;
        this.gearBox = gearBox;
        this.engine = engine;

    }
    public Car(String name){
        setManufacturerName(name);
    }{
        }

    //default constructor
    public Car(){
    }
    //method - actions that any future objects that will be created can do
    public void start(){
        System.out.println(this.manufacturerName + " is starting!");
    }
    //poly
    public void accelerating() {
        System.out.println(this.manufacturerName + " is accelerating...vruuum vrummm vrummm......");
    }
    public void stop() {
        System.out.println(this.manufacturerName + " is stopping");
    }
    public void charge(){
        System.out.println(this.manufacturerName + " is charging....");
    }
}

