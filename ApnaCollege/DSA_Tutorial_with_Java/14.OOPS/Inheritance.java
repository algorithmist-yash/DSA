public class Inheritance {
    public static void main(String [] args){
        Fish shark = new Fish();
        shark.eat();

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


//  Derived Class - single level inheritance
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("Swim in water");
    }
}
