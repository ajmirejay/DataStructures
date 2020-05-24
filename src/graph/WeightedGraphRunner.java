// time complexity is O(V+E).

package graph;

public class WeightedGraphRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vertices = 6;
		WeightedGraphfunction graph = new WeightedGraphfunction(vertices);
		graph.addEdge(0, 1, 10);
		graph.addEdge(0, 2, 20);
		graph.addEdge(1, 3, 30);
		graph.addEdge(3, 1, 400);
		graph.addEdge(3, 4, 50);
		
		graph.printgraph();

	}

}
