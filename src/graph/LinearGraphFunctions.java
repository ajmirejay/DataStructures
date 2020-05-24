//given a set of vertices and set of edges create an adjacency matrix and print
//given a set i of integers and array list of adjacent node create a graph representation
//given an adjacency matrix find all possible ways to reach from vertex A to B
package graph;

import java.util.ArrayList;

public class LinearGraphFunctions {

	void addEdge(ArrayList<ArrayList<Integer>> adjGraph, int to, int from) {
		adjGraph.get(to).add(from);
		adjGraph.get(from).add(to);
	}

	void printAdjMatrix(ArrayList<ArrayList<Integer>> adjGraph) {
		for (int i = 0; i < adjGraph.size(); i++) {
			System.out.println("the edge from " + i + " are");
			for (int j = 0; j < adjGraph.get(i).size(); j++) {
				System.out.print("-> " + adjGraph.get(i).get(j));
			}
			System.out.println();
		}
	}

}
