import java.util.*;

public class menuSearch {
    public static void menuAvailable(String menu[], String order){
        for(int i = 0; i < menu.length; i++){
            if(menu[i]==order){
                System.out.println("Thanks for placing your order !\nKindly wait for 5 minutes for your service");
                return;
            }
        }
        System.out.println("The order is not available at the moment kindly place something else\nSorry for your inconvinience.");

            
    }
    public static void main(String [] args){
        String menu[] = {"samosa","maggie","pastery","paties","coke","juice","salad","pizza","mineral water"};
        
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < menu.length; i++){
            System.out.println( (i+1) + " "+ menu[i]);
        }
        System.out.print("Your order please: ");
        String order = sc.next();
        menuAvailable(menu, order);
        sc.close();
    }
}
