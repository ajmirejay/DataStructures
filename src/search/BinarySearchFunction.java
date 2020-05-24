package search;

public class BinarySearchFunction 
{
	int [] arr= {5,9,17,23,25,45,59,63,71,89};
	int n=arr.length;
	
	void display()
	{
		for(int n:arr)
		{
			System.out.print(n+" ");
		
		}
		System.out.println();
	}
	
	void binarySearch(int data)
	{
		int l=0;
		int r=n-1;
		int flag=0;
		
		while(l<r)
		{
			int mid=(l+r)/2;
			
			if(data==arr[mid])
			{
				flag=1;
				System.out.println("element found");
				break;
				
			}
			else if(data<arr[mid])
			{
				r=mid-1;
				
			}
			else
			{
				l=mid+1;
			}
		
		};
		
		if(flag==0)
		{
		
			System.out.println("element not found in array");
		}
	}


}
