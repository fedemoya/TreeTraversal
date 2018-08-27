package traversals;

import java.util.ArrayList;
import java.util.List;

import model.Node;

public class InOrder {
	
	public static List<String> traverse(Node node) {
		
		List<String> flattenedTree = new ArrayList<String>();
		
		if (node == null) {
			return flattenedTree;
		} else {
			flattenedTree.addAll(traverse(node.left));
			flattenedTree.add(node.value);
			flattenedTree.addAll(traverse(node.right));
		}
		
		return flattenedTree;
	}

}
