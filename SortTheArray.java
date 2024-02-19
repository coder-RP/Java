
public class SortTheArray {
public static void main(String[] args) {
	int arr[]= {2,23,54,7,6,96,4,3};
	sort(arr);
}
static void sort(int arr[]) {
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length-1;j++) {
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	for(int i=0;i<arr.length;i++) {
		System.out.println("element at "+i+" is "+arr[i]);
	}
}
}
