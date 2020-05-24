package tree;

public class NodeForTree {

	public int data;
	public NodeForTree right, left;

	public NodeForTree(int data) {
		this.data = data;
	}

	public NodeForTree(int data, NodeForTree left, NodeForTree right) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
