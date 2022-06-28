package TestProject;

public class Test {

	public static void main(String[] args) {
		String name="My name is alok";
		String rev="";
		String x[]=name.split(" ");
		for(int i=x.length-1;i>=0;i--) {
			rev+=x[i]+" ";
		}
		
		System.out.println("Reverse of the String is "+rev);

	}

}
