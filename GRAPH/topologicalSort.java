import java.util.*;

public class topologicalSort {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void topological(ArrayList<Edge> graph[]) {
        boolean vist[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < graph.length; i++) {
            if (!vist[i]) {
                topologicalUtil(graph, i, vist, s);
            }
        }
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }

    public static void topologicalUtil(ArrayList<Edge> graph[], int curr, boolean vist[], Stack<Integer> s) {
        vist[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vist[e.dest]) {
                topologicalUtil(graph, e.dest, vist, s);
            }
        }
        s.push(curr);
    }

    public static void main(String args[]) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // Cycle Example: 0 -> 2, 2 -> 3, 3 -> 0
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 3));
        topological(graph);
    }
}