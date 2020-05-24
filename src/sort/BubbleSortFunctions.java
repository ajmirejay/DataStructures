package sort;

public class BubbleSortFunctions 
{

	int arr[] = {23,11,44,56,17,98,89,3,7,91};
	int n=arr.length;
	int flag=0;
	int flagForDisplay=0;
	
	void bubbleSort()
	{
		flagForDisplay=1;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=1;
				}
			}
			
			if(flag==0)
			{
				break;
			}
		
		}
	}
	
	void printArray()
	{
		if(flagForDisplay==0)
		{
			System.out.println("Array before sorting");
			for(int n:arr)
			{
				System.out.print(n+" ");
			
			}
			System.out.println();
		}
		else
		{
			System.out.println("sorted array");
			for(int n:arr)
			{
				System.out.print(n+" ");
				
			}
		}
		
	}
	
}
