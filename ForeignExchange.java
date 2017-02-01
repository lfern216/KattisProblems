import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
 
class ForeignExchange {
	
	static String numbers = "";

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int choice = 0;
		int c=0;
		
		while(in.hasNext()){
			List<String> list = new ArrayList<String>(); 
			int cases = in.nextInt();
			in.nextLine();
		
		if(cases==0){
			//System.out.println("\n");
			break;
		}
		
		for(int i=0;i<cases;i++){
			numbers = in.nextLine();
			String[] splitter = numbers.split(" ");
			int x = Integer.parseInt(splitter[0]);
			int y = Integer.parseInt(splitter[1]);
			list.add(x + " = " + y); //1=2, 1=3
		}

		choice=0;
		
		for(int k=0;k<list.size();k++){
			
			String checker = list.get(k); //1=2
			
			if(choice==1){
				break;
			}
			
					for(int g=0;g<list.size();g++){
						
						if(!method(list,checker)){
							System.out.println("NO");
							choice=1;
							break;
						}else{
							break;
						}
						
						}//end of for (small)
			}//end of for (big)
		
		if(choice==0){
		System.out.println("YES");
			}
		}//end of while
	}//end of main
	
	public static boolean method(List<String> list,String checker){

		int counterReverse = 0;
		int counter = 0;
		
		String[] splitter = checker.split(" ");
		String xx = splitter[0];
		String yy = splitter[splitter.length-1];
		
		for(int i=0;i<list.size();i++){
			
			if(list.get(i).equals(checker)){
				counterReverse++;
			}
			if(list.get(i).equals(yy+" = "+xx)){
				counter++;
			}
		}
		return counter==counterReverse;
	}//end of method
}
