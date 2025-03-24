package graphs;

public class Edge {
    private Vertex source;
    private Vertex destination;
    private Integer weight;

    public Edge(Vertex source, Vertex destination, Integer weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    public Edge(Vertex source, Vertex destination) {
        this.source = source;
        this.destination = destination;
        this.weight = 1;
    }

    @Override
    public String toString() {
        // (v1, v2)
        return "(" + this.source.toString() + ", " + this.destination.toString() + ")";
    }

    public Integer getWeight() {
        return this.weight;
    }

}
