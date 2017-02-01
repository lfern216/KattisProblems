package Kattis;

import java.io.*;
import java.util.*;

public class WordsForNumbers {

	public static void main(String[] args) {
		
			Scanner in = new Scanner(System.in);
	
		Map<Integer,String> tents = new TreeMap<Integer,String>();
		tents.put(0,"zero");
		tents.put(1,"one");
		tents.put(2,"two");
		tents.put(3,"three");
		tents.put(4,"four");
		tents.put(5,"five");
		tents.put(6,"six");
		tents.put(7,"seven");
		tents.put(8,"eight");
		tents.put(9,"nine");
		tents.put(10,"ten");
		tents.put(11,"eleven");
		tents.put(12,"twelve");
		tents.put(13,"thirteen");
		tents.put(14,"fourteen");
		tents.put(15,"fifteen");
		tents.put(16,"sixteen");
		tents.put(17,"seventeen");
		tents.put(18,"eighteen");
		tents.put(19,"nineteen");
		tents.put(20,"twenty");
		tents.put(30,"thirty");
		tents.put(40,"forty");
		tents.put(50,"fifty");
		tents.put(60,"sixty");
		tents.put(70,"seventy");
		tents.put(80,"eighty");
		tents.put(90,"ninety");
		
		while(in.hasNextLine()){

		String[] splitter = in.nextLine().split(" ");

		for(int i=0;i<splitter.length;i++){
			
			int counter = splitter[i].length();
			int j=0;
			
			while(counter>0){
			counter--;
			char x = splitter[i].charAt(j); //t
			
			j++;
			if(!Character.isDigit(x)){
				System.out.print(x);
			}else{
				
				//it is a number
				String letter = splitter[i];
				int c = Integer.parseInt(letter);
					
					if(tents.get(c)!=null || letter.length()==1){

						String v = tents.get(c);
						
						if(i==0){
							String g = v.substring(0, 1).toUpperCase() + v.substring(1);
							v=g;
						}
						
						System.out.print(v);
						counter=0;
					}else{
					//didnt find the number directly
					
						if(letter.length()==2){
						String sam = splitter[i].substring(0, 1).toUpperCase() + "0";
							
				int converter = Integer.parseInt(sam);
					String word1 = tents.get(converter);
					
					if(i==0){
						String temp = "";
						temp = word1.substring(0, 1).toUpperCase() + word1.substring(1);
						word1=temp;
					}
					
					int converter2 = Integer.parseInt(splitter[i].substring(1));
					String word2 = tents.get(converter2);
					
					System.out.print(word1+"-"+word2);
					counter=0;
				}
					}//end of else(small)

			}//end of else()big
			
			if(counter==0){
			System.out.print(" ");
			}
				
			}//end of while
			
		}//end of for loop
		System.out.print("\n");
	}//end of while big
		
	}
}//end of class
	
