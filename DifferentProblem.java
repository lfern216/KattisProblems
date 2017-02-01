package Kattis;

	import java.math.BigInteger;
	import java.util.Scanner;

	public class DifferentProblem {

		public static void main(String[] args) {
			
			Scanner in = new Scanner(System.in);
			
			while(in.hasNext()){
				
			BigInteger x = BigInteger.valueOf(in.nextLong());
			BigInteger y = BigInteger.valueOf(in.nextLong());
			BigInteger z;
			
			if(x.longValue()<y.longValue()){
				
			z = y.subtract(x);
			}else{
			z = x.subtract(y);
			}
			
			System.out.println(z);

			}
		}
}
