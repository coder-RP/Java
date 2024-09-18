package StringClass;

public class SwapString {
public static void main(String[] args) {
	String s="hello"; 
	String s1="mohit how are you";
	s=s+s1;
	s1=s.substring(0,s.length()-s1.length());
	s=s.substring(s1.length());
	System.out.println(s);
	System.out.println(s1);
	
}
}
