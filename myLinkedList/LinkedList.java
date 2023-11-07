package myLinkedList;

public class LinkedList {

	Node head;
	Node tail;
	int size;

	public static class Node {
		int data;
		Node next;
		Node prev;

		public Node(int data) {
			super();
			this.data = data;
		}

	}

	// Add new data at the end
	public static void addNode(LinkedList list, int data) {

		Node newNode = new Node(data);
		newNode.next = null;

		if (list.head == null) {
			list.head = newNode;
			list.tail = newNode;
		} else {
			list.tail.next = newNode;
			list.tail = newNode;
		}
		list.size++;
	}

	// Add new node at specific index
	public static void addNodeAtSpecificIndex(LinkedList list, int data, int index) {

		Node newNode = new Node(data);

		if (index < 0 || index > list.size) {
			System.out.println("Invalid index");
			return;
		}
		if (index == 0) {
			newNode.next = list.head;
			list.head = newNode;
			return;
		}
		if (index == list.size) {
			addNode(list, data);
			return;
		} else {
			Node previousNode = getNodeAtIndex(list, index - 1);
			newNode.next = previousNode.next;
			previousNode.next = newNode;
		}
		list.size++;
	}

	// Get node at specific index get(index)
	public static LinkedList.Node getNodeAtIndex(LinkedList list, int index) {

		if (index < 0 || index >= list.size) {
			return null;
		}

		Node current = list.head;
		int currentIndex = 0;

		while (current != null) {
			if (currentIndex == index) {
				return current;
			}
			current = current.next;
			currentIndex++;
		}
		return null;
		

	}

	// Print linked list
	public static void printList(LinkedList list) {
		Node currentNode = list.head;

		System.out.print("The current linked list is: ");

		while (currentNode != null) {
			// Print the data at current node
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.next;
		}

		System.out.println();
	}

}
