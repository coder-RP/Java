import java.util.*; 
public class CommonBw2Array {
public static void main(String[] args) {
	int []arr= {1,2,3,4,6,7,8,9,19};
	int []arr1= {1,3,5,7,9,3,7};
	common(arr, arr1);
}
static void common(int []arr,int []arr1) {
	int newArr[]=new int[arr1.length];
	int in=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr1.length;j++) {
			if(arr[i]==arr1[j]) {
		    newArr[in]=arr1[j];
			++in;
				//System.out.print(arr[i]+" ");
			}
		}
	}
	


	for(int k=0;k<newArr.length;k++)	{
	      System.out.println(newArr[k]);
	}
	
}
}

