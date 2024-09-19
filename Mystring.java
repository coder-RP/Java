package StringClass;

public class Mystring {
private char[] value;
public Mystring(char [] value) {
	this.value=value;
}
public Mystring(String s) {
	this.value=new char[s.length()];
	for(int i=0;i<s.length();i++) {
		this.value[i]=s.charAt(i);
	}
}

public int length() {
	return value.length;
} 
public char charAt(int index) {
return value[index];	
}
public String toString() {
	String dummy="";
	for(int i=0;i<value.length;i++) {
		dummy+=value[i];
	}
	return dummy;
} 
public int hashCode() {
	int dummy=0;
	for(int i=0;i<value.length;i++) {
		dummy+=value[i];
	}
	return dummy;
}
public boolean equals(Object obj){
	Mystring S=(Mystring)obj;
	if(this.length()!=S.length()) {
		return false;
	}
	for(int i=0;i<value.length;i++) {
		if(this.charAt(i)!=S.charAt(i)) {
			return false;
		}
	}
	return true;
	}
public Mystring concat(char[] extrachar) {
	char[] dummyChar=new char[value.length+extrachar.length];
	for(int i=0;i<value.length;i++) {
		dummyChar[i]=value[i];
	}
	for(int i=value.length,j=0;j<extrachar.length;i++,j++) {
		dummyChar[i]=extrachar[j];
	}
	Mystring S=new Mystring(dummyChar);
	return S;
}
}
