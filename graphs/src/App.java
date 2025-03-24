import graphs.Vertex;
import graphs.paths.Bfs;

public class App {
    public static void main(String[] args) throws Exception {
        Vertex v1 = new Vertex("v1");
        Vertex v2 = new Vertex("v2");
        Vertex v3 = new Vertex("v3");
        Vertex v4 = new Vertex("v4");
        Vertex v5 = new Vertex("v5");

        v1.connect(v4, 2);
        v1.connect(v5, 1);
        v1.connect(v3, 8);
        v1.connect(v2, 4);
        v2.connect(v1, 4);
        v2.connect(v3, 3);
        v3.connect(v4, 5);
        v3.connect(v5, 3);
        v3.connect(v1, 8);
        v3.connect(v2, 3);
        v4.connect(v5, 4);
        v4.connect(v3, 5);
        v5.connect(v1, 1);
        v5.connect(v3, 3);

        Bfs.execute(v4);

    }
}
