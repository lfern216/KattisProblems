package Kattis;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Cannonball {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int cases = in.nextInt();
		
		for(int i=0;i<cases;i++){
			
		double velocity = in.nextDouble();
		double angle = in.nextDouble();
		double x1 = in.nextDouble();
		double h1 = in.nextDouble();
		double h2 = in.nextDouble();
		double res = 0.0;
		
		double time = x1/velocity;
		time = time/(Math.cos(Math.toRadians(angle)));

		res = (velocity*time*Math.sin(Math.toRadians(angle)));
		double rightSide = (time*time*9.81)/2;
		res = res-rightSide;
		
		DecimalFormat df = new DecimalFormat("#.00");
		String angl = df.format(res);
	
		double finalRes = Double.parseDouble(angl);
	
		if(finalRes-1>=h1 && finalRes+1<=h2){
			System.out.println("Safe");
		}else{
			System.out.println("Not Safe");
		}	
	}//end of for		
}//end of main
}
