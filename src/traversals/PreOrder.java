package traversals;

import java.util.ArrayList;
import java.util.List;

import model.Node;

public class PreOrder {
	
	public static List<String> traverse(Node node) {
		
		List<String> flattenedTree = new ArrayList<String>();
		
		if (node == null) {
			return flattenedTree;
		} else {
			flattenedTree.add(node.value);
			flattenedTree.addAll(traverse(node.left));
			flattenedTree.addAll(traverse(node.right));
		}
		
		return flattenedTree;
	}

}
