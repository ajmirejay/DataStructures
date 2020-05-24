//The time complexity is  O(ElogV),
package graph;

public class PrimsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vertex = 5;
		int edges = 7;
		int[][] adjMatrix = new int[vertex][vertex];

		PrimsFunction prims = new PrimsFunction();
		adjMatrix[0][1] = 4;
		adjMatrix[0][2] = 8;
		adjMatrix[1][3] = 6;
		adjMatrix[1][2] = 2;
		adjMatrix[2][3] = 3;
		adjMatrix[2][4] = 9;
		adjMatrix[3][4] = 5;

		prims.prim(adjMatrix, vertex);

	}

}
