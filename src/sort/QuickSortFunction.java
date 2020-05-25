package sort;

public class QuickSortFunction {
	int flagForDisplay = 0;

	void sort(int arr[], int low, int high) {
		flagForDisplay = 1;
		if (low < high) {
			int pi = partition(arr, low, high);
			sort(arr, low, pi - 1);
			sort(arr, pi + 1, high);
		}
	}

	int partition(int arr[], int low, int high) {
		int pivot = arr[low];
		int start = low;
		int end = high;
		while (start < end) {
			while (arr[start] <= pivot && start < high) {
				start++;
			}
			while (arr[end] > pivot && end > low) {
				end--;
			}
			if (start < end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
			}
		}

		int temp = arr[low];
		arr[low] = arr[end];
		arr[end] = temp;

		return end;
	}

	void displayArray(int arr[]) {
		if (flagForDisplay == 0) {
			System.out.println("elements before sorting");
			for (int n : arr) {

				System.out.print(n + " ");
			}
			System.out.println();
		} else {
			System.out.println("elements after sorting");
			for (int n : arr) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
	}
}
