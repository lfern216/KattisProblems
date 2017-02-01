package Kattis;

import java.util.Scanner;

public class SumOfTheOthers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int max = -1000;
		
		while(in.hasNextLine()){
		
		String [] spliter = in.nextLine().split(" ");

		for(int i=0;i<spliter.length;i++){
			
			int temp = Integer.parseInt(spliter[i]);
			if(temp>max){
				max = temp;
			}
			
		}//end of for
		
		System.out.println(max);
		max = -1000;
		
		}
	}

}
/*
-54 -32 -21 -65 -78
-54 -32 -21 -65 -78
 */
 
