/*Time Complexity of Dijkstra's Algorithm is O ( V^2 ) */

package graph;

public class DijkstraRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vertex = 5;
		int edges = 7;
		int[][] adjMatrix = new int[vertex][vertex];
		adjMatrix[0][1] = 4;
		adjMatrix[0][2] = 8;
		adjMatrix[1][3] = 5;
		adjMatrix[1][2] = 2;
		adjMatrix[2][3] = 5;
		adjMatrix[2][4] = 9;
		adjMatrix[3][4] = 4;

		DijkstraFunction dij = new DijkstraFunction();
		dij.dijkstra(adjMatrix);

	}

}
