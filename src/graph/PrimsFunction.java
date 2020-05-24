package graph;

public class PrimsFunction {

	int findMin(int[] weight, boolean[] visited) {
		int minVertex = -1;
		for (int i = 0; i < weight.length; i++) {
			if (!visited[i] && (minVertex == -1 || weight[i] < weight[minVertex])) {
				minVertex = i;
			}
		}
		return minVertex;
	}

	void prim(int[][] adjMatrix, int n) {
		boolean[] visited = new boolean[n];
		int[] parent = new int[n];
		int[] weight = new int[n];

		for (int i = 0; i < n; i++) {
			weight[i] = Integer.MAX_VALUE;
			visited[i] = false;
		}

		for (int i = 0; i < n - 1; i++) {
			int minVertex = findMin(weight, visited);
			visited[minVertex] = true;
			for (int j = 0; j < n; j++) {
				if (adjMatrix[minVertex][j] != 0 && !visited[j] || (weight[j] < adjMatrix[minVertex][j])) {
					weight[j] = adjMatrix[minVertex][j];
					parent[j] = minVertex;
				}

			}

		}

		for (int i = 1; i < n; i++) {
			if (parent[i] < i) {
				System.out.println(i + " " + parent[i] + " " + weight[i]);
			} else {
				System.out.println(parent[i] + " " + i + " " + weight[i]);
			}
		}
	}

}
