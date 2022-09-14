package JavaOOP;

public class Car {
    public Car(String make, String model, int miles, int price, int doors) {
        this.make = make;
        this.model = model;
        this.miles = miles;
        this.price = price;
        this.doors = doors;
    }

    private String make;
    private String model;

    private int miles;
    private int price;
    private int doors;

    public void drive(int miles) {
        this.miles = this.miles + miles;
        System.out.println(make + " " + "drove for " + miles + " miles" + ".");
    }

    public void forSale(int price) {
        this.price = price;
        System.out.println("Selling " + make + " " + model + " for $" + price + ".");

    }
}