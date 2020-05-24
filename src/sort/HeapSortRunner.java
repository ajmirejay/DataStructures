package sort;

public class HeapSortRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 3, 2, 5, 6, 1, 4 };
		int n = arr.length;
		HeapSortFunction heap = new HeapSortFunction();
		heap.maxHeapSort(arr, n);
		System.out.println("sorted array :");
		heap.printArray(arr, n);

	}

}
