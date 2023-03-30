package Graph;
import java.util.*;
import java.util.Stack;

public class GraphDfsIterate
{
        private ArrayList<Integer>[] adj;
        private int E;
        private int V;

        public GraphDfsIterate(int nodes)
        {
            this.V=nodes;
            this.E=0;
            this.adj = new ArrayList[nodes];
            for(int i=0;i<V;i++)
            {
                this.adj[i] = new ArrayList<>();
            }
        }
        public void addEdge(int u , int v){
            adj[u].add(v);
            adj[v].add(u);
        }
        public static void main(String[] args) {
            
            GraphDfsIterate g = new GraphDfsIterate(4);
            g.addEdge(0,1);
            g.addEdge(1,2);
            g.addEdge(2,3);
            g.addEdge(3,0);
            g.dfsIterate(0);
        }
        public void dfsIterate(int s){
            boolean[] visited = new boolean[V];
            Stack<Integer> stack = new Stack<>();
            stack.push(s);
            while(!stack.isEmpty()){
                int u = stack.pop();
                if(!visited[u]){
                    visited[u]= true;
                    System.out.print(u+" ");
                    for (int v : adj[u]) {
                        System.out.println(v);
                        if(!visited[v]){
                            stack.push(v);
                        }
                    }
                }
            }
        }
    
}