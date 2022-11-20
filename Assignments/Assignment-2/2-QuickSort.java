//2. WAP to sort an array using Quick Sort Algorithm.
public class QuickSort {

	public static void main(String[] args) {
		int [] arr= {70,40,90,50,80,30,60};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=arr.length-1;j>i&&j>=0;j--)
			{
				if(arr[i]>arr[j])
				{
					//swap
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
				
		}
		//to print
		for(int n:arr)
		{
			System.out.println(n);
		}

	}

}
