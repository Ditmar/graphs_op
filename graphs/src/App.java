import graphs.Graphs;
import graphs.Vertex;
import graphs.algorithms.Bfs;
import graphs.algorithms.Dfs;

public class App {
    public static void main(String[] args) throws Exception {
        Graphs graph = new Graphs();
        Vertex v1 = new Vertex("v1");
        Vertex v2 = new Vertex("v2");
        Vertex v3 = new Vertex("v3");
        Vertex v4 = new Vertex("v4");
        Vertex v5 = new Vertex("v5");

        graph.addVertex(v1);
        graph.addVertex(v2);
        graph.addVertex(v3);
        graph.addVertex(v4);
        graph.addVertex(v5);

        graph.addEdge(v1.connect(v4, 2));
        graph.addEdge(v1.connect(v5, 1));
        graph.addEdge(v1.connect(v3, 8));
        graph.addEdge(v1.connect(v2, 4));
        graph.addEdge(v2.connect(v1, 4));
        graph.addEdge(v2.connect(v3, 3));
        graph.addEdge(v3.connect(v4, 5));
        graph.addEdge(v3.connect(v5, 3));
        graph.addEdge(v3.connect(v1, 8));
        graph.addEdge(v3.connect(v2, 3));
        graph.addEdge(v4.connect(v5, 4));
        graph.addEdge(v4.connect(v3, 5));
        graph.addEdge(v5.connect(v1, 1));
        graph.addEdge(v5.connect(v3, 3));

        Bfs.execute(v4);
        graph.cleanVisited();
        System.out.println("------------------------");
        Dfs.execute(v1);
    }
}
