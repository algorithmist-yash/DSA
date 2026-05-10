public class functionOverloadingDemonstration {

    // Overloading with function return Data Type
    public static float multiply(float a , float b){
        return a*b;
    }

    // Overloading with parameters count
    public static int multiply(int a, int b){   // 2 parameters
        return a*b;
    }
    public static int multiply(int a, int b, int c){    // 3 parameters
        return a*b*c;
    }
    public static void main(String [] args){
        int a = 5;
        int b = 2;
        int c = 3;
        System.out.println(multiply(a,b,c));
        System.out.println(multiply(a,b));
        float x = 5.0f;
        float y = 6.0f;
        System.out.println(multiply(x,y));
    }
}
