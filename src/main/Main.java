package main;

import java.util.Scanner;
import model.Prim;

public class Main {
	public static Prim g;
	public static Scanner sc;
	
	
	public static void main(String[] args){
		sc = new Scanner(System.in);
		System.out.println("Enter the number of vertices:");
		int vertexNum = sc.nextInt();
		System.out.println("Enter the number of edges:");
		int edgesNum = sc.nextInt();
		int[][] weight = new int[vertexNum][vertexNum];
		g = new Prim (vertexNum);
		
		System.out.println("Next, enter in each line the edges and the weight:\n"
				+ "//Example of entry per line: 1 2 3//");
		for(int i = 0; i<edgesNum; i++){
			int v1 = sc.nextInt(), v2 = sc.nextInt(), w = sc.nextInt();
			weight[v1][v2]=w;
			weight[v2][v1]=w;
			g.addEdge(v1, v2);
		}
		g.prim(weight);
		System.out.println(g.print());
	}
}
