import java.util.*;

public class ToweringProblem {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String numbers = in.nextLine();
		String [] sequence = numbers.split(" ");
		int [] sequenceIn = new int[sequence.length];
		
		for(int i=0;i<sequence.length-2;i++){
			sequenceIn[i] = Integer.parseInt(sequence[i]);
		}
		sequenceIn[6] = 102;
		sequenceIn[7] = 102;
		Arrays.sort(sequenceIn);
		sequenceIn[6] = Integer.parseInt(sequence[6]);
		sequenceIn[7] = Integer.parseInt(sequence[7]);
		String[] compa = new String[3];
		boolean is = false;
		
		for(int i=5;i>=0;i--){
			
			if(is){
				break;
			}
			
			for(int k=4;k>=0;k--){
				
				if(is){
					break;
				}
				
				for(int y=3;y>=0;y--){ 
					
					if(sequenceIn[i]+sequenceIn[k]+sequenceIn[y]==sequenceIn[6] && (i!=k && i!=y && k !=y)){
						compa[0] = sequenceIn[i] + "";
						compa[1] = sequenceIn[k] + "";
						compa[2] = sequenceIn[y] + "";
						System.out.print(compa[0] + " " + compa[1] + " " + compa[2]);
						is=true;
						break;
					}
				}
			}
		}//end of for (big)
		
		for(int y=sequence.length-3;y>=0;y--){
			
			if((compa[0].equalsIgnoreCase(sequenceIn[y]+"") || compa[1].equalsIgnoreCase(sequenceIn[y]+"") 
					|| compa[2].equalsIgnoreCase(sequenceIn[y]+""))){
				continue;
			}else{
				System.out.print(" " + sequenceIn[y]);
			}
		}//end of for
	}//end of main
}//end of class
