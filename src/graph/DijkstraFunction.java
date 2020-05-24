package graph;

public class DijkstraFunction {

	void dijkstra(int[][] adjMatrix) {
		int v = adjMatrix.length;
		boolean visited[] = new boolean[v];
		int distance[] = new int[v];
		distance[0] = 0;

		for (int i = 1; i < v; i++) {
			distance[i] = Integer.MAX_VALUE;
		}
		for (int i = 0; i < v - 1; i++) {
			int minVertex = findMin(distance, visited);
			visited[minVertex] = true;
			for (int j = 0; j < v; j++) {
				if (adjMatrix[minVertex][j] != 0 && (!visited[j] && distance[minVertex] != Integer.MAX_VALUE)) {
					int newDistance = distance[minVertex] + adjMatrix[minVertex][j];
					if (newDistance < distance[j]) {
						distance[j] = newDistance;
					}
				}
			}
		}

		for (int i = 0; i < v; i++) {
			System.out.println(i + " " + distance[i]);
		}
	}

	int findMin(int distance[], boolean visited[]) {
		int minVertex = -1;
		for (int i = 0; i < distance.length; i++) {
			if (!visited[i] && (minVertex == -1 || distance[i] < distance[minVertex])) {
				minVertex = i;
			}
		}
		return minVertex;
	}
}
