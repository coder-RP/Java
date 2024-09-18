package StringClass;

public class SortStringInAsc {
	public static void main(String[] args) {
String s="Reetesh";
//s=s.toLowerCase();
s=s.toUpperCase();
char []arr=new char[s.length()];
for(int i=0;i<s.length();i++) {
	arr[i]=s.charAt(i);
}
//char[] arr1=new char[arr.length];
for(int i=0;i<arr.length;i++) {
	for(int j=i+1;j<arr.length;j++) {
		if(arr[i]>arr[j]) {
			char temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
}
for (int i=0;i<arr.length;i++) {
	System.out.println(arr[i]);
}
}
}
