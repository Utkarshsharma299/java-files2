import java.util.*;
public class Trajen{
    static class Edge{
        int src;
        int  dest;
Edge(int s,int d){
    this.src=s;
    this.dest=d;
}
    }
     public static void createGraph(ArrayList<Edge>graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();

        }
        graph[0].add(new Edge(0,1))
     }    
    public static void main(String args[]){

    }
}