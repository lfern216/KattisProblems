package Kattis;

import java.util.Scanner;

public class Server {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		String[] ss = in.nextLine().split(" ");
		
		int cases = Integer.parseInt(ss[0]);
		int top = Integer.parseInt(ss[1]);
		int total = 0;
		int counter = 0;
		
		for(int i=0;i<cases;i++){
			
		int temp = in.nextInt();
		
		if(temp+total==top){
			total = temp+total;
			counter++;
			break;
		}else if(temp+total<top){
			total += temp; 
			counter++;
		}else{
			break;
		}
			
		}
		
System.out.println(counter);
	}

}
