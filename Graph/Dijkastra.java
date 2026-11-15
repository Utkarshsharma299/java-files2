import java.util.*;

public class Dijkastra {
     static  class Edge{
        int src;
        int dest;
        int wt;
        Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
this.wt=w;

        }

    }
    static void createGraph(ArrayList<Edge>graph[]){
for(int i=0;i<graph.length;i++){
    graph[i]=new ArrayList<>();

}
graph[0].add(new Edge(0,1,2));
graph[0].add(new Edge(0,2,4));
graph[1].add(new Edge(1,3,7));
graph[1].add(new Edge(1,2,1));
graph[2].add(new Edge(2,4,3));
graph[3].add(new Edge(3,5,1));
graph[4].add(new Edge(4,3,2));
graph[3].add(new Edge(4,5,5));



    }
    static class pairs implements Comparable<pairs>{
        int n;
        int path;
       public pairs(int n,int path){
        this.n=n;
        this.path=path;

       }
       @Override
       public int compareTo(pairs p2){
        return this.path-p2.path;//
       }
    }
    public static void dij(ArrayList<Edge>graph[],int src){
int dis[]=new int[graph.length];
for(int i=0;i<graph.length;i++){
    if(i!=src){
       dis[i]=Integer.MAX_VALUE;


    }
}
boolean vis[]=new boolean [graph.length];
PriorityQueue<pairs> pq=new PriorityQueue<>();
pq.add(new pairs(src,0));
while(!pq.isEmpty()){
    pairs curr=pq.remove();
    if(!vis[curr.n]){
        vis[curr.n]=true;
        for(int i=0;i<graph[curr.n].size();i++){
Edge e=graph[curr.n].get(i);
int u=e.src;
int v=e.dest;
int wt=e.wt;
if(dis[u]+wt<dis[v]){
   dis[v]= dis[u]+wt;
   pq.add(new pairs(v, dis[v]));
}
        }
    }
}

for(int i=0;i<dis.length;i++){
    System.out.println(dis[i]);
}
System.out.println();
    }
    public static void main(String args[]){
        int V=6;
        ArrayList<Edge>graph[]=new ArrayList[V];
        createGraph(graph);
        int src=0;
    }
}
