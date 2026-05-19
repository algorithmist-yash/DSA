public class MultiLevelInheritance {
    public static void main(String [] args){
        Dog doggy = new Dog();
        doggy.breathe();    // Mulit-level inheritance property
        doggy.breed();      // Single-level inheritance property
        doggy.bark();

        Mammals human = new Mammals();
        human.leg = 2;
        System.out.println(human.leg);
        human.breed();
    }
}


//  Base Class
class Animal{
    String color;

    void eat(){
        System.out.println("Eating");
    }
    void breathe(){
        System.out.println("Breating");
    }
}

// Single-level Inheritance
class Mammals extends Animal{
    int leg;
    void breed(){
        System.out.println("Can breed");
    }
}

// Multi-level Inheritance
class Dog extends Mammals{
    void bark(){
        System.out.println("Barking");
    }
}
