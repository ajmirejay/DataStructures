package heap;

public class MinHeapFunction {

	int[] minArr;
	int capacity;
	int currentSize;

	public MinHeapFunction(int capacity) {
		this.capacity = capacity;
		minArr = new int[capacity + 1];
		currentSize = 0;
	}

	void createMinHeap(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			insert(arr[i]);
		}
	}

	void insert(int key) {
		currentSize++;
		int index = currentSize;
		minArr[index] = key;
		popUpMin(index);
	}

	void popUpMin(int index) {
		int parentIndex = index / 2;
		int currentIndex = index;
		while (currentIndex > 0 && minArr[currentIndex] < minArr[parentIndex]) {
			int temp = minArr[parentIndex];
			minArr[parentIndex] = minArr[currentIndex];
			minArr[currentIndex] = temp;

			currentIndex = parentIndex;
			parentIndex = parentIndex / 2;

		}

	}

	int extractMin() {
		int min = minArr[1];
		minArr[1] = minArr[currentSize];
		minArr[currentSize] = 0;
		heapify(1);
		currentSize--;
		return min;
	}

	void heapify(int i) {
		int smallest = i;
		int l = (2 * i);
		int r = (2 * i) + 1;

		if (l < currentSize && minArr[l] < minArr[smallest]) {
			smallest = l;
		}
		if (r < currentSize && minArr[r] < minArr[smallest]) {
			smallest = r;
		}
		if (i != smallest) {
			int temp = minArr[smallest];
			minArr[smallest] = minArr[i];
			minArr[i] = temp;

			heapify(smallest);
		}

	}

	void printMinHeap() {
		for (int i = 0; i < minArr.length; i++) {
			System.out.print(" " + minArr[i]);
		}
		System.out.println();
	}

}
