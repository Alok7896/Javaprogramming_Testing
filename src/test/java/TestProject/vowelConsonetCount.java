package TestProject;

public class vowelConsonetCount {
	
	public void countVowelAndConsonent(String str) {
		String name=str;
		int vowelCount=0;
		int consonentCount=0;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)=='a'||name.charAt(i)=='e'|| name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u') {
				vowelCount++;
			}
			else if(name.charAt(i)!=' ') {
				consonentCount++;
			}
		}
		
		System.out.println("No of vowelCount is "+vowelCount+ " No of consonetCount "+consonentCount);
	}
	
	public String palindrome(String str) {
		String name=str;
		name=name.toLowerCase();
		String reverse="";
		for(int i=name.length()-1;i>=0;i--) {
			reverse+=name.charAt(i);
		}
		return reverse;
	}
	
	public void palindrome1(String str) {
		String name=str;
		name=name.toLowerCase();
		boolean flag=true;
		for(int i = 0; i < name.length()/2; i++){    
            if(name.charAt(i) != name.charAt(name.length()-i-1)){    
                flag = false;    
                break;    
            }    
        }  
		if(flag)
			System.out.println("It is a palindrome");
		else
			System.out.println("It is not a palindrome");
	}

	public static void main(String[] args) {
		String str="This is my first test case";
		str=str.toLowerCase();
		vowelConsonetCount vowel=new vowelConsonetCount();
		vowel.countVowelAndConsonent(str);
		String rev=vowel.palindrome("Kayak");
		if(rev.equals("kayak")) {
			System.out.println("It is a palindrome");
		}
		else {
			System.out.println("It is not a palindrome");
		}
		
	   vowel.palindrome1("kayak");
		
		

	}

}
