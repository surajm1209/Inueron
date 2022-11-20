
public class Copy_Array {
	

	public static void main(String[] args) 
	{
		
		int []ar= {10,20,30};
		int []b= new int [ar.length];
		for(int i=0;i<ar.length;i++)
		{
			b[i]=ar[i];
		}
		// System.out.println(ar[i]);
		
		//Displaying elements of array b     
        System.out.println("Elements of new array: ");    
        for (int i = 0; i < b.length; i++) {     
           System.out.print(b[i] + " ");  
        }
	}

}
