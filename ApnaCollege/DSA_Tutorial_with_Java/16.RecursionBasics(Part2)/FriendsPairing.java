public class FriendsPairing {
    
    public static int firendPairChoice(int n){
        if(n==1|| n==2){
            return n;
        }

        return firendPairChoice(n-1)+ (n-1)*firendPairChoice(n-2);
    }
    
    public static void main(String args[]){
        int n = 3;
        System.out.println(firendPairChoice(n));
    }
}
