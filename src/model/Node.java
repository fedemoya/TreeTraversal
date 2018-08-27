package model;

public class Node {
	
	public Node left;
	public Node right;
	public String value;
	
	public Node(Node left, Node right, String value) {
		super();
		this.left = left;
		this.right = right;
		this.value = value;
	}
	
}
