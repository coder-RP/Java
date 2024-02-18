import java.util.Scanner;

public class CheckSparseMatrix {
	static Scanner sc=new Scanner(System.in);
public static void main(String[] args) {
	int[][] arr= new int[4][4];
	System.out.println("Enter elements in the 2d array");
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	checkSparse(arr);
}
static void checkSparse(int arr[][]) {
	int zeroCount=0;
	int non_zeroCount=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			if(arr[i][j]==0) {
				zeroCount++;
			}else {
				non_zeroCount++;
			}
		}
	}
	if(zeroCount>non_zeroCount) {
		System.out.println("It is an Sparce matrix");
	}else {
		System.out.println("Not an Sparce Matrix");
	}
}
}
