import java.util.*;
public class kosaRajus{
    static class Edge{
int src;
int dest;
    
     public Edge(int s,int d){
        this.src=s;
        this.dest=d;

    }
}
    public static void createGraph(ArrayList<Edge>graph[]){
graph[0].add(new Edge(0,2));
graph[0].add(new Edge(0,3));
graph[1].add(new Edge(1,0));
graph[2].add(new Edge(2,1));
graph[3].add(new Edge(3,4));



    }
    public static void TopSort(ArrayList<Edge>graph[],int curr,boolean vis[],Stack<Integer>s){
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                TopSort(graph, e.dest, vis, s);

            }
        }
        s.push(curr);
    }
    public static void algoritham(ArrayList<Edge>graph[],int V){
        Stack<Integer>s=new Stack<>();
        boolean vis[]=new boolean [V];
        for(int i=0;i<V;i++){
            if(!vis[i]){
                TopSort(graph,i,vis,s);
            }
        }
        ArrayList<Edge>transpose[]=new ArrayList[V];
        for(int i=0;i<graph.length;i++){
            vis[i]=false;
            transpose[i]=new ArrayList<>();
        }
        for(int i=0;i<V;i++){
            for(int j=0;i<graph[i].size();j++){
                Edge e=graph[i].get(j);
                transpose[e.dest].add(new Edge(e.dest,e.src));
            }
        }
        while(!s.isEmpty()){
            int curr=s.pop();
            if(!vis[curr]){
                System.out.println("-----");
                dfs(transpose,curr,vis);

            }
        }

    }
    public static void main(String args[]){

    }
}