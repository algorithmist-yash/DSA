public class SubsetsOfString {
    public static void subset(String str, String ans, int idx){
        // Base Case
        if(idx == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
                return;
        }
        
        // Recursion
        // Case 1: consider the character of index i
        subset(str, ans+str.charAt(idx),idx+1);

        // Case 2: not considering the character of index i
        subset(str, ans, idx+1);
    }
    public static void main(String [] args){
        String str = "abc";
        String ans = "";
        subset(str,ans, 0);
    }
}
