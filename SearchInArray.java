import java.util.*;
public class SearchInArray {
	static Scanner scr=new Scanner(System.in);
public static void main(String[] args) {
	int arr[]= {1,2,31,5,6,5,86,44,3,45,78,32};	
	System.out.println("Enter the value of target-->");
	int target=scr.nextInt();
	boolean present=false;
	int index=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==target) {
			//System.out.println("Element "+arr[i]+" found in the array at index-->"+i);
		present=true;
		index=i;
		break;
		}	
	}
	if(present) {
		System.out.println("Number is present in the Array at index -->"+index);
	}else {
		System.out.println("Number is not present in the Array");
	}
	
}
//static void Target(int arr[],int target) {
//	System.out.println("Enter the value of target-->");
//	int target=scr.nextInt();
//  boolean flag=false;
//	for(int i=0;i<arr.length;i++) {
//		if(arr[i]==target) {
//		flag=true;	
//		}
//	}
//  if(flag){
//System.out.println("Target number is present in the Array");
//}else {
//	System.out.println("Target number is not present in the Array");
//}
//}
//	}
}
