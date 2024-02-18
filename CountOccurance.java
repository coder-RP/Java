import java.util.*;
public class CountOccurance {
public static void main(String[] args) {
	Scanner scr=new Scanner(System.in);
	int num[]= {1,2,3,4,5,6,7,4,4,3,0,1};
	int count=0;
	System.out.println("Enter the value of Target");
	int target=scr.nextInt();
	OccuranceCount(num, count, target);
	for(int i=0;i<num.length;i++) {
		if(num[i]==target) {
			count++;
		}
	}
	System.out.println("the total occurance of target "+target+" is "+count);
	
}
static void OccuranceCount(int arr[],int count,int target){
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==target) {
			count++;
		}
	}
	System.out.println("the total occurance of target "+target+" is "+count);
}
}
