package tree;

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class BinaryTreeFunctions {

	NodeForTree insert(NodeForTree node, int data) {
		if (node == null) {
			NodeForTree newNode = new NodeForTree(data);
			return newNode;
		}
		if (data < node.data) {
			node.left = insert(node.left, data);
		} else {
			node.right = insert(node.right, data);
		}

		return node;
	}

	void inOrder(NodeForTree node) {
		if (node != null) {
			inOrder(node.left);
			System.out.print(node.data + " ");
			inOrder(node.right);
			return;
		}
	}

	void itrInorder(NodeForTree root) {
		if (root == null) {
			return;
		}
		Stack<NodeForTree> stack = new Stack<NodeForTree>();
		NodeForTree node = root;
		while (true) {
			if (node != null) {
				stack.push(node);
				node = node.left;
			} else if (stack.isEmpty()) {
				break;
			} else {
				node = stack.pop();
				System.out.print(node.data + " ");
				node = node.right;
			}
		}

	}

	void preOrder(NodeForTree node) {
		if (node != null) {
			System.out.print(node.data + " ");
			preOrder(node.left);
			preOrder(node.right);
			return;
		}
	}

	void itrPreorder(NodeForTree root) {
		if (root == null) {
			return;
		}
		Stack<NodeForTree> stack = new Stack<NodeForTree>();
		stack.push(root);
		while (!stack.isEmpty()) {
			root = stack.pop();
			System.out.print(root.data + " ");
			if (root.right != null) {
				stack.push(root.right);
			}
			if (root.left != null) {
				stack.push(root.left);
			}
		}

	}

	void postOrder(NodeForTree node) {
		if (node != null) {
			postOrder(node.left);
			postOrder(node.right);
			System.out.print(node.data + " ");
		}
	}

	void itrPostOrder(NodeForTree root) {
		NodeForTree current = root;
		Stack<NodeForTree> stack = new Stack<NodeForTree>();

		while (current != null || !stack.isEmpty()) {
			if (current != null) {
				stack.push(current);
				current = current.left;
			} else {
				NodeForTree temp;
				temp = stack.peek().right;
				if (temp == null) {
					temp = stack.pop();
					System.out.print(temp.data + " ");
					while (!stack.isEmpty() && temp == stack.peek().right) {
						temp = stack.pop();
						System.out.print(temp.data + " ");
					}
				} else {
					current = temp;
				}

			}
		}
	}

	NodeForTree findMin(NodeForTree root) {
		while (root.left != null) {
			root = root.left;
		}
		return root;
	}

	NodeForTree Delete(NodeForTree root, int data) {
		if (root == null) {
			return root;

		} else if (data < root.data) {
			root.left = Delete(root.left, data);

		} else if (data > root.data) {
			root.right = Delete(root.right, data);

		} else if (root.left == null && root.right == null) {
			root = null;

		} else if (root.left == null) {
			NodeForTree temp = root;
			root = root.right;

		} else if (root.right == null) {
			NodeForTree temp = root;
			root = root.left;

		} else {
			NodeForTree temp = findMin(root.right);
			root.data = temp.data;
			root.right = Delete(root.right, temp.data);
		}

		return root;
	}

	NodeForTree search(NodeForTree root, int data) {
		if (root == null) {
			System.out.println("not found");
			return null;
		}

		if (root.data == data) {
			System.out.println("element found in the treee");
			return root;

		} else if (data < root.data) {
			root = search(root.left, data);

		} else {
			root = search(root.right, data);
		}
		return root;
	}

	NodeForTree levelOrder(NodeForTree root) {
		if (root == null) {
			return root;
		}
		System.out.println("the level order traversal is ");
		Queue<NodeForTree> q = new LinkedList<NodeForTree>();
		q.offer(root);
		q.offer(null);
		while (!q.isEmpty()) {
			root = q.poll();
			if (root != null) {
				System.out.print(root.data + " ");
				if (root.left != null) {
					q.offer(root.left);
				}
				if (root.right != null) {
					q.offer(root.right);
				}
			} else {
				if (!q.isEmpty()) {
					System.out.println();
					q.offer(null);

				}
			}
		}

		return root;
	}

}
