package StringClass;
public class MyStringBuffer{	
  char[] value;
  int charcount = 0;

  MyStringBuffer(){
	  value = new char[16];
  }
  MyStringBuffer(char[] value){
	  this(value.length+16);
	  append(value);
  }
  MyStringBuffer(int length){
	  value = new char[length];
  }
  public int count(){
	  return charcount;
  }
  
  public int capacity(){
	  return value.length;
  }
      
	  public void append(char[] appendedchar){
		 checkSize(appendedchar.length);
		 int count = charcount+appendedchar.length;   // 7             
		 for(int i = charcount,j=0;i<count;i++,j++,charcount++){
			 value[i]=appendedchar[j];
		 } 
	  }
	  
	  private void checkSize(int newsize){
		  if(value.length<newsize+charcount){
			  int newlength = value.length * 2 + newsize;
			 char[] dummyvalue = new char[newlength];
			 for(int i = 0;i<charcount;i++){
				 dummyvalue[i] = value[i];
			 }
			 value = dummyvalue;
		  }
	  }
	  
	  
	  
	  public String toString(){
		  String S = "";
		  for(int i = 0 ; i<charcount;i++){
			  S = S + value[i];
		  }
		  return S;
	  }
}