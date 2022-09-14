package JavaOOP;

public class Main3 {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom", "American Shorthair");
        cat.setName("Simba");

        System.out.println("We have an " + cat.getBreed() + " cat named " + cat.getName() + ".");

        cat.makeSound();
        cat.sleep();

        Dog dog = new Dog("Cookie", "West White Highland Terrier");
        dog.makeSound();
        dog.sleep();

        System.out.println("I have a " + dog.getBreed() + " dog named " + dog.getName() + ".");

        dog.goodBoy();

    }
}
