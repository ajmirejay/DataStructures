package graph;

import java.util.LinkedList;

public class WeightedGraphfunction {
	int vertices;
	LinkedList<NewEdge>[] adjacencyList;

	public WeightedGraphfunction(int vertices) {
		this.vertices = vertices;
		adjacencyList = new LinkedList[vertices];
		for (int i = 0; i < vertices; i++) {
			adjacencyList[i] = new LinkedList<>();
		}
	}

	void addEdge(int source, int destination, int weight) {
		NewEdge edge = new NewEdge(source, destination, weight);
		adjacencyList[source].addFirst(edge);
	}

	void printgraph() {
		for (int i = 0; i < vertices; i++) {
			LinkedList<NewEdge> list = adjacencyList[i];
			for (int j = 0; j < list.size(); j++) {
				System.out.println("vertex " + list.get(j).source + " to " + list.get(j).destination 
						+ " with weight "
						+ list.get(j).weight);

			}

		}
	}

}
