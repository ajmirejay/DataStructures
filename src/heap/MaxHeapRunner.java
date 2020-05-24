// time complexity of insertion is O(log n)
// time complexity of deletion is O(log n)

package heap;

public class MaxHeapRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 1, 3, 5, 4, 6, 7, 9, 8 };
		System.out.print("Original array :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}

		MaxHeapFunction heap = new MaxHeapFunction(arr.length);
		heap.createHeap(arr);
		System.out.print("\nMax heap :");
		heap.displayMaxHeap();
		System.out.print("Extract max :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + heap.extractMax());
		}

	}

}
