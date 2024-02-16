
public class AddAnElement {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6,7,9};
	int newArr[]=new int[arr.length+1];
	int index=7;
	for(int i=0,j=0;i<arr.length;i++,j++) {
		if(index==i) {
			newArr[j]=8;
			j++;
		}
		newArr[j]=arr[i];
	}
	for(int i=0;i<newArr.length;i++) {
		System.out.println(newArr[i]);
	}
}
}
