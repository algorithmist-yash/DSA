public class Abstraction {
    public static void main(String [] args){
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        Chicken c = new Chicken();
        c.eat();
        c.walk();
        System.out.println(c.color);

        h.changeColor();
        System.out.println(h.color);

        c.changeColor();
        System.out.println(c.color);

        // Janwar a = new Janwar();     //Cannot instantiate the type Janwar
        
        
    }
}

abstract class Janwar{
    String color;
    Janwar(){
        color = "brown";
    }
    void eat(){
        System.out.println("Animal eats");
    }
    abstract void walk();
}

class Horse extends Janwar{
    Horse(){
        System.out.println("Horse constructor called");
    }
    void changeColor(){
        color = "dark brown.";
    }
    void walk(){
        System.out.println("Walks on 4 legs.");
    }
}


class Chicken extends Janwar{
    void changeColor(){
        color = "yellow.";
    }
    void walk(){
        System.out.println("Walks on 2 legs.");
    }
}