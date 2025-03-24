package graphs;

import java.util.ArrayList;

public class Vertex {
    private String name; // v1
    private ArrayList<Edge> edges;
    private ArrayList<Vertex> neighborhoods;
    private Boolean visited;

    public Vertex(String name) {
        this.name = name;
        this.edges = new ArrayList<>();
        this.neighborhoods = new ArrayList<>();
        this.visited = false;
    }

    public ArrayList<Vertex> getNeighborhoods() {
        return this.neighborhoods;
    }

    public void setVisited(Boolean isVisited) {
        this.visited = isVisited;
    }

    public Boolean getVisited() {
        return this.visited;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public void connect(Vertex destination, Integer weight) {
        Edge edge = new Edge(this, destination, weight);
        this.edges.add(edge);
        this.neighborhoods.add(destination);
    }

    public void connect(Vertex destination) {
        Edge edge = new Edge(this, destination);
        this.edges.add(edge);
        this.neighborhoods.add(destination);
    }
}
