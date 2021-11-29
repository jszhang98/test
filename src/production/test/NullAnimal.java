package production.test;

public class NullAnimal extends Animal{
    @Override
    void display() {
        System.out.println("NullAnimal is displaying!");
    }

    @Override
    void makeSound() {
        System.out.println("NullAnimal is making Sound!");

    }
}
