public class varibles_basics {
    public static void main(String args[]){
        // Variables are used to store data in a program. They have a name and a type.
        
        boolean var = false; // this is a boolean variable
        int a = 10; // this is an integer variable
        byte b = 8; // this is a byte variable
        short c = 16; // this is a short variable
        float price = 10.5f; // this is a float variable, we must put f at end of the decimal other wise it will be considered as double variable
        double d = 20.5; // this is a double variable
        char ch = 'A'; // this is a char variable, it can store a single character
        String name = "Yash"; // this is a String variable, it can store a sequence of characters
        System.out.println(var);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(price);
        System.out.println(d);
        System.out.println(ch);
        System.out.println(name);

        System.out.println(Integer.BYTES);
        System.out.println(Byte.BYTES);
        System.out.println(Short.BYTES);
        System.out.println(Float.BYTES);
        System.out.println(Double.BYTES);
        System.out.println(Character.BYTES);
        // System.out.println(String.BYTES); // String is not a primitive data type, it is a class, so it does not have a fixed size in bytes
    }
}
