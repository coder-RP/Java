
public class BiggInArray {
public static void main(String[] args) {
	//Smallest in array
	int arr[]= {9,62,5,5,36,7,44,3,5};
	//System.out.println("The smallest Element in the following Array is = "+smallest(arr));
	//System.out.println("The biggest Element in the following Array is = "+biggest(arr));
ThirdLarge(arr);
	
}
static int smallest(int arr[]) {
	int small=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(small>=arr[i]) {
			small=arr[i];
		}
	}
	return small;
}
static int biggest(int arr[]) {
	  int bigg=arr[0];
      for (int i=0;i<arr.length;i++){
          if(bigg<=arr[i]){
              bigg=arr[i];
          }
      }
      //System.out.println("The biggest in the following array is "+bigg);
      return bigg;
}
static int SecondLarge(int arr[]) {
	 int bigg=arr[0];
	 int secondLarge=0;
     for (int i=0;i<arr.length;i++){
         if(bigg<=arr[i]){
             bigg=arr[i];
         }
     }
     for(int i=0;i<arr.length;i++) {
    	 if(arr[i]<bigg) {
    		if(arr[i]>secondLarge)  {
        		 secondLarge=arr[i];
    	 }
    	 }
    
  	 }
     
     System.out.println("the largest element is = "+bigg);
     System.out.println("second large = "+secondLarge);
	return 0;
}
static void ThirdLarge(int arr[]) {
	 int bigg=arr[0];
	 int secondLarge=0;
	 int thirdLarge=0;
     for (int i=0;i<arr.length;i++){
         if(bigg<=arr[i]){
             bigg=arr[i];
         }
     }
     for(int i=0;i<arr.length;i++) {
    	 if(arr[i]<bigg) {
    		if(arr[i]>secondLarge)  {
        		 secondLarge=arr[i];
    	 }
    	 }
    
  	 }
     for(int i=0;i<arr.length;i++) {
    	 if(arr[i]<secondLarge) {
    		if(arr[i]>thirdLarge)  {
        		 thirdLarge=arr[i];
    	 }
    	 }
    
  	 }
     
     System.out.println("the largest element is = "+bigg);
     System.out.println("second large = "+secondLarge);
     System.out.println("Third large = "+ thirdLarge);
}
}
