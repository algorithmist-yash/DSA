public class constructor {
    public static void main(String []args){
        
        //  Java only creates default constructor if there is no other constructor existing in the class
        Student s1 = new Student();   // This is decalaration for default constructor
        System.out.println(s1.name);   
        System.out.println(s1.roll);

        Student s2 = new Student("Yash");
        System.out.println(s2.name);
        
        Student s3 = new Student(25);
        System.out.println(s3.roll);
        // Student s4 = new Student("Yash" , 5425);     // error
    }
}

class Student{
    String name;
    int roll;

    //  Java creates its own constructor if and only if there is no other constructors.

    // Constructor overloading
    Student(){
        System.out.println("Default constructor / NON-PARAMETERIZED CONSTRUCTOR is called");
    }
    Student(String name){
        System.out.println("PARAMETERIZED CONSTRUCTOR is called.");
        this.name = name;
    }
    Student(int roll){
        System.out.println("PARAMETERIZED CONSTRUCTOR is called");
        this.roll = roll;
    }
}