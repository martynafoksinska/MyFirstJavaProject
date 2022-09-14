package JavaOOP;

public class Main {
    public static void main(String[] args) {
//        ClassDemo instance = new ClassDemo();
//        instance.printNumbers();
//
//        ClassDemo instance2 = new ClassDemo();
//        instance2.printNumbers();

        Lamp kitchenLamp = new Lamp("Kitchen");
        Lamp bedroomLamp = new Lamp("Bedroom");

        kitchenLamp.printLightStatus();
        bedroomLamp.printLightStatus();

        kitchenLamp.lightStatus = true;

        kitchenLamp.printLightStatus();
        bedroomLamp.printLightStatus();
    }
}
