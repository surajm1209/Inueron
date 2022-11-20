import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		boolean flag=false;
		int [] ar= {10,20,40,30,60,70,80,90};
		Scanner scan= new Scanner(System.in);//to print on console
		System.out.println("enter value:"+ " ");
		int key= scan.nextInt();
		
		
		for(int i=0;i<ar.length;i++)
		{
			if(key==ar[i])
			{
				System.out.println("key found at index " +i);
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("key not found");
		}
	}

}
