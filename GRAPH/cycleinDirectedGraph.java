import java.util.ArrayList;

public class cycleinDirectedGraph {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) { //FALSE - no cycle
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 0));
    }

    public static boolean isCycle(ArrayList<Edge> graph[]){
        boolean vist[] = new boolean[graph.length];
        boolean rveStack[] = new boolean[graph.length];
        for(int i =0; i<graph.length; i++){
            if(!vist[i]){
                if(isCycleUtil(graph,i,vist,rveStack)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isCycleUtil(ArrayList<Edge> graph[],int curr, boolean vist[], boolean rveStack[]){
        vist[curr] = true;
        rveStack[curr] = true;
        for(int i =0; i< graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(rveStack[e.dest]){
                return true;
            }
            if(!vist[e.dest] && isCycleUtil(graph, e.dest, vist, rveStack)){
                return true;
            }
        }
        rveStack[curr] = false;
        return false;
    }
    public static void main(String[] args) {
        int v =4;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        System.out.print(isCycle(graph));
    }
}
