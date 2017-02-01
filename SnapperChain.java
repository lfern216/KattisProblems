import java.util.Scanner;

public class SnapperChain {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
			
		String cases = in.nextLine();
		int con = Integer.parseInt(cases);
		int counter = 0;
			
		for(int i=0;i<con;i++){
			
			String x = in.nextLine();
			String[] splitter = x.split(" ");
			
			int xx = Integer.parseInt(splitter[0]);
			int yy = Integer.parseInt(splitter[1]);
			counter++;
			
			if(((yy%(Math.pow(2, xx)))==Math.pow(2, xx)-1)){
				System.out.println("Case #" + counter + ": ON" );
			}else{
				System.out.println("Case #" + counter + ": OFF" );
			}
		}//end of for
	}//end of main

}//end of class
