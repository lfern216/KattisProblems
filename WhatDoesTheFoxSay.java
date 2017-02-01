package Kattis;

import java.util.*;

public class WhatDoesTheFoxSay {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<String> animals = new ArrayList<String>();
		
		String cases = in.nextLine();
		int c = Integer.parseInt(cases);
		
		while(c>0){
			c--;
			String[] words = in.nextLine().split(" ");
			
			while(true){
				
				String temp = in.nextLine();
				
				if(temp.equals("what does the fox say?")){
					break;
				}else{
					String[] spi = temp.split(" ");
					animals.add(spi[0]);
					animals.add(spi[2]);
				}
			}
			
			boolean is = true;
			
			for(int i=0;i<words.length;i++){
				
				String f = words[i];
				
				for(int k=0;k<animals.size();k++){
					
					if(f.equals(animals.get(k))){
						is=false;
						break;
					}
				}
				
			if(i+1==words.length && is){
			System.out.print(words[i] + "\n");
			
			}else{
				if(is){
				System.out.print(words[i] + " ");
				}else{
					is=true;
				continue;
				}
			}
			}
		
		}//end of while case
	}

}
