public class HybridInheritance {
    public static void main(String [] args){
        System.out.println("Example of HybridInheritance");
    }
}

//  Base Class
class Animals{
    String color;

    void eat(){
        System.out.println("Eating");
    }
    void breathe(){
        System.out.println("Breating");
    }
}

// Single-level Inheritance
class Fish extends Animals{ 
    void swim(){
        System.out.println("Swimming");
    }
}

// Single-level Inheritance
class Birds extends Animals{
    void fly(){
        System.out.println("Flying");
    }
}

// Single-level Inheritance
class Mammals extends Animals{
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
