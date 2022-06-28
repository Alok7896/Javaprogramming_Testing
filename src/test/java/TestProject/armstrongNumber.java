package TestProject;

public class armstrongNumber {

	public static void main(String[] args) {
		int number=121;
		int n=number;
		int count=0;
		int value=0;
		
		while(number>0) {
			int mod=number%10;
			number=number/10;
			count++;
		}
		number=n;
		while(number>0) {
			int mod=number%10;
			value=(int) (Math.pow(mod, count)+value);
			number=number/10;
		}
		
		if(n==value) {
			System.out.println("it is a armstrong number");
		}
		else {
			System.out.println("It is not a armstrong number");
		}

	}

}
