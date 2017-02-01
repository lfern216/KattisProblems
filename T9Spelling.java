package Kattis;

import java.util.*;

public class T9Spelling {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String res = "";
		String last = "";
		int counter = 1;
		Map<String,Integer> codes = new TreeMap<String,Integer>();
		codes.put("a", 2);
		codes.put("b", 22);
		codes.put("c", 222);
		codes.put("d", 3);
		codes.put("e", 33);
		codes.put("f", 333);
		codes.put("g", 4);
		codes.put("h", 44);
		codes.put("i", 444);
		codes.put("j", 5);
		codes.put("k", 55);
		codes.put("l", 555);
		codes.put("m", 6);
		codes.put("n", 66);
		codes.put("o", 666);
		codes.put("p", 7);
		codes.put("q", 77);
		codes.put("r", 777);
		codes.put("s", 7777);
		codes.put("t", 8);
		codes.put("u", 88);
		codes.put("v", 888);
		codes.put("w", 9);
		codes.put("x", 99);
		codes.put("y", 999);
		codes.put("z", 9999);
		
		String c = in.nextLine();
		int cases = Integer.parseInt(c);
		
		for(int k=0;k<cases;k++){
			
		String word = in.nextLine();
		
		for(int i=0;i<word.length();i++){

			if((codes.get(word.substring(i, i+1)) !=null && last.length()==0)){
				//start
			res += codes.get(word.substring(i, i+1));
			last = word.substring(i, i+1);
				
			}else if(codes.get(word.substring(i, i+1))!=null){
				
				//check past first
				String x = codes.get(word.substring(i, i+1)) + "";
				String y = codes.get(last) + "";
				
				if(x.substring(0, 1).equals(y.substring(0, 1))){
					//same letter so pause
					res += " ";
					res += codes.get(word.substring(i, i+1));
					last = word.substring(i, i+1);
					
				}else{
					res += codes.get(word.substring(i, i+1));
					last = word.substring(i, i+1);
					
				}
				
			}else if(codes.get(word.substring(i, i+1))==null){
				
				String x = codes.get(word.substring(i, i+1)) + "";
				String y = codes.get(last) + "";
				
				if(x.substring(0, 1).equals(y.substring(0, 1))){
					//same letter so pause
					res += " ";
					res += "0";
					last = word.substring(i, i+1);
					
				}else{
					res += "0";
					last = word.substring(i, i+1);
				}
			}

		}//end of for (inner)
			
		System.out.println("Case #" + counter + ": " + res);
		counter++;
		res = "";
		last = "";
	}//end of for (outer)
		

	}//end of main
}


