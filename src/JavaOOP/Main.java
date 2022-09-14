package JavaOOP;

public class Main {
    public static void main(String[] args) {

        ClassDemo instance = new ClassDemo();
        instance.number = 10;
        instance.printNumbers();
        instance.printText();

        ClassDemo instance2 = new ClassDemo();
        instance2.text = "new text";
        instance2.printNumbers();
        instance2.printText();

//        Lamp kitchenLamp = new Lamp("Kitchen");
//        Lamp bedroomLamp = new Lamp("Bedroom");
//
//        kitchenLamp.printLightStatus();
//        bedroomLamp.printLightStatus();
//
//        kitchenLamp.lightStatus = true;
//
//        kitchenLamp.printLightStatus();
//        bedroomLamp.printLightStatus();
    }
}
