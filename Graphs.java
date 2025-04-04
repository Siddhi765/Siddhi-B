//Lecture 39 :- Graphs

import java.util.ArrayList;
public class Graphs {
    static class Edge{
        int src;
        int dest;

        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    //Create
    public static void createGraph(ArrayList<Edge> graph[]){
        //AL mein empty AL under hi data store hota hain so null ko hatake humein empty AL create karani padegi
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<Edge>(); //Create empty ArrayList
        }
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));
        
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,2));
        
    }
    public static void main(String args[]){
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V]; //V -> No. of vertices
    }
}
