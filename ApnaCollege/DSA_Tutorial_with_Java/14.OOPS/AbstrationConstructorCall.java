public class AbstrationConstructorCall {
    public static void main(String [] args){
        Mustang myHorse = new Mustang();
        myHorse.changeColor();

        //   Hierarchical constructor called
    }
}



abstract class Janwar{
    String color;
    Janwar(){
        System.out.println("Janwer constructor called");
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

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}
