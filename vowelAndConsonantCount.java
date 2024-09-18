package StringClass;

import java.util.Scanner;

public class vowelAndConsonantCount {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String s=sc.nextLine();
	CharCount(s);
}
public static void CharCount(String s) {
	s=s.toLowerCase();
	int vowelcount=0;
	int consonantcount=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)>='a'&&s.charAt(i)<='z') {
		if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
			vowelcount++;
		}else {
			consonantcount++;
		}
	}
	}
	System.out.println("total Vowels in the String is -> "+vowelcount);
	System.out.println("total Consonants in the String is -> "+consonantcount);
}
}
