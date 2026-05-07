import java.util.*;
import java.lang.*;

public class squareOfRectangle{
	public static void main(String [] args){
		// declaring and creating a scanner class to input
		Scanner sc = new Scanner(System.in);
		
		// input number of test cases
		int t= sc.nextInt();
		
		//input t test cases 
		while(t-- >0){
			int l1=sc.nextInt(); int b1=sc.nextInt();
			int l2=sc.nextInt(); int b2=sc.nextInt();
			int l3=sc.nextInt(); int b3=sc.nextInt();
		
			int area = l1*b1 + l2*b2 + l3*b3;
			int s = (int) Math.sqrt(area);
		
			if(s*s !=area){
				System.out.println("NO");
				continue;
			}
			
			Boolean ok = false;
		
			// Case 1: all rectangle are stacked vertically
			if ( l1==s && l2==s && l3==s && (b1+b2+b3 == s)){
				ok = true;
			}
	
			//Case 2: one rectangle on left, two stacked on right
			if(l1==s){
				if(l2==l3 && (b2+b3==s) && (b1+l2==s)){
					ok = true;
				}
			}

			// Case 3: one big horizontal + two side-by-side
			if(b1==s){
				if(b2==b3 && l2+l3 ==s && l1+b2==s){
					ok=true;
				}
			}

			System.out.println(ok? "YES" : "NO");
		}
		sc.close();
	}
}