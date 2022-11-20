//WAP to get min and max elem in an array
public class ArrayMinMax {

	public static void main(String[] args) {
	int [] ar= {25,30,40,7,10};
	 int max=ar[0];
	 for(int i=0;i<ar.length;i++)
	 {
		if(ar[i]>max) 
		{
			max=ar[i];
		}
	 }
	 System.out.println("the max value is " + max);
	 
	 //to find min value
	 int min=ar[0];
	 for(int i=0;i<ar.length;i++)
	 {
		 if(ar[i]<min)
		 {
			 min=ar[i];
		 }
	 }
	 System.out.println("minimum value is " + min);
	}

}
