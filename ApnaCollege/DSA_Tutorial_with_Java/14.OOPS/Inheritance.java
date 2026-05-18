public class Inheritance {
    public static void main(String [] args){
        Fish shark = new Fish();
        shark.eat();

        Dog doggy = new Dog();
        doggy.breathe();
        doggy.breed();
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

class Mammals extends Animal{
    int leg;
    void breed(){
        System.out.println("Can breed");
    }
}

class Dog extends Mammals{
    String bark;
}

//  Derived Class
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("Swim in water");
    }
}
