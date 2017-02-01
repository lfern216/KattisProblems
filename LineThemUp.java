package Kattis;

import java.util.Scanner;

public class LineThemUp {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String n = in.nextLine();
		int nn = Integer.parseInt(n);
		String last = "";
		boolean decreasing = false;
		boolean increasing = false;
		String temp = "";
		
		for(int i=0;i<nn;i++){
			
			temp = in.nextLine();
			
			if(i != 0){
				
				if(last.compareTo(temp)<0){ //J<K
					increasing=true;
					last = temp;
				}else{
					decreasing=true;
					last = temp;
				}
				
			}else{
				last = temp;
			}
		}//end of for
		
		if(increasing && decreasing){
			System.out.println("NEITHER");
		}
		else if(increasing){
			System.out.println("INCREASING");
		}else{
			System.out.println("DECREASING");
		}
	}

}
