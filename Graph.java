import java.util.*;

class Graph {
	static int time;
	static enum Color {
		WHITE, GRAY, BLACK;
	}

	List<Vertex> vertices;
	HashMap<Vertex, List<Vertex>> adj;

	public Graph (List<Vertex> vertices, HashMap<Vertex, List<Vertex>> adj) {
		this.vertices = vertices;
		this.adj = adj;
	}

	private void visit (Vertex v, LinkedList<Vertex> topologic) {
		time += 1;
		v.d = time;
		v.color = Color.GRAY;

		for (Vertex u : adj.get(v)) {
			if (u.color == Color.WHITE) {
				u.parent = v;
				visit(u, topologic);
			}
		}

		time += 1;
		v.f = time;
		v.color = Color.BLACK;
		topologic.addFirst(v);
	}

	public List<Vertex> topologicalSort () {
		LinkedList<Vertex> topologic = new LinkedList<Vertex>();

		for (Vertex v : vertices) {
			v.color = Color.WHITE;
			v.parent = null;
		}

		time = 0;

		for (Vertex v : vertices) {
			if (v.color == Color.WHITE) {
				visit(v, topologic);
			}
		}
		return topologic;
	}

}
