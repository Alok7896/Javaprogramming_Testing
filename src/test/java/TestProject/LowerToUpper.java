package TestProject;

public class LowerToUpper {

	public static void main(String[] args) {
		String name="selenium";
		StringBuffer buffer=new StringBuffer(name);
		
		for(int i=0;i<name.length();i++) {
			if(Character.isLowerCase(name.charAt(i))) {
				buffer.setCharAt(i, Character.toUpperCase(name.charAt(i)));
			}
		}
		
		System.out.println(buffer);

	}

}
