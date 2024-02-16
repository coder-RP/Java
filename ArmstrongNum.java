import java.util.*;
public class ArmstrongNum {
public static void main(String []args) {
System.out.println("Enter the number you want to check");
Scanner Sc=new Scanner(System.in);
int num=Sc.nextInt();
//System.out.println(countDigit(num));
System.out.println(calVal(lastDigit(num),num));
System.out.println(sum(num));
if(sum(num)==num) {
	System.err.println(num+" is an armstrong number");
}else
{
	System.out.println(num+" not an Armstrong number");
}
}
static int countDigit(int num) {
	int temp=num;
	int count=0;
	while(temp>0) {
		 temp=temp/10;
		 count++;
	}
	return count;
}
static int lastDigit(int num) {
	int lastDigit=num%10;
	return lastDigit;
}
static int calVal(int lastDigit,int num) {
	int product=1;
	for(int i=countDigit(num);i>0;i--) {
		product=product*lastDigit;
}
	return product;
}
static int sum(int num) {
	int total=0;
	int temp=num;
	while(temp>0) {
		total=total+calVal(lastDigit(temp),num);
		temp=temp/10;
	}
	return total;
}

}
