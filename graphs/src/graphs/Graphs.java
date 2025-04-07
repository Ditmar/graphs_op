package graphs;

import java.util.ArrayList;
import java.util.HashMap;

public class Graphs {
    private ArrayList<Vertex> vertexList;
    private ArrayList<Edge> edgeList;

    // key v1_v2;
    private HashMap<String, Edge> mapEdges;

    public Graphs() {
        this.vertexList = new ArrayList<>();
        this.edgeList = new ArrayList<>();
        this.mapEdges = new HashMap<String, Edge>();
    }

    public void cleanVisited() {
        for (Vertex vertex : this.vertexList) {
            vertex.setVisited(false);
        }
    }

    public void addVertex(Vertex vertex) {
        this.vertexList.add(vertex);
    }

    public void addEdge(Edge edge) {
        String key = edge.getSource().toString() + "_" + edge.getDestination().toString();
        this.mapEdges.put(key, edge);
        this.edgeList.add(edge);
    }

    public Edge getEdge(String key) {
        return mapEdges.get(key);
    }

    public ArrayList<Vertex> getVertexList() {
        return vertexList;
    }

    public void setVertexList(ArrayList<Vertex> vertexList) {
        this.vertexList = vertexList;
    }

    public ArrayList<Edge> getEdgeList() {
        return edgeList;
    }

    public void setEdgeList(ArrayList<Edge> edgeList) {
        this.edgeList = edgeList;
    }

}
