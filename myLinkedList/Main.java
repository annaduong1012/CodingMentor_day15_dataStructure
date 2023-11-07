package myLinkedList;

import myLinkedList.LinkedList.Node;

public class Main {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		// Add new data at the end;
		LinkedList.addNode(list, 1);
		LinkedList.addNode(list, 2);
		LinkedList.addNode(list, 3);
		LinkedList.addNode(list, 4);
		LinkedList.addNode(list, 10);
		LinkedList.addNode(list, 15);
		
		LinkedList.printList(list);
		

		// add a new data at a specific index
		LinkedList.addNodeAtSpecificIndex(list, 7, 3);
		LinkedList.printList(list);
		
		// look for data at specific index
		Node randomNode = LinkedList.getNodeAtIndex(list, 5);
		System.out.println("Data at this index is: " + randomNode.data);
		



	}

}
