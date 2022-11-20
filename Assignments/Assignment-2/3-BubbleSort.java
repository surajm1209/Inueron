//3. WAP to sort an array using Bubble Sort Algorithm.
public class BubbleSort1 {

	public static void main(String[] args) {
		int[] arr= {4,67,55,6,89,10,2,8,100};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length-i;j++)
			{
				if(arr[j]<arr[j-1])
				{
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
			
		}
		//print the sorted array
		for(int val:arr)
		{
			System.out.print(val+ " ");
		}
	}

}
