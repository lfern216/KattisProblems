package Kattis;

import java.util.Scanner;

public class Bijele {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int king = 1;
		int queen = 1;
		int rooks = 2;
		int bishops = 2;
		int knights = 2;
		int pawns = 8;
	
		int x = in.nextInt(); //0
		int y = in.nextInt(); //1
		int w = in.nextInt(); //2
		int z = in.nextInt(); //2
		int u = in.nextInt(); //2
		int i = in.nextInt(); //7
		
		king = king - x;
		queen = queen - y;
		rooks -= w;
		bishops -= z;
		knights -= u;
		pawns -= i;
			
		System.out.print(king + " " + queen + " " + rooks + " " + bishops + " " +
		knights + " " + pawns);


	}

}
