package Graph;

import java.util.*;
import Queue.QueueGeneric;

public class Graph {

    private final Map<Vertices, List<Vertices>> adjacentVertex;

    public Graph() {
        this.adjacentVertex =  new HashMap<>();;
    }


    public void addNode(String data) {
        Vertices vertex = new Vertices(data);
//        putIfAbsent it comes from Map Interface;
        adjacentVertex.putIfAbsent(vertex, new ArrayList<>());
    }

    public void addEdge(String Value1, String value2) {
//        Create new Vertices Objects
        Vertices vertex1 = new Vertices(Value1);
        Vertices vertex2 = new Vertices(value2);

        adjacentVertex.get(vertex1).add(vertex2);
        adjacentVertex.get(vertex2).add(vertex1);

    }
    public List<String> breadthFirstSearch(String vertex){
        List<String> visited = new ArrayList<>();
//        QueueGeneric<String> queue = new QueueGeneric<String>();
        Queue<String> queue = new LinkedList<>();
        queue.add(vertex);
        visited.add(vertex);

        while (!queue.isEmpty()){
            for(Vertices vertices: getNeighbors(queue.poll())){
                if (!visited.contains(vertices.data)){
                    queue.add(vertices.data);
                    visited.add(vertices.data);
                }
            }
        }
        return visited;
    }


    public Set<Vertices> getNodes(){
        return adjacentVertex.keySet();
    }

    public List<Vertices> getNeighbors(String data) {
        return adjacentVertex.get(new Vertices(data));
    }

    public int size() {
        return adjacentVertex.size();
    }



}
