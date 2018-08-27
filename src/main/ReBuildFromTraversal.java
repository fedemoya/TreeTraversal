package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import model.Node;

public class ReBuildFromTraversal {
	
	public static Node fromInOrderAndPreOrder (List<String> inOrderTraversal, List<String> preOrderTraversal) {
		String rootValue = preOrderTraversal.remove(0);
		Node left = null;
		Node right= null;
		List<String> leftTraversal = getLeftTraversal(inOrderTraversal, rootValue);
		if (leftTraversal.size() > 0) {
			left = fromInOrderAndPreOrder(leftTraversal, preOrderTraversal);
		}
		List<String> rightTraversal = getRightTraversal(inOrderTraversal, rootValue);
		if (rightTraversal.size() > 0) {
			right = fromInOrderAndPreOrder(rightTraversal, preOrderTraversal);
		}
		Node rootNode = new Node(left, right, rootValue);
		return rootNode;
	}

	private static List<String> getLeftTraversal(List<String> inOrderTraversal, String rootValue) {
		List<String> leftTraversal = new ArrayList<String>();
		Iterator<String> iterator = inOrderTraversal.iterator();
		while(iterator.hasNext()) {
			String value = iterator.next();
			if(rootValue.equals(value)) {
				break;
			} else {
				leftTraversal.add(value);
			}
		}
		return leftTraversal;
	}
	
	private static List<String> getRightTraversal(List<String> inOrderTraversal, String rootValue) {
		List<String> rightTraversal = new ArrayList<String>();
		Iterator<String> iterator = inOrderTraversal.iterator();
		String value;
		while(iterator.hasNext()) {
			value = iterator.next();
			if(rootValue.equals(value)) {
				break;
			}
		}
		while(iterator.hasNext()) {
			rightTraversal.add(iterator.next());
		}
		return rightTraversal;
	}

}
