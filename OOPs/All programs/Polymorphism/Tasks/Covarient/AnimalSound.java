//  Animal Sounds
// In an animal sounds application, create a base class called "Animal" with a method called "makeSound" that returns an instance of the "Sound" class. Implement derived classes like "Dog" and "Cat" that override the "makeSound" method and return their specific sound objects.

class Animal{
    void makeSound(){
        System.out.println("Animal making sound!!");
    }
}

class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Dog making sound!!");
    }
}

class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("Cat making sound!!");
    }
}



public class AnimalSound {
    public static void main(String[] args) {
        Animal a;
        a = new Animal();
        a.makeSound();

        a = new Dog();
        a.makeSound();

        a = new Cat();
        a.makeSound();


    }
}
