public class doWhileLoopDemonstration {
    public static void main(String [] args){
        int count = 1;
        do{
            if(count == 8){
                // Break Statement is use to terminate the loop for good.
                break;
            }
            if(count == 4){
                // continue statement is used to ignore the ongoing iteration and shift to next one.
                count++;
                continue;
            }
            System.out.println(count + " - hello ");
            count++;
        }while(count < 10);
        System.out.println();
    }
}
