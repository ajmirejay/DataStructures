//worst case time complexity is O(n^2)  and best case time complexity is O(n)

package sort;

public class InsertionSortRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InsertionSortFunction insertion = new InsertionSortFunction();
		
		insertion.displayArray();
		insertion.insertionSort();
		insertion.displayArray();
			
		
		
	}

}
