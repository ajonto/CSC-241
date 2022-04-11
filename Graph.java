import java.util.*;
public class Graph {
 private boolean adjMatrix[][];
 private int totalNode;
 // Initialize the matrix
 public Graph(int totalNode) {
 this.totalNode = totalNode;
 adjMatrix = new boolean[totalNode][totalNode];
 }
 // Add edges
 public void addEdge(int i, int j) {
 adjMatrix[i][j] = true;
 adjMatrix[j][i] = true;
 }
 // Remove edges
 public void removeEdge(int i, int j) {
 adjMatrix[i][j] = false;
 adjMatrix[j][i] = false;
 }
 public static void main(String args[]) {
 Graph g = new Graph(4);
 g.removeEdge(2, 3); 
g.addEdge(0, 1);
 g.addEdge(0, 2);
 g.addEdge(1, 2);
 g.addEdge(2, 0);
 g.addEdge(2, 3);
g.removeEdge(2, 0);

Scanner scan = new Scanner(System.in);
int j = scan.nextInt(); // user input to check edges 
int f = scan.nextInt();
System.out.println(g.adjMatrix[j][f]);
 }
}
