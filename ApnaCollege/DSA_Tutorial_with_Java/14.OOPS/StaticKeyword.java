public class StaticKeyword {
    public static void main(String [] args){
        Student s1 = new Student();
        s1.schoolName = "TAPS";

        Student s2 = new Student();
        System.out.println(s2.schoolName);      //TAPS
    
        Student s3 = new Student();
        s3.schoolName = "SSC";

        System.out.println(s1.schoolName);
        
        System.out.println(s2.schoolName);

        System.out.println(s3.schoolName);

    }
}

// Static keyword uses memore uses optimization

class Student{

    static int returnPercentage(int math, int phy, int chem){
        return (math+phy+chem)/3;
    }

    String name;
    int roll;

    static String schoolName;
    // static variable is unique and only one which uses a concept of  reference. Therefore, all the objects of same class refers to same reference of static variable.

    void getName(String name){
        this.name  = name;
    }

    String getName(){
        return this.name;
    }
}