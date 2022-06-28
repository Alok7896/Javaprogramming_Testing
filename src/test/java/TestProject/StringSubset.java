package TestProject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StringSubset {
	public static void main(String[] args) {
		String name="selenium";
		List<String> list=new ArrayList<String>();
		
		for(int i=0;i<=name.length();i++) {
			for(int j=i+1;j<=name.length();j++) {
				list.add(name.substring(i, j));
			}
		}
		
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
			System.out.println();
		}
	}

}
