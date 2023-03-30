package Graph;
import java.util.*;

public class GraphDfsRec {

    ArrayList<Integer> adj[] ;
    int E;
    int V;

    public GraphDfsRec(int nodes){
        this.V = nodes;
        this.E = 0;
        this.adj = new ArrayList[nodes];
        for(int i = 0; i<V;i++){
            this.adj[i] = new ArrayList<>();
        }
    }

    public void addEdge(int u, int v){
        adj[u].add(v);
        adj[v].add(u);
    }

    public static void main(String[] args) {
        GraphDfsRec gf = new GraphDfsRec(4);
        gf.addEdge(0,1);
        gf.addEdge(1,2);
        gf.addEdge(2,3);
        gf.addEdge(3,0);
        gf.dfsRec();
    }

    public void dfsRec(){
        boolean visited[] = new boolean[V];
        for (int v = 0; v < V; v++) {
            if(!visited[v]){
                dfsHelper(v,visited);
            }
        }

    }

    public void dfsHelper(int v , boolean[] visited){
        visited[v] = true;
        System.out.println(v+" ");
        for(int w : adj[v]){
            if(!visited[w])
             dfsHelper(w, visited);
        }
    }
}
