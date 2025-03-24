package graphs.paths;

import java.util.ArrayList;

import graphs.Vertex;

public class Bfs {

    public static void execute(Vertex source) {
        source.setVisited(true);
        ArrayList<Vertex> line = new ArrayList<>();
        line.add(source);

        while (!line.isEmpty()) {
            Vertex firstVertex = line.get(0);
            line.remove(0);
            System.out.println("-> " + firstVertex.toString());
            firstVertex.getNeighborhoods().forEach((item) -> {
                if (!item.getVisited()) {
                    line.add(item);
                    item.setVisited(true);
                }
            });
        }
    }
}
