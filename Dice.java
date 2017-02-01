import java.util.Scanner;

public class Dice {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int resa = 0;
		int resb = 0;
		String[] numbers = in.nextLine().split(" ");
		
		resa += Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1])
				+ Integer.parseInt(numbers[2]) + Integer.parseInt(numbers[3]);
		
		numbers = in.nextLine().split(" ");

		resb += Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1])
				+ Integer.parseInt(numbers[2]) + Integer.parseInt(numbers[3]);
		
		if(resa==resb){
			System.out.println("Tie");
		}else if(resa<resb){
			System.out.println("Emma");
		}else{
			System.out.println("Gunnar");
		}
	}

}
