import java.util.*;

class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);

		/* Number of vertices in Graph */
		int N = sc.nextInt();
		/* Number of edges in Graph */
		int M = sc.nextInt();

		/* Vertices from 1 to N */
		List<Vertex> vertices = new ArrayList<Vertex>(N);
		for (int i = 0; i < N; i++) {
			vertices.add(new Vertex(i + 1));
		}

		/* Empty adjency list for each vertex */
		HashMap<Vertex, List<Vertex>> adj = new HashMap<>(M);
		for (Vertex v : vertices) {
			adj.put(v, new LinkedList<Vertex>());
		}

		/* Adjency list: source and destination */
		for (int i = 0; i < M; i++) {
			Vertex src = vertices.get(sc.nextInt() - 1);
			Vertex dst = vertices.get(sc.nextInt() - 1);
			adj.get(src).add(dst);
		}

		Graph graph = new Graph(vertices, adj);

		/* Vertices sorted in topological order */
		List<Vertex> topologic = graph.topologicalSort();
		for (Vertex v : topologic) {
			System.out.print(v.index + " ");
		}
		System.out.println("");
	}
}
