package Kattis;

import java.util.*;

public class BlackFriday {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Stack<String> res = new Stack<String>();
		String n = in.nextLine();
		int g = Integer.parseInt(n);
		List<String> f = new ArrayList<String>();
		
		String[] numbers = in.nextLine().split(" ");
		boolean is = true;
		
		for(int i=0;i<numbers.length;i++){
			
			String temp = numbers[i];
			
			for(int k=i+1;k<numbers.length;k++){
				
				if(temp.equals(numbers[k])){
					is=false;
					break;
				}
			}
			
			if(is){
				
				for(int ii=0;ii<f.size();ii++){
					if(f.contains(numbers[i])){
						is=false;
						break;
					}
				}
				
				if(is){
				res.add(numbers[i]);
				}
				
				is=true;
			}else{
				f.add(numbers[i]);
				is=true;
			}
		}
		
		if(res.size()==0){
			System.out.println("none");
		}else{
			System.out.println(res.pop());
		}	
	}
	}
