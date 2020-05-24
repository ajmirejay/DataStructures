package sort;

public class QuickSortFunction {
	int flagForDisplay = 0;

	void sort(int arr[], int lb, int ub) {
		flagForDisplay = 1;

		if (lb < ub) {
			int loc = quickSort(arr, lb, ub);
			sort(arr, lb, loc - 1);
			sort(arr, loc + 1, ub);

		}

	}

	int quickSort(int arr[], int lb, int ub) {
		int pivot = arr[ub];
		int start = lb - 1;

		for (int j = start; j < ub; j++) {
			if (arr[j] <= pivot) {
				start++;
				int temp = arr[start];
				arr[start] = arr[j];
				arr[j] = temp;
			}
		}

			int temp = arr[start+1];
			arr[start+1] = arr[ub];
			arr[ub] = temp;
		
			return start+1;
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
