package sort;

public class MergeSortFunction {
	
	int flagForDisplay;
	
	void mergeSort(int arr[], int lb,int ub)
	{
		flagForDisplay=1;
		if (lb < ub) 
        { 
            int mid = (lb+ub)/2; 
            mergeSort(arr, lb, mid); 
            mergeSort(arr , mid+1, ub); 
            merge(arr, lb, mid, ub); 
        } 
		
	}

	void merge(int arr[],int lb,int mid, int ub)
	{
		int splitSize1 = mid - lb + 1; 
        int splitSize2 = ub - mid; 
  
        int splitArr1[] = new int [splitSize1]; 
        int splitArr2[] = new int [splitSize2]; 
  
       
        for (int i=0; i<splitSize1; ++i) 
        {
            splitArr1[i] = arr[lb + i]; 
        }
        
        for (int j=0; j<splitSize2; ++j) 
        {
        	splitArr2[j] = arr[mid + 1+ j]; 
        }
        
        int i = 0, j = 0; 
        int k = lb; 
        while (i < splitSize1 && j < splitSize2) 
        { 
            if (splitArr1[i] <= splitArr2[j]) 
            { 
                arr[k] = splitArr1[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = splitArr2[j]; 
                j++; 
            } 
            k++; 
        };
  
        while (i < splitSize1) 
        { 
            arr[k] = splitArr1[i]; 
            i++; 
            k++; 
        };
  
        while (j < splitSize2) 
        { 
            arr[k] = splitArr2[j]; 
            j++; 
            k++; 
        } 
		
	}

	void displayArray(int arr[])
	{
		if(flagForDisplay==0)
		{
			System.out.println("elements before sorting ");
		
			for(int n:arr)
			{
				System.out.print(n+" ");
			
			}
			System.out.println();
		}
		else
		{
			
			System.out.println("elements after sorting");
			for(int n:arr)
			{
				System.out.print(n+" ");
				
			}
			System.out.println();
		}
		
	}

}
