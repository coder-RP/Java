package StringClass;

public class ThirdOccur {
public static void main(String[] args) {
	int arr[]= {2,5,8,12,16,23,16,45,50,16,60};
	int count=0;
	int target=16;
	int occurancecount=3;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==target) {
			count++;
		}
		if(count==occurancecount) {
			System.out.println(i);
			break;
		}
	}
}
}
