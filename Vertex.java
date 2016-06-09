class Vertex {
	public Graph.Color color;
	public int index;
	public int d, f;
	public Vertex parent;

	public Vertex (int index) {
		this.index = index;
	}
}
