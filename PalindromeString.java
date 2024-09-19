package StringClass;

public class PalindromeString {
public static void main(String[] args) {
	String S="NAMAN";
	String S1="";
	for(int i=S.length()-1;i>=0;i--) {
		S1+=S.charAt(i);
	}
	if(S.equals(S1)) {
		System.out.println("String is Palindrome");
	}else {
		System.out.println("Not a palindrome String ");
	}
//	S1=S1.toLowerCase();
//	System.out.println(S1);
//	String S2="reetesh";
//	S2=S2.toUpperCase();
//	System.out.println(S2);
}
}
