package search;

public class LinearSearchUsingArrayFunction 
{
	int [] arr = {23,44,12,65,76,33,87};
	int flag;
	
	void display()
	{
		for(int n:arr)
		{
			System.out.print(n+" ");
			
		}
		System.out.println();
	}
	
	void linearSearch(int data)
	{
		int flag=0;
		for(int i=0;i<7;i++)
		{
			if(arr[i]==data)
			{
				flag=1;
				System.out.println("element found");
				
			}
			
		}
		
		if(flag==0)
		{
			System.out.println("element not found");
			
		}
		
	}
}
