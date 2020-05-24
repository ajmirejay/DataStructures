package sort;

public class MergeSortRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[] { 5, 4, 6, 10, 1, 2, 45, 12, 66, 22, 3 };
		MergeSortFunction merge = new MergeSortFunction();
		merge.displayArray(arr);
		merge.mergeSort(arr,0,arr.length-1);
		merge.displayArray(arr);
	}

}
