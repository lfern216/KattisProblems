package Kattis;

import java.util.Scanner;

public class natrij {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String first = in.nextLine();
		String second = in.nextLine();
		int totala = 0;
		int totalb = 0;
		int totalc = 0;
		
		String a = "";
		String b = "";
		String c = "";
		
		int hours = Integer.parseInt(first.substring(0, 2));
		int min = Integer.parseInt(first.substring(3, 5));
		int seconds = Integer.parseInt(first.substring(6));
		
		//bomb
		int hours2 = Integer.parseInt(second.substring(0, 2));
		int min2 = Integer.parseInt(second.substring(3, 5));
		int seconds2 = Integer.parseInt(second.substring(6));
		
		if(seconds>seconds2){
			int tempseconds = 0;
			tempseconds = 60-seconds;
			totala = tempseconds+seconds2;
			min++;
			
		}else{
			totala = seconds2-seconds;
		}
		
		//min
		if(min>min2){
			
			int temp3 = 60-min;
			totalb = temp3+min2;
			hours++;
		}else{
			totalb = min2-min;
		}
		
		//hours
		if(hours>hours2){
			
			int temp = 24-hours; 
			totalc = hours2+temp; 
		}else{
			totalc = hours2-hours;
		}
		
		if(totalc+totala+totalb == 0){
			totalc += 24;
		}
		
		if(totala<10){
			a = "0"+totala;
		}else{
			a = String.valueOf(totala);
		}
		
		if(totalb <10){
			b = "0"+totalb;
		}else{
			b = String.valueOf(totalb);
		}
		
		if(totalc < 10){
			c = "0"+totalc;
		}else{
			c = String.valueOf(totalc);
		}
		
		System.out.println(c+":"+b+":"+a);
	}
}
