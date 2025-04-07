package graphs.algorithms;

import graphs.Vertex;

public class Dfs {
    public static void execute(Vertex root) {
        root.setVisited(true);
        System.out.println("-> " + root.toString());
        for (Vertex vertex : root.getNeighborhoods()) {
            if (vertex.getVisited() == false) {
                execute(vertex);
            }
        }
    }
}
