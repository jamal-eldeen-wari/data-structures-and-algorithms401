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

    public void edgeWeight(String value1, String value2, int weight) {
        Vertices Vertex1 = new Vertices(value1, weight);
        Vertices Vertex2 = new Vertices(value2, weight);
        adjacentVertex.get(Vertex1).add(Vertex2);
        adjacentVertex.get(Vertex2).add(Vertex1);
    }
    public List<String> breadthFirstSearch(String vertex){
        List<String> visited = new ArrayList<>();
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

    int cost;
    public int businessTrip(Graph graph, String [] cityNames){
         cost = 0;
        int arrSize = cityNames.length;

        for(int i = 0; i<arrSize-1; i++){
            path(cityNames[i], cityNames[i+1],graph);
        }
        return cost;
    }

    private void path(String city1, String city2, Graph graph){
        if (graph.getNeighbors(city1) == null){
            return;
        }
        for (Vertices vertices: graph.getNeighbors(city1)){
            if (Objects.equals(city2,vertices.data)){
                cost = cost+vertices.weight;
            }
        }
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
