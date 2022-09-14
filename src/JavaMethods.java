public class JavaMethods {
    public static void main(String[] args) {
        helloWorld();
        helloMartyna();
        printHello("Paweł");
        getSum(2, 4);
        getSum(3.5, 4.5);
        getSum(3, 4, 5);
        getNameAndAge("Martyna", 26);
        System.out.println(square(2));
    }

    private static void helloWorld() {
        System.out.println("Hello world!");
    }

    private static void helloMartyna() {
        System.out.println("Hello Martyna!");
    }

    private static void printHello(String name) {
        System.out.println("Hello " + name);
    }

    private static void getSum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    private static void getSum(double a, double b) {
        double sum = a + b;
        System.out.println(sum);
    }

    private static void getSum(int a, int b, int c) {
        double sum = a + b + c;
        System.out.println(sum);
    }

    // Create a method that prints name nad age of a person
    private static void getNameAndAge(String name, int age) {
        System.out.println(name + " is " + age + " years old.");
    }

    private static int square(int number) {
        int square = number * number;
        return square;
    }
}