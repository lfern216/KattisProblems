package Kattis;

import java.util.Scanner;

public class SodaSurpler {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int totaldrink = 0;
		int total = 0;
		
		totaldrink =  a+b;
		
		if(totaldrink%c==0){
		totaldrink = totaldrink/c; 
		total = totaldrink;
		}
		
		int temp = 0;
		int temp2 = 0;
		
		while(!((totaldrink == temp))){
			
			temp = totaldrink%c; 
			temp2 = totaldrink/c; 
			totaldrink = temp+temp2;
			total += temp2;
		}
		
		System.out.println(total);
	}
}
