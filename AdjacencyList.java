import java.util.*;
public class AdjacencyList {
    public Map <Character, ArrayList<Character>> adjList = new HashMap<>();
    public void addNote (char start, char dest){
        if (!adjList.containsKey(start)) {
            adjList.put(start, new ArrayList<>());
        }
        if (!adjList.containsKey(dest)) {
            adjList.put(dest, new ArrayList<>());
        }
        adjList.get(start).add(dest);
    }
    
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Character vertexC : adjList.keySet()) {
            result.append("vertex").append(vertexC).append(" --> ");   
            for (Character vertexD : adjList.get(vertexC)) {
                result.append(vertexD).append(" ");
            }
            result.append("\n");
        }
        return result.toString();
    }
}