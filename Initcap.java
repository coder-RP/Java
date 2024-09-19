package StringClass;

public class Initcap {
public static void main(String[] args) {
	String s="what are you doing buddy";
	for(int i=0;i<s.length();i++) {
		if( i==0&&s.charAt(0)>='a'&&s.charAt(0)<='z') {
			System.out.print((char)(s.charAt(0)-32));
	}
		else if(s.charAt(i-1)==' '&& s.charAt(i)>='a'&&s.charAt(i)<='z') {
			System.out.print((char)(s.charAt(i)-32));
		} else {
		System.out.print(s.charAt(i));
	}  
	}
}
}
