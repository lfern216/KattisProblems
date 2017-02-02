package Kattis;

import java.util.Scanner;

public class Pet {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int currentTotal = 0;
		int location = -1;
		int totalf = 0;
		
		for(int i=0;i<5;i++){
			
			currentTotal += in.nextInt();
			currentTotal += in.nextInt();
			currentTotal += in.nextInt();
			currentTotal += in.nextInt();
			
			if(currentTotal > totalf){
				totalf = currentTotal;
				location = i+1;
				currentTotal = 0;
			}else{
				currentTotal = 0;
			}
		}
		System.out.println(location + " " + totalf);
	}
}
