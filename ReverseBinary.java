import java.util.Scanner;


public class ReverseBinary {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		String temp = in.nextLine();
		int number = Integer.parseInt(temp); //13
		int[] res = new int[30];
		int pos = 30;
		int current = 0;
		double remain = 0;
		double sum = 0;
		
		while(true){

				remain = Math.pow(2, pos); 	
			
			if(remain>number){
				current = (int) remain;
				pos--;
			}else{

				res[res.length-pos-1] = 1;
				
				number = (int) (number - remain);
				
				if(number==0){
					break;
				}
			
			}
		}//end of while
	
		boolean is = false;
		sum = 0;
		int counter = 0;
		
		for(int i=0;i<res.length;i++){
			
			if(res[i]==1){
				sum += Math.pow(2, counter);
				counter++;
				is=true;
				
			}else{
				
				if(is){
					counter++;
				}
			}
			
		}//end of for
	
			int d = (int) sum;
			System.out.println(d);
	}	
}
