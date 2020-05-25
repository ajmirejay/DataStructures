//the time complexity of quick sort: best case O(n^2) and average case O(n log n)

package sort;

public class QuickSortRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {3,2,6,7,1,9,10};
		int n = arr.length;

		QuickSortFunction sort = new QuickSortFunction();
		sort.displayArray(arr);

		sort.sort(arr, 0, n - 1);

		sort.displayArray(arr);

	}

}
