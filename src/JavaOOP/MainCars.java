package JavaOOP;

public class MainCars {
    public static void main(String[] args) {

        Sedan corolla = new Sedan("Toyota", "Corolla", 0, 20000);
        Coupe camaro = new Coupe("Chevrolet", "Camaro", 15000, 35000);

        corolla.drive(12000);
        camaro.drive(5000);

        corolla.forSale(18000);
        camaro.forSale(30000);
    }
}
