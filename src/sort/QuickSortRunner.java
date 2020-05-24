//the time complexity of quick sort: best case O(n^2) and average case O(n log n)

package sort;

public class QuickSortRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[] { 5, 4, 6, 10, 1, 2, 45, 12, 66, 22, 3 };
		int n=arr.length;
		
		QuickSortFunction quick = new QuickSortFunction();
		quick.displayArray(arr);
		quick.sort(arr, 0, n-1);
		quick.displayArray(arr);
		
	}

}
