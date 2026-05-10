public class sum {

    public static int add(int a, int b){
        return a+b;
    }

    // public static void add(int a, int b){
    //     System.out.println(a+b);
    // }

    public static void add(){
        int a = 5;
        int b = 6;
        System.out.println(a+b);
    }
    public static void main(String [] args){
        int a = 5;
        int b = 6;
        int sum = add(a,b);
        System.out.println(sum);
        add(); 
    }
}
