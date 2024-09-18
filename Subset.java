package StringClass;
public class Subset {
public static void main(String[] args) {
	String s="AbcdeF";
	// total subsets generated is equal to s.length()*(s.length()+1)/2
	String s1[ ]=new String[s.length()*(s.length()+1)/2];
	int k=0;
	for(int i=0;i<s.length();i++) {
	for(int j=i+1;j<=s.length();j++) {
	s1[k]=s.substring(i, j);
	k++;
	}
	}
	for(int i=0;i<s1.length-1;i++) {
		for(int j=i+1;j<s1.length;j++) {
			if(s1[i].hashCode()>s1[j].hashCode()) {
				String temp=s1[i];
				s1[i]=s1[j];
				s1[j]=temp;  
			}
		}
	}
	System.out.print("[");
	for(String s2:s1) {
		System.out.print(s2+",");
	}
	System.out.print("]");
}
}
