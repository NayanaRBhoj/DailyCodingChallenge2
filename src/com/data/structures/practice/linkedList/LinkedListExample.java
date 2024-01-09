package com.data.structures.practice.linkedList;

public class LinkedListExample {

	public static class Node {
		int val;
		Node next = null;

		public Node(int val) {
			this.val = val;
		}

		public Node() {

		}
	}

	public static Node head = null;
	public static Node tail = null;

	/**
	 * Add Node to first of LL
	 */
	public void addNodeFirst(int val) {
		// Step1: Create new node.
		Node newNode = new Node(val);

		if (head == null) {
			head = tail = newNode;
			return;
		}

		// Step2: newNode.next = head
		newNode.next = head;

		// Step3: head = newNode
		head = newNode;
	}

	/**
	 * Add Node to last of LL
	 */
	public void addNodeLast(int val) {
		// Step1: Create new node.
		Node newNode = new Node(val);

		if (head == null) {
			head = tail = newNode;
			return;
		}
		// Step2: tail.next = newNode
		tail.next = newNode;

		// Step3: tail = newNode
		tail = newNode;
	}

	/**
	 * Add Node in middle of LL
	 */
	public void addNodeMid(int val) {
		// 2 approach
		// Find size of LL, then from size find mid point by dividing it to 2. Then
		// traverse through LL and addNodeKthIndex method.
		// create 2 pointers p1 will move 1 step at time and p2 pointer will move 2
		// steps at a time. when p2 reaches end p1 is in the middle so we found middle
		// of LL
	}

	/**
	 * Add Node at K'th index from start/first in LL
	 */
	public void addNodeKthIndex(int idx, int val) {
		// Step1: Create new node.
		Node newNode = new Node(val);

		Node temp = head;
		int temp_idx = 0;
		if (head == null) {
			head = tail = newNode;
		}
		while (temp_idx < idx - 1) {
			temp = temp.next;
			temp_idx++;
		}

		newNode.next = temp.next;
		temp.next = newNode;
	}

	/**
	 * Add Node at K'th index from last in LL
	 */

	/**
	 * Find size of LL
	 */
	public static int sizeLL() {
		int size = 0;
		if (head == null) {
			return size;
		}

		Node current = head;
		while (current != null) {
			current = current.next;
			size++;
		}
		return size;
	}

	/**
	 * Remove first Node of LL
	 */
	public void removeNodeFirst() {

		if (head == null) {
			return;
		} else if(head.next == null) {
			head = tail = null;
		}
		head = head.next;
	}

	/**
	 * Remove last Node of LL
	 */
	public void removeNodeLast() {
		int size = sizeLL();
		if(size == 0) {
			System.out.println("LL is empty");
		} else if(size == 1) {
			head = tail = null;
		}
		
		Node prev = head;
		for(int i=0; i<size-2; i++) {
			prev = prev.next;
		}
		prev.next = null;
		tail = prev;
	}	

	/**
	 * Remove middle node of LL
	 */

	/**
	 * Remove Node at K'th index from start/first in LL
	 */

	/**
	 * Remove Node at K'th index from last in LL
	 */

	/**
	 * Check if there is Node with value K in LL
	 */
	public boolean checkIfPresent(int value) {
		boolean result = false;
		if (head == null) {
			return result;
		}
		Node current = head;
		while (current != null) {
			if (current.val == value) {
				return true;
			}
			current = current.next;
		}
		return result;
	}

	/**
	 * Remove all Nodes with even values in LL
	 */

	/**
	 * Reverse LL
	 */

	/**
	 * Leetcode : 203 (Easy) Remove Linked List Elements Given the head of a linked
	 * list and an integer val, remove all the nodes of the linked list that has
	 * Node.val == val, and return the new head. Example 1 Input: head =
	 * [1,2,6,3,4,5,6], val = 6 Output: [1,2,3,4,5] Exampple 2 Input: head = [], val
	 * = 1 Output: [] Exampple 3 Input: head = [7,7,7,7], val = 7 Output: []
	 */

	/**
	 * Leetcode : 876 (Easy) Middle of the Linked List Given the head of a singly
	 * linked list, return the middle node of the linked list. If there are two
	 * middle nodes, return the second middle node. Example 1 Input: head =
	 * [1,2,3,4,5] Output: [3,4,5] Explanation: The middle node of the list is node
	 * 3. Example 2 Input: head = [1,2,3,4,5,6] Output: [4,5,6] Explanation: Since
	 * the list has two middle nodes with values 3 and 4, we return the second one.
	 */

	/**
	 * Leetcode : 206 (Easy) Reverse Linked List Given the head of a singly linked
	 * list, reverse the list, and return the reversed list. Example 1 Input: head =
	 * [1,2,3,4,5] Output: [5,4,3,2,1] Example 2 Input: head = [1,2] Output: [2,1]
	 * Example 3 Input: head = [] Output: []
	 */

	/**
	 * Leetcode : 2816 (Medium) Double a Number Represented as a Linked List You are
	 * given the head of a non-empty linked list representing a non-negative integer
	 * without leading zeroes. Return the head of the linked list after doubling it.
	 * Example 1 Input: head = [1,8,9] Output: [3,7,8] Explanation: The figure above
	 * corresponds to the given linked list which represents the number 189. Hence,
	 * the returned linked list represents the number 189 * 2 = 378. Example 2
	 * Input: head = [9,9,9] Output: [1,9,9,8] Explanation: The figure above
	 * corresponds to the given linked list which represents the number 999. Hence,
	 * the returned linked list reprersents the number 999 * 2 = 1998.
	 */

	/**
	 * Print LL with given head of LL.
	 */
	public static void printLL() {

		if (head == null) {
			System.out.println("LinkedList is empty");
			return;
		}
		Node current = head;
		while (current != null) {
			System.out.print(current.val + "->");
			current = current.next;
		}
		System.out.print("NULL");
		System.out.println();
	}

	public static void main(String[] args) {

		LinkedListExample ll = new LinkedListExample();
		printLL();
		
		ll.addNodeFirst(2);
		ll.addNodeFirst(1);
		ll.addNodeLast(3);
		ll.addNodeLast(4);
		ll.addNodeLast(5);
		ll.addNodeLast(6);
		printLL();
		System.out.println("Size " + sizeLL());
		
		ll.addNodeKthIndex(2, 9);
		printLL();
		System.out.println("Size " + sizeLL());
		System.out.println("Check if value present : " + ll.checkIfPresent(10));
		
		ll.removeNodeFirst();
		printLL();
		
		ll.removeNodeLast();
		printLL();

	}
}
