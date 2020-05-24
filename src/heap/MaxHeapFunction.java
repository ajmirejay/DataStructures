package heap;

public class MaxHeapFunction {

	int[] maxArr;
	int capacity;
	int currentSize;

	public MaxHeapFunction(int capacity) {
		this.capacity = capacity;
		maxArr = new int[capacity + 1];
		currentSize = 0;
	}

	void createHeap(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			insert(arr[i]);
		}
	}

	void insert(int x) {

		currentSize++;
		int index = currentSize;
		maxArr[index] = x;
		popUpMax(index);
	}

	void popUpMax(int index) {
		int parentIndex = index / 2;
		int currentIndex = index;
		while (currentIndex > 0 && maxArr[currentIndex] > maxArr[parentIndex]) {
			int temp = maxArr[parentIndex];
			maxArr[parentIndex] = maxArr[currentIndex];
			maxArr[currentIndex] = temp;

			currentIndex = parentIndex;
			parentIndex = parentIndex / 2;
		}

	}

	int extractMax() {
		int max = maxArr[1];
		maxArr[1] = maxArr[currentSize];
		maxArr[currentSize] = 0;
		heapify(1);
		currentSize--;
		return max;

	}

	void heapify(int key) {
		int largest = key;
		int l = (2 * key);
		int r = (2 * key) + 1;

		if (l < currentSize && maxArr[l] > maxArr[largest]) {
			largest = l;
		}
		if (r < currentSize && maxArr[r] > maxArr[largest]) {
			largest = r;
		}

		if (largest != key) {
			int temp = maxArr[largest];
			maxArr[largest] = maxArr[key];
			maxArr[key] = temp;
			heapify(largest);
		}

	}

	void displayMaxHeap() {
		for (int i = 1; i < maxArr.length; i++) {
			System.out.print(" " + maxArr[i]);
		}
		System.out.println();
	}

}
