package JavaOOP;

public class Dog extends Animal {

    public Dog(String name, String breed) {
        super(name, breed);
    }

    @Override
    void makeSound() {
        System.out.println("Hał hał");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping....zzzzz");
    }

    public void goodBoy() {
        System.out.println(super.name + ", come here, who is a good boy?");
    }
}
