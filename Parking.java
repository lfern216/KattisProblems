import java.util.Scanner;

public class Parking {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String integers = in.nextLine();
		String[] rates = integers.split(" ");
		int[] trucks = new int[6];
		int count = 0;
		int sum = 0;
		int min = 1000;
		
		
		for(int i=0;i<3;i++){
			String first = in.nextLine();
			String[] splitter = first.split(" ");
			trucks[count] = Integer.parseInt(splitter[0]);
			trucks[count+1] = Integer.parseInt(splitter[1]);
			count += 2;
		}
		int a = trucks[1]; //1
		int b = trucks[3]; //3
		int c = trucks[5]; //5
		
		//find min to replace in bottom loop
		
		for(int i=0;i<trucks.length;i++){
			
			if(min>trucks[i]){
				min = trucks[i];
			}
		}
	
		for(int i=min;i<100;i++){
			
			if((a<=0 && b<=0 && c<=0)){
				break;
			}
			
			if(trucks[0]<=i && trucks[2]<=i && trucks[4]<=i && (trucks[1]>i && trucks[3]>i && trucks[5]>i)){
				
				sum += Integer.parseInt(rates[2])*3;
				a--;
				b--;
			    c--;
			}else if(trucks[0]<=i && trucks[2]<=i && (trucks[1]>i && trucks[3]>i)){
				
				sum += Integer.parseInt(rates[1])*2;
				a--;
				b--;
			}else if(trucks[2]<=i && trucks[4]<=i && (trucks[3]>i && trucks[5]>i)){
				
				sum += Integer.parseInt(rates[1])*2;
				b--;
				c--;
				
			}else if(trucks[0]<=i && trucks[4]<=i && (trucks[1]>i && trucks[5]>i)){
				
				sum += Integer.parseInt(rates[1])*2;
				a--;
				c--;
				
			}else if(trucks[0]<=i && trucks[1]>i){
				
				sum += Integer.parseInt(rates[0]);
				a--;
				
			}else if(trucks[2]<=i && trucks[3]>i){
				
				sum += Integer.parseInt(rates[0]);
				b--;
				
			}else if(trucks[4]<=i && trucks[5]>i){
				
				sum += Integer.parseInt(rates[0]);
				c--;
			}else{
				if(a==trucks[1] || b==trucks[3] || c==trucks[5]){
					continue;
					
				}else{
				a=0;
				b=0;
				c=0;
				}
			}
	
		}
		System.out.println(sum);
		
	}

}
