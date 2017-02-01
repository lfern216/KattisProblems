import java.util.*;

public class NumbersOnATree {
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		String[] splitter = in.nextLine().split(" ");
		
		if(splitter.length==1){
			
			int x = Integer.parseInt(splitter[0]);
			System.out.println((int) (Math.pow(2, x+1)-1));
		}else{
			String path = splitter[1];
			int root = Integer.parseInt(splitter[0]); //3
			int traverse = (int) (Math.pow(2, root+1)-1);  //15
			
			int s = 0;
			int index = 0;
			
			for(int i=0;i<path.length();i++){
				
				if(path.charAt(i)=='R'){
				index = (2*index)+2;
				s = traverse-index; 
				//System.out.println("   -- " + s);
					
				}else{
					index = (2*index)+1;
					s=traverse-index; //15-1
					//System.out.println("   -- " + s);
				}
			}
			System.out.println(s);
			}
		}//end of main

}//end of class