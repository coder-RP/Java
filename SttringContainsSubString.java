package StringClass;

public class SttringContainsSubString {

	public static void main(String[] args) {
		String s="sdndjksabadkhskjg";
		String s1="jkssss   ";

		for(int i=0;i<s.length()-s1.length();i++) {
			int k=i;
			boolean flag=true;
			for(int j=0;j<s1.length();j++) {
				if(s.charAt(k)!=s1.charAt(j)) {
					flag=false;
				}k++;
			}
			if(flag==true) {
				System.out.println(flag);
				break;
			}
			if(i==s.length()-1-s1.length()&&flag==false) {
				System.out.println(flag);
			}
		}
	
	}

}
