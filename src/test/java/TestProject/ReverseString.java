package TestProject;

public class ReverseString {

	public static void main(String[] args) {
		String x="Selenium";
		String rev="";
		for(int i=x.length()-1;i>=0;i--) {
			rev+=x.charAt(i);
		}
		
		System.out.println(rev);

	}

}
