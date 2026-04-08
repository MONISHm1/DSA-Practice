class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meow");
    }
}

public class Main {
    public static void main(String[] args) {

        Dog a = new Dog();
        a.sound();

        Cat b = new Cat();
        b.sound();
    }
}