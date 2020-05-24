// time complexity of insertion is O(log n)
// time complexity of deletion is O(log n)

package heap;

public class MinHeapRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 4, 3, 5, 1, 6, 9, 8, 7 };
		int n = arr.length;
		System.out.print("Original Array :");
		for (int i = 0; i < n; i++) {
			System.out.print(" " + arr[i]);
		}

		MinHeapFunction heap = new MinHeapFunction(n);
		System.out.print("\nMin Heap :");
		heap.createMinHeap(arr);
		heap.printMinHeap();
		System.out.print("Extract Max :");
		for (int i = 0; i < n; i++) {
			System.out.print(" " + heap.extractMin());
		}

	}

}
