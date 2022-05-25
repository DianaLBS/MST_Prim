package model;

import java.util.LinkedList;

public class Vertex {
	LinkedList<Vertex> adj;
	int data;
	Vertex parent;
	
	public Vertex(int data){
		this.data=data;
		parent=null;
		adj = new LinkedList<>();
	}
}