package StringClass;

public class LowertoUpperCaseandviceversa {
public static void main(String[] args) {
	String s="Hello Reetesh How Are You";
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)>='A'&& s.charAt(i)<='Z') {
		System.out.print((char)(s.charAt(i)+32));
		}
		else if(s.charAt(i)>='a'&& s.charAt(i)<='z') {
			System.out.print((char)(s.charAt(i)-32));
			}else {
				System.out.print(s.charAt(i));
			}
		
	}
}
}
