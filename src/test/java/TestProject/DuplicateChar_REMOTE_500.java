package TestProject;

public class DuplicateChar {

	public static void main(String[] args) {
		String str="selenium";
		
		char lang[]=str.toCharArray();
		int freq[]=new int[lang.length];
		
		for(int i=0;i<lang.length;i++) {
			freq[i]=1;
			for(int j=i+1;j<lang.length;j++) {
				if(lang[i]==lang[j]) {
					freq[i]++;
					freq[j]='0';
				}
			}
		}
		
		for(int i=0;i<lang.length;i++) {
			if(lang[i]!='0') {
				System.out.print(lang[i]+" No of times its repeat "+freq[i]);
			}
			System.out.println();
		}
	}
	System.out.println("Git validation");

}
