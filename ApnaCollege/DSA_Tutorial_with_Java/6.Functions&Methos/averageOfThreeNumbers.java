public class averageOfThreeNumbers {
    public static double average(int a, int b, int c){
        return (a+b+c)/3d;
    }
    public static void main(String [] args){
        int a = 5;
        int b = 45;
        int c = 4;
        double avg = average(a,b,c);
        System.out.println("The average of "+ a +","+ b + ","+ c +" = "+avg);
    }    
}
