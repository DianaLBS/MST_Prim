package model;
public class Graph {
	int numV;
	Vertex[] vertex;
	
	public Graph(int num){
		this.numV=num;
		vertex = new Vertex[num];
		for(int i = 0; i<num; i++){
			vertex[i] = new Vertex(i);
		}
	}

	public void addEdge(int v1, int v2){
		vertex[v1].adj.add(vertex[v2]);
		if(v1!=v2) {
			vertex[v2].adj.add(vertex[v1]);
		}
	}
}