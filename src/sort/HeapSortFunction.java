package sort;

public class HeapSortFunction {

	void heapify(int[] arr, int n, int i) {
		int largest = i;
		int l = (i * 2) + 1;
		int r = (i * 2) + 2;
		if (l < n && arr[l] > arr[largest]) {
			largest = l;
		}
		if (r < n && arr[r] > arr[largest]) {
			largest = r;
		}

		if (largest != i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
				
			heapify(arr, n, largest);
		}
	}

	void maxHeapSort(int[] arr, int n) {
		for (int i = n / 2 - 1; i >= 0; i--) {
			heapify(arr, n, i);
		}

		for (int i = n - 1; i > 0; i--) {
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;
			heapify(arr, i, 0);
		}
	}

	void printArray(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
