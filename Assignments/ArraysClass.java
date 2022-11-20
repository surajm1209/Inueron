//Arrays utility class to perform operations of arrays which we create
import java.util.Arrays;

public class ArraysClass {

	public static void main(String[] args) {
		int []a= new int [4];
		for(int elem:a)
		{
			System.out.print(elem);
		}
		System.out.println();
		Arrays.fill(a, 5);//to print all array index with value 5
		for(int elem:a)
		{
			System.out.print(elem);
		}
		System.out.println();
		int[] ar= {1,2,0,0,0,4,5};//new array
		
		Arrays.fill(ar, 2, 5, 10);//(arrayName,startIndex,EndIndex+1,Value
		for(int elem:ar)
		{
			System.out.print(elem + " ");
		}
		System.out.println();
		
		//sort the below array
		int[] arr= {20,30,50,10,25,60};
		
		Arrays.sort(arr);
		for(int elem:arr)
		{
			System.out.print(elem + " ");
		}
		System.out.println();
		
		//binary search
		int res=Arrays.binarySearch(arr, 5);//(arrayName,value)
		System.out.println(res);
	}

}
