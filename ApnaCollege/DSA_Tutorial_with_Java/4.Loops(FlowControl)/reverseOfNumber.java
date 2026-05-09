public class reverseOfNumber {
    public static void main(String args[]){
        int num= 10899;
        System.out.println("The number is : "+ num);
        int n = num;
        int rev = 0;
        for (; n > 0;){
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n/10;
        }
        System.out.println("Print reverse of number using for loop : "+ rev);
        
        int reverse = 0;
        while(num > 0 ){
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num /10;
        }

        num = reverse;
        System.out.println("The reverse of the number using while loop is : " + num);

    }
}
