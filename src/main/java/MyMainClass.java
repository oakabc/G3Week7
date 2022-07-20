
class Animal {

    public void animalSound() {
        System.out.println("The animal makes a sound");

    }
}

class Pig extends Animal {

    @Override
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }

}

class Dog extends Animal {

    @Override
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

public class MyMainClass {

    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Ref Type = Animal Obj Type = Animal 
        Animal myPig = new Pig(); // Ref Type = Animal Obj Type = Pig
        Animal myDog = new Dog(); // Ref Type = Animal Obj Type = Dog
        
        // Dynamic Binding - Late Binding - Dynamic Polymorphism - Runtime Polymorphism
        myAnimal.animalSound(); 
        myPig.animalSound();
        myDog.animalSound();
        
        
        Dog dog = new Dog();
        dog.animalSound();
    }
}
