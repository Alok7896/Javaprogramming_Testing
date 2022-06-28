package TestProject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class RepeatingWordInFile {

	public static void main(String[] args) throws Exception {
		FileReader reader=new FileReader("C:\\Users\\Lenovo\\Desktop\\abc.txt");
		BufferedReader bf=new BufferedReader(reader);
		String line="";
		ArrayList<String> list=new ArrayList<String>();
		while((line=bf.readLine())!=null) {
			String x[]=line.split(" ");
			for(int i=0;i<x.length;i++) {
				list.add(x[i]);
			}
		}
		int count=0,maxcount = 0;
		String y="";
		
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if(list.get(i).equals(list.get(j))) {
					count++;
				}
				
				if(count>maxcount) {
					maxcount=count;
					y=list.get(i);
				}
			}
		}
		
		System.out.println("Longest Repeating word "+y);

	}

}
