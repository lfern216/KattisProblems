package Kattis;

import java.util.*;

public class DigitSum {

	public static void main(String[] args) {
		
		System.out.println(Math.floor(3.5));
	
		
		Scanner in = new Scanner(System.in);
		int converter = in.nextInt();
		
		while(converter>0){
			
			int res = 0;
			long numbera = in.nextLong();
			long numberb = in.nextLong();
			
			if(numbera<10){
				
				long loop = Math.abs(numberb-numbera);
				long replica = numbera; //8

				for(int i=0;i<=loop;i++){
					
					if(replica>9){
						
						String f = replica+"";
						
						for(int k=0;k<f.length();k++){
							
							int temp = Integer.parseInt(f.substring(k,k+1));
							res += temp;
						}
						replica++;
					}else{
					res += replica;
					replica++;
					}
				}//end of for
				
				if(loop==0){
					res += numberb; //add the remainder
				}
				
				System.out.println(res);
				converter--;
				res = 0;
			}else{
				//number>=10
				long replica = numbera; //28
				long finaLoop = numberb-replica; //3
				
				for(int i=0;i<=finaLoop;i++){
					
					String f = replica+"";
					
					for(int k=0;k<f.length();k++){
						
						int temp = Integer.parseInt(f.substring(k,k+1));
						res += temp;
					}
					
					replica++;
				}//end of loop 
				
				System.out.println(res);
				converter--;
				res = 0;
			}
		}
		
	}//end of main 
}
