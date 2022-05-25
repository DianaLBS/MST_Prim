package model;
public class Prim extends Graph{
	int w;
	int[] key;
	int[] mst;

	public Prim(int numV) {
		super(numV);
		w = 0;
		key = new int[numV];
		for(int i = 0; i<numV; i++) {
			key[i] = Integer.MAX_VALUE;
		}	
		mst = new int[numV];
	}
	
	public void prim(int[][] weight){
		Vertex parents[] = new Vertex[weight.length];
		key[0]=0;
		parents[0]=null;
		int u = minIndex();
		while(u!=-1){
			w+=key[u];
			for(Vertex ver:vertex[u].adj){
				if(mst[ver.data]==0 && weight[u][ver.data]<key[ver.data]){
					ver.parent=vertex[u];
					key[ver.data]=weight[u][ver.data];
				}
			}
			mst[u]=1;
			u=minIndex();
		}
	}

	private int minIndex(){
		int min=Integer.MAX_VALUE;
		int index=-1;
		for(int i=0;i<numV;i++){
			if(mst[i]==0 && key[i]<min){
				min = key[i];
				index=i;
			}
		}
		return index;
	}
	
	public String print() {
		String msj=("\nThe minimum spanning tree is composed of:"
				+"\nEdges/Weight");
		
		for(int i=0; i<vertex.length;i++) {
			if(vertex[i].parent!=null) {
				msj+=("\n"+vertex[i].data+"--"+vertex[i].parent.data+" / "+key[vertex[i].data]);
			}
		}
		msj+=("\nTotal Weight: "+w);
		return msj;
	}

}