package StringClass;

import java.util.Scanner;

public class Ocuuranceofeachcharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a valid string");
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==' ') {
				continue;
			}
			char ch1=ch[i];
			int count=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[j]==ch1) {
					count++;
					ch[j]=' ';
				}
			}
			System.out.println("Occurance of char "+ch[i]+" is "+ count);
		}
	}

}
