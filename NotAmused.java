package Kattis;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class NotAmused {
	
	public static void deletePerson(String p, LinkedList<String> list){
		
		if(list==null){
			return;
		}
		ListIterator<String> it = list.listIterator();
		
		while(it.hasNext()){
			String cur = it.next();
			
			if(p.equals(cur)){
				it.remove();
			}
		}
	}

	public static void main(String[] args) {
		String g = "hey";
		
		LinkedList<String> f = new LinkedList<String>();
		f.add("ass");
		f.add("tyui");

		deletePerson(g,f);

	}
}
