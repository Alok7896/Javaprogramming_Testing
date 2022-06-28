package TestProject;

import org.testng.annotations.Test;

public class lognestRepeatingSequence {
	
	public String lcp(String a,String b) {
		int min=Math.min(a.length(), b.length());
		for(int i=0;i<min;i++) {
			if(a.charAt(i)!=b.charAt(i)) {
				return a.substring(0, i);
			}
			
		}
		return a.substring(0, min);
	}
	
	@Test
	public void logestRepeatingSequence() {
		String irs="";
		String name="abcdefabfgcde";
		for(int i=0;i<name.length();i++) {
			for(int j=i+1;j<name.length();j++) {
				String x=lcp(name.substring(i, name.length()),name.substring(j, name.length()));
				if(x.length()>irs.length()) {
					irs=x;
				}
			}
		}
		System.out.println("please print logest repeating sequence "+irs);
	}

}
