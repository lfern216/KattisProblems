import java.util.*;
import java.util.Map.Entry;

public class SortOfSorting {

	static String first;
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		while(in.hasNext()){
			Map<Integer,String> map = new TreeMap<Integer,String>();
			List<String> names = new ArrayList<String>(); 
			int cases = in.nextInt();
			int count = 0;
			int printCount = 0;
		
		if(cases==0){
			break;
		}
		
		for(int i=0;i<cases;i++){
		
		first = in.next();
		map.put(count,first);
		names.add(first);
		count++;
		}
			
		Collections.sort(names);
		
		count = 0;
		String first = "";
		String current = "";
		boolean isTrue = false;
		
		for(int k=0;k<names.size()-1;k++){
			
			if(names.get(k).substring(0, 2).equals(names.get(k+1).substring(0, 2))){
				
				first = names.get(k).substring(0, 2); //saving the first index letter to print
				
				while(k+1< names.size() && names.get(k).substring(0, 2).equals(names.get(k+1).substring(0, 2))){
				count++;
				k++;
				}
			
				int traverse = 0;
				for(Map.Entry<Integer,String> m: map.entrySet()){ 
					
					String indexLetter = m.getValue();
					
					if(first.equals(indexLetter.substring(0, 2)) && traverse<=count){
						traverse++;
						isTrue=true;
						printCount++;
					    System.out.println(m.getValue());
					}else{
						if(traverse==count+1){
						    break;
						}else{
							isTrue=true;
							current = indexLetter;
						}
					}
				}//end of for map
					
				}else{
					System.out.println(names.get(k));
					printCount++;
				}
			}//end of for (names)
				
			if(isTrue==false){
				System.out.println(names.get(names.size()-1)); //3
			}else{
				
				if(printCount+1==names.size()){
			System.out.println(names.get(names.size()-1));
				}
			}
		}//end of while
	}//end of main

}//end of class
	