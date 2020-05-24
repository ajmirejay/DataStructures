/*  	   Average	      Worst case
Space		O(n)	       O(n)
Search		O(log n)	   O(n)
Insert		O(log n)	   O(n)
Delete		O(log n)	   O(n)
*/

package tree;

public class BinaryTreeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTreeFunctions tree = new BinaryTreeFunctions();
		NodeForTree root = null;

		root = tree.insert(root, 5);
		root = tree.insert(root, 3);
		root = tree.insert(root, 7);
		root = tree.insert(root, 4);
		root = tree.insert(root, 10);

		System.out.print("Recursive inorder traversal is: ");
		tree.inOrder(root);
		System.out.println();
		System.out.print("Iterative inorder traversal is: ");
		tree.itrInorder(root);
		System.out.println();

		System.out.print("Recursive preorder traversal is: ");
		tree.preOrder(root);
		System.out.println();
		System.out.print("Iterative preorder traversal is: ");
		tree.itrPreorder(root);
		System.out.println();

		System.out.print("Recursive postorder traversal is: ");
		tree.postOrder(root);
		System.out.println();
		System.out.print("Iterative postorder traversal is: ");
		tree.itrPostOrder(root);
		System.out.println();

		tree.Delete(root, 10);
		System.out.print("inorder traversal is: ");
		tree.inOrder(root);
		System.out.println();

		tree.search(root, 3);

		tree.levelOrder(root);

	}

}
