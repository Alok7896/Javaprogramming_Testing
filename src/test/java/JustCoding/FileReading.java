package JustCoding;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class FileReading {

	public void print() {
		String str = "Location \"Welcome  to india\" Bangalore " +
	             "Channai \"IT city\"  Mysore";

	List<String> list = new ArrayList<String>();
	Matcher m = Pattern.compile("([^\"]\\S*").matcher(str);
	while (m.find())
	    list.add(m.group(1)); // Add .replace("\"", "") to remove surrounding quotes.


	System.out.println(list);
		
	}

	/*
	 * public void add() { // TODO Auto-generated method stub Pattern
	 * p=Pattern.compile("a+"); Matcher m=p.matcher("abcdefaab7893");
	 * while(m.find()) { System.out.println(m.group()+" "); }
	 */
	public static void main(String[] args) {
		FileReading file=new FileReading();
		file.print();
		
	}

	public void add() {
		// TODO Auto-generated method stub
		
	}
	
	
	
		
}
