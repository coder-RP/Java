package StringClass;

public class StringPrac {
//	To check String is Anagram or not
public static void main(String[] args) {
	String s="abcdefg";
	String s1="begfacd";
	System.out.println(checkAnagram(s,s1));
	
}
        static boolean checkAnagram(String s,String s1) {
        	char arr[]=new char[s.length()];
        	char arr1[]=new char[s1.length()];
        	for(int i=0;i<arr.length;i++) {
        		arr[i]=s.charAt(i);
        	}
        	for(int i=0;i<arr1.length;i++) {
        		arr1[i]=s1.charAt(i);
        	}
        	for(int i=0;i<arr.length;i++) {
        		for(int j=i+1;j<arr.length;j++) {
        			if(arr[i]>arr[j]) {
        				char temp=arr[i];
        				arr[i]=arr[j];
        				arr[j]=temp;
        			}
        		}
        	}for(int i=0;i<arr1.length;i++) {
        		for(int j=i+1;j<arr1.length;j++) {
        			if(arr1[i]>arr1[j]) {
        				char temp=arr1[i];
        				arr1[i]=arr1[j];
        				arr1[j]=temp;
        			}
        		}
        	}
        	
	if(arr.length!=arr1.length) {
		System.out.println("Not anagram String");
		return false;
	}
	
    for(int i=0;i<arr.length;i++) {
		   if(arr[i]!=arr1[i]) {
			   System.out.println("Both the Strings are not Anagram");
			   return false;
	   }
}
          System.out.println("Both the Strings are Anagram Strings");
          return true;
}
}
