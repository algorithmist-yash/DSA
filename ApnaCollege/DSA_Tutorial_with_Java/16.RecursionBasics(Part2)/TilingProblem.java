public class TilingProblem{
    public static int tilep(int n){
        if(n==0||n==1){
            return 1;
        }
        return tilep(n-1) + tilep(n-2);
    }
    public static void main(String [] args){
        System.out.println(tilep(3));
    }
}