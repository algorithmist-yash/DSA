public class oopsBasics{
    public static void main(String [] args){
        // By convention main function should be public and static
        
        Pen p1 = new Pen();     // Pen() here is constructor
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color = "Red";
        System.out.println(p1.color);
    }
}

//  Functions name starts with small letters

class Pen{  //  name of classes to start with capital letters
    
    // Properties

    String color;
    int tip;

    // Functions

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}


class Student{
    String name;
    int age;
    float percentage;   //cgpa

    void calcPercent(int phy, int chem, int maths){
        percentage = (phy+chem+maths)/3;
    }
}