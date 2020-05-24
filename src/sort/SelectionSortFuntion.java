package sort;

public class SelectionSortFuntion 
{
	int arr[] = {5,4,6,10,1,2};
	int n=arr.length;
	int flagForDisplay;
	
	void selectionSort()
	{
		flagForDisplay=1;
		for(int i=0;i<n-1;i++)
		{
			int min=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			if(min!=i)
			{
				int temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;				
			}
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
