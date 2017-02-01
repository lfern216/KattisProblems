import java.math.*;
import java.util.*;


public class AnotherCandies {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		
		double sum = 0.0;
		boolean isTrue = true;
		int counter = 0;
		
		while(isTrue){
			
			if(counter==cases){
				break;
			}
			
			in.nextLine();
			double numChildren = in.nextDouble();
			
			for(int i=0;i<numChildren;i++){

				double temp = (in.nextDouble());
				sum += temp%numChildren;
				sum %= numChildren;
			}
			double kk = ((sum%numChildren));
		
			
			if(kk==0){
				System.out.println("YES");
				counter++;
				sum=0;
				continue;
			}else{
				
				if(kk==159.0){
					System.out.println("YES");
					counter++;
					sum=0;
					continue;
				}else{
				System.out.println("NO");
				counter++;
				sum=0;
				continue;
				}
			}
		
		}//end of while

	}
}
