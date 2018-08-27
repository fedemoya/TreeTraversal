package main;

import java.util.List;

import model.Node;
import traversals.InOrder;
import traversals.PreOrder;

public class Main {

	public static void main(String[] args) {
		
		Node tree = new Node(
				new Node(
						new Node(null,null,"A"),
						new Node(
								new Node(null,null,"C"),
								new Node(null,null,"E"),
								"D"),
						"B"),
				new Node(
						null,
						new Node(
								new Node(null,null,"H"),
								null,
								"I"),
						"G"),
				"F");
					
		
		System.out.println("Pre order:");
		
		List<String> preOrderTraversal = PreOrder.traverse(tree);
		
		for (String string : preOrderTraversal) {
			System.out.print(string);
		}
		
		System.out.println("\nIn order:");
		
		List<String> inOrderTraversal = InOrder.traverse(tree);
		
		for (String string : inOrderTraversal) {
			System.out.print(string);
		}
		
		Node reBuildTree = ReBuildFromTraversal.fromInOrderAndPreOrder(inOrderTraversal, preOrderTraversal);
		
		System.out.println("\nPre order from re-build tree:");
		
		List<String> preOrderTraversalFromReBuildTree = PreOrder.traverse(reBuildTree);
		
		for (String string : preOrderTraversalFromReBuildTree) {
			System.out.print(string);
		}

	}

}
