package sort;

public class InsertionSortFunction 
{

	int temp;
	int arr[]= {5,4,6,10,1,2};
	int n=arr.length;
	int flagForDisplay;
		
	void insertionSort()
	{
		flagForDisplay=1;
		for(int i=1;i<n;i++)
		{
			temp=arr[i];
			int j=i-1;
			
			while(j>=0&&arr[j]>temp)
			{
				
				arr[j+1]=arr[j];
				j--;
				
			};
			arr[j+1]=temp;
		}
		
	}
	
	void displayArray()
	{
		if(flagForDisplay==0)
		{
			System.out.println("elements before sorting ");
			for(int i:arr)
			{
				System.out.print(i+" ");
				
			}
			System.out.println();
		}
		else
		{
			System.out.println("elements after sorting ");
			for(int i:arr)
			{
				System.out.print(i+" ");
			
			}
			System.out.println();
		}
	}
	
}
