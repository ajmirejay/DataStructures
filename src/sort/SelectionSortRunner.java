//time complexity of selection sort is: Best case and worst case O(n^2)


package sort;

public class SelectionSortRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SelectionSortFuntion selection = new SelectionSortFuntion();
		
		selection.displayArray();
		selection.selectionSort();
		selection.displayArray();
		
	}

}
