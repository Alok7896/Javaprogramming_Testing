package TestProject;

public class SwapString {

	public static void main(String[] args) {
		String x="Alok";
		String y="Pradhan";
		
		x=x+y;   //AlokPradhan
		y=x.substring(0,(x.length()-y.length()));  //Alok
		x=x.substring(y.length());
		
		System.out.println(x+" "+y);

	}

}
