package StringClass;
public class PanagramString {
public static void main(String[] args) {
	//Panagram means when the String contains all the 26 alphabets in it;
	String s="the quick brown fox jumps over the lazy dog";
	s=s.toLowerCase();
	boolean flag=true;
	for(char ch='a';ch<'z';ch++) {
		if(s.contains(""+ch)==false) {
			System.out.println("Not a panagram string");
			return;
		}else {
			flag=true;
		}
	}
	if(flag==true) {
		System.out.println("panagram String");
	}
	}
}
