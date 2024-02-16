import java.util.*;
public class ArrayPractice {
	static Scanner sc=new Scanner(System.in);
public static void main(String[]args ) {
	
	System.out.println("Enter the value of Length of the given Array");
	int length=sc.nextInt();
	int arr[]=new int[length];
	ArrayInput(arr);
	printArray(arr);
}
static void ArrayInput(int []arr) {
	System.out.println("Enter the number you want to print the table");
	int n=sc.nextInt();
	for(int i=0;i<arr.length;i++) {
		arr[i]=n*(i+1);
		//System.out.println("Value inserted Successfully");
		}
}
static void printArray(int []arr) {
	for(int i=0;i<arr.length;i++) {
		System.out.println("Value at index "+i+" is "+arr[i]);
	}
}
}
