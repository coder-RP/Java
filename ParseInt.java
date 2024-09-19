package StringClass;

public class ParseInt {
public static void main(String[] args) {
	String s="";
	int val=0;
	if(s.length()==0) {
		throw new NumberFormatException();
		}
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)>='0'&&s.charAt(i)<='9') {
			val=val*10+s.charAt(i)-48;
		}else {
			throw new NumberFormatException();
		}
	}
	System.out.println(val);
}
}
