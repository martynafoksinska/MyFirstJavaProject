public class JavaMethods {
    public static void main(String[] args) {
        helloWorld();
        helloMartyna();
        printHello("Paweł");
        getSum(2, 4);
        getNameAndAge("Martyna", 26);
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

    // Create a method that prints name nad age of a person

    private static void getNameAndAge(String name, int age) {
        System.out.println(name + " is " + age + " years old.");
    }
}