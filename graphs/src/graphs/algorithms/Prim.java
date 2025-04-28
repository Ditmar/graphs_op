package graphs.algorithms;

import java.util.ArrayList;

import graphs.Edge;
import graphs.Graphs;
import graphs.Vertex;

// The real name of  the  spanning tree algorithm is PRIM
public class Prim {
    private Vertex source;
    private ArrayList<Vertex> connectedList = new ArrayList<Vertex>();
    private ArrayList<Vertex> disconnedList = new ArrayList<Vertex>();
    private Graphs graph;

    public Prim(Graphs graph) {
        // step 0
        this.graph = graph;
        for (Vertex vertex : this.graph.getVertexList()) {
            disconnedList.add(vertex);
        }
    }

    // private Graphs graph;
    public void execute() {
        // step 1
        this.source = this.disconnedList.get(0);
        this.connectedList.add(source);
        this.disconnedList.remove(this.source);
        while (!this.disconnedList.isEmpty()) {
            Vertex minVertex = getMinVertex();
            this.connectedList.add(minVertex);
            this.disconnedList.remove(minVertex);
        }
        System.out.println("Finish Prim");
    }

    public Vertex getMinVertex() {
        Integer min = 99999;
        Vertex candidate = null;
        // todo: no es optimo
        for (Integer i = 0; i < this.connectedList.size(); i++) {
            for (Integer j = 0; j < this.disconnedList.size(); j++) {
                Vertex source = this.connectedList.get(i);
                Vertex destination = this.disconnedList.get(j);
                String key = source.toString() + "_" + destination.toString();
                Edge edge = this.graph.getEdge(key);
                if (edge != null && edge.getWeight() < min) {
                    min = edge.getWeight();
                    candidate = edge.getDestination();
                }
            }
        }
        return candidate;
    }
}
