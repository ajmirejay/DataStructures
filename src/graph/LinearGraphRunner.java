// time complexity is O(n)

package graph;

import java.util.ArrayList;

public class LinearGraphRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int s = 5;
		ArrayList<ArrayList<Integer>> adjGraph = new ArrayList<ArrayList<Integer>>(s);
		for (int i = 0; i < s; i++) {
			adjGraph.add(new ArrayList<Integer>());
		}
		LinearGraphFunctions adj = new LinearGraphFunctions();
		adj.addEdge(adjGraph, 0, 1);
		adj.addEdge(adjGraph, 0, 4);
		adj.addEdge(adjGraph, 1, 2);
		adj.addEdge(adjGraph, 1, 3);
		adj.addEdge(adjGraph, 1, 4);
		adj.addEdge(adjGraph, 2, 3);
		adj.addEdge(adjGraph, 3, 4);

		adj.printAdjMatrix(adjGraph);

	}

}
