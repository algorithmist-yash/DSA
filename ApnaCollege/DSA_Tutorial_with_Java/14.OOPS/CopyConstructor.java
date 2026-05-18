public class CopyConstructor {
    public static void main(String [] args){
        Student s1 = new Student();
        s1.name= "Yash";
        s1.roll = 5425;
        s1.password = "password";

        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.password = "xyz";

        s1.roll=24;
        s1.marks[2] = 90;      // Though only till earlier there should be changes
        // but still for some reason the change in s1 still affect s2
        // it is beccause the pass by referece (or reference copy) is happening for arrays
        // and due to pass by values in roll it is different for both objects s1 and s2

        for(int i = 0; i< 3; i++){
            System.out.println(s2.marks[i]);//  100 90 90
        }
        System.out.println(s1.roll);// 24
        System.out.println(s2.roll);//5425
    }    
}

class Student{
    String name;
    int roll;
    String password;
    int marks[];
    //  Shallow Copy constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }
    Student(){
        marks = new int[3];
        System.out.println("A non-PARAMETERIZED Constructor is called!!");
    }
    Student(String name){
        marks = new int[3];
        this.name = name;
    }
    Student(int roll){
        marks = new int[3];
        this.roll = roll;
    }
}
