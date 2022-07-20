package Lab6;

abstract class Animal implements Greetable {
    
     public abstract void greeting();
 
}

class Cat extends Animal {

    @Override
    public void greeting() { // package
        
        System.out.println("Meow");
    }

}
class Dog extends Animal {

    @Override
    public void greeting() {
   
        System.out.println("Woof!");
    }
    
    void greeting(Dog another) {
    
        System.out.println("Woof!!");
    }
    
}
class BigDog extends Dog {
    
    
    @Override
    public void greeting() {
    
        System.out.println("Woow!");
    
    }
    
    @Override
    public void greeting (Dog another) {
    
      System.out.println("Woooooooooooow!");
    
    }
    
    
}
public class TestAnimal {
   public static void main(String[] args) {
      // Using the subclasses
      Cat cat1 = new Cat();
      cat1.greeting(); // Moew
      Dog dog1 = new Dog();
      dog1.greeting(); //Woof!
      BigDog bigDog1 = new BigDog();
      bigDog1.greeting(); //Woow!
       
      // Using Polymorphism
      Animal animal1 = new Cat();
      animal1.greeting(); // Meow
      Animal animal2 = new Dog();
      animal2.greeting(); // Woof!
      Animal animal3 = new BigDog();
      animal3.greeting(); // Woow!
      //Animal animal4 = new Animal();
   
   }
}

