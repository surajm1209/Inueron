//6. WAP to check whether an array is a subset of another array.
public class ArraySubset {

	public static void main(String[] args) {
		int [] ar1= {30,40,10,20,70,60,90};
		int [] ar2= {3,700,600,100};
		boolean present=false;
		for(int i=0;i<ar1.length;i++)
		{
			for(int j=0;j<ar2.length;j++)
			{
				if(ar1[i]==ar2[j])
				{
					present=true;
				}
				
			}
		}
		if(present==true)
			System.out.print("ar2[j] is a subset");
		else
			System.out.print("ar2[j] is not a subset");
		
	}

}
