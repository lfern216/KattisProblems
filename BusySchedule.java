import java.util.*;

public class BusySchedule {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		List<Integer> list_a = new ArrayList<Integer>();
		List<Integer> list_b = new ArrayList<Integer>();
		boolean is = false;
		boolean is2 = false;
		int count = 0;
		
		int c_am = 0;//am
		int c_pm = 0;//pm
		
		while(true){
				
		String number  = in.nextLine();
		int c_number = Integer.parseInt(number);
			
		if(c_number==0){
			break;
		}
		if(count!=0){
			System.out.print("\n");
		}
		
		for(int i=0;i<c_number;i++){
			
		String x = in.nextLine();
		
		if(x.equals("12:00 p.m.")){
			is2=true;
		}
		else if(x.equals("12:00 a.m.")){
			is=true;
		}else{
			String[] splitter = x.split(" ");
			String temp = splitter[0];
			int index = temp.indexOf(":");
			String hour = temp.substring(0, index);
			String minute = temp.substring(index+1);
			
			if(x.substring(x.length()-4).contains("a.m.")){
				String g = hour+minute;
				if(hour.equals("12")){
					c_am++;
				}
				int g_ = Integer.parseInt(g);
			list_a.add(g_);
			}else{
				String g = hour+minute;
				
				if(hour.equals("12")){
					c_pm++;
				}
				int g_ = Integer.parseInt(g);
				list_b.add(g_);
			}		
		}//end of else(big)
		}//end of for
		
		Collections.sort(list_a);
		Collections.sort(list_b);
		
		//printing
		int yy = 0;
		for(yy=list_a.size()-c_am;yy<list_a.size();yy++){
			
			if(is){
				System.out.println("12:00 a.m.");
				is=false;
				yy--;
			}else{
			int temp2 = list_a.get(yy);
			String temp = temp2+"";
			
			if(temp.length()==3){
				
				System.out.println(temp.substring(0,1) + ":" + temp.substring(1) + " a.m.");
			}else{
				
			System.out.println(temp.substring(0,2) + ":" + temp.substring(2) + " a.m.");	
				
			}
			
		}
	}//end of for
		
		//printing the last schrdule time
		for(int i=0;i<list_a.size()-c_am;i++){
				
			if(is){
				System.out.println("12:00 a.m.");
				is=false;
				i--;
			}else{
			int temp2 = list_a.get(i);
			String temp = temp2+"";
			
			if(temp.length()==3){
				
				System.out.println(temp.substring(0,1) + ":" + temp.substring(1) + " a.m.");
			}else{
				
			System.out.println(temp.substring(0,2) + ":" + temp.substring(2) + " a.m.");	
				
			}
			}
			}//end of for
		
		
		
		int y = 0;
		for(y=list_b.size()-c_pm;y<list_b.size();y++){
			
			if(is2){
				System.out.println("12:00 p.m.");
				is2=false;
				y--;
			}else{
			
			int s = list_b.get(y);
			String s_converter = s + "";
			
			if(s_converter.length()==3){
				
				System.out.println(s_converter.substring(0,1) + ":" + s_converter.substring(1) + " p.m.");
			}else{
				
			System.out.println(s_converter.substring(0,2) + ":" + s_converter.substring(2) + " p.m.");	
				
			}
			}
		}

		//printing the last schrdule time
		for(int i=0;i<list_b.size()-c_pm;i++){
				
			if(is2){
				System.out.println("12:00 p.m.");
				is2=false;
				i--;
			}else{
				
			
			int temp2 = list_b.get(i);
			String temp = temp2+"";
			
			if(temp.length()==3){
				
				System.out.println(temp.substring(0,1) + ":" + temp.substring(1) + " p.m.");
			}else{
				
			System.out.println(temp.substring(0,2) + ":" + temp.substring(2) + " p.m.");	
			}	
			}
			}
		
		count++;	
		list_a.clear();
		list_b.clear();
		is=false;
		is2=false;
		c_am = 0;
		c_pm = 0;
		
		}//end of for

	}//end of while
	}//end main
