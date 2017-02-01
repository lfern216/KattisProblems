package Kattis;

import java.util.*;

public class Modulo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0;i<10;i++){
			
			int temp = in.nextInt();
			
			set.add(temp%42);
		}
		
		System.out.println(set.size());

	}

}
