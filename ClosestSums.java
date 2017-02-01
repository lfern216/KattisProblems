package Kattis;

import java.util.*;

public class ClosestSums {
	
	public static void main(String[] args) {	
		
		Scanner in = new Scanner(System.in);
		int caseCount = 0;
		
		while(in.hasNextInt()){
		
		int cases = in.nextInt();
		int[] numbers = new int[cases];
		
		for(int i=0;i<cases;i++){
			numbers[i] = in.nextInt(); //distict numbers
		}
		
		int numQueries = in.nextInt();
		int[] queries = new int[numQueries];
		
		for(int k=0;k<numQueries;k++){
			queries[k] = in.nextInt();
		}
		
		int counter = queries.length;
		int c = 0;
		caseCount++;
		System.out.println("Case " + caseCount + ":");
		
		while(counter>0){
		
		int maxSum = 0;
		int range = 10000000;
		counter--;
		
		for(int i=0;i<numbers.length;i++){
			
			int temp = numbers[i];
			
			for(int y=i+1;y<numbers.length;y++){
				
				if(Math.abs((temp+numbers[y])-queries[c])<range){
					maxSum = temp+numbers[y];
					range = Math.abs((temp+numbers[y])-queries[c]);
				}	
			}
		}//end of for big
		
		if(maxSum==0){
			int s = numbers[0]+numbers[1];
		System.out.println("Closest sum to " + queries[c] + " is " + s + ".");
		c++;
		}else{
		System.out.println("Closest sum to " + queries[c] + " is " + maxSum + ".");
		c++; //increment
		}

		}//end of while small
		
		}//end of in.nextint
		
	}//end of main

}//end of class
