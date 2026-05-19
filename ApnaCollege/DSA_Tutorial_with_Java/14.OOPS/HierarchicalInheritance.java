public class HierarchicalInheritance {
    public static void main(String [] args){
        Animals a = new Animals();
        a.eat();
        a.breathe();


        Fish f = new Fish();
        f.swim();
        f.eat();
        f.breathe();

        Birds b = new Birds();
        b.fly();
        b.breathe();


        Mammals m = new Mammals();
        m.eat();
        m.walk();
    }    
}

class Animals{
    void eat(){
        System.out.println("Eating");
    }
    void breathe(){
        System.out.println("Breathing");
    }
}

class Fish extends Animals{ 
    void swim(){
        System.out.println("Swimming");
    }
}

class Birds extends Animals{
    void fly(){
        System.out.println("Flying");
    }
}

class Mammals extends Animals{
    void walk(){
        System.out.println("Walking");
    }
}
