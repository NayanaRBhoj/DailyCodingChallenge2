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

	/**
	 * Add Node at K'th index from start/first in LL
	 */
	
	/**
	 * Add Node at K'th index from last in LL
	 */
	
	/**
	 * Find size of LL
	 * */

	/**
	 * Remove first Node of LL
	 */

	/**
	 * Remove last Node of LL
	 */

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
	 * */
	
	/**
	 *  Remove all Nodes with even values in LL
	 * */
	
	
	/** 
	 * Reverse LL
	 * */
	
	/**
	 * Leetcode : 203 (Easy) Remove Linked List Elements
	 * Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.
	 * Example 1 Input: head = [1,2,6,3,4,5,6], val = 6 Output: [1,2,3,4,5]
	 * Exampple 2 Input: head = [], val = 1 Output: []
	 * Exampple 3 Input: head = [7,7,7,7], val = 7 Output: []
	 * */

	/**
	 * Leetcode : 876 (Easy) Middle of the Linked List
	 * Given the head of a singly linked list, return the middle node of the linked list. If there are two middle nodes, return the second middle node.
	 * Example 1 Input: head = [1,2,3,4,5] Output: [3,4,5] Explanation: The middle node of the list is node 3.
	 * Example 2 Input: head = [1,2,3,4,5,6] Output: [4,5,6] Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
	 * */
	
	/**
	 * Leetcode : 206 (Easy) Reverse Linked List
	 * Given the head of a singly linked list, reverse the list, and return the reversed list.
	 * Example 1 Input: head = [1,2,3,4,5] Output: [5,4,3,2,1]
	 * Example 2 Input: head = [1,2] Output: [2,1]
	 * Example 3 Input: head = [] Output: []
	 * */
	
	/**
	 * Leetcode : 2816 (Medium) Double a Number Represented as a Linked List
	 * You are given the head of a non-empty linked list representing a non-negative integer without leading zeroes. Return the head of the linked list after doubling it.
	 * Example 1 Input: head = [1,8,9] Output: [3,7,8] Explanation: The figure above corresponds to the given linked list which represents the number 189. Hence, the returned linked list represents the number 189 * 2 = 378.
	 * Example 2 Input: head = [9,9,9] Output: [1,9,9,8] Explanation: The figure above corresponds to the given linked list which represents the number 999. Hence, the returned linked list reprersents the number 999 * 2 = 1998. 
	 * */
	
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
	}

	public static void main(String[] args) {

		LinkedListExample ll = new LinkedListExample();
		printLL();
		ll.addNodeFirst(2);
		ll.addNodeFirst(1);
		ll.addNodeLast(3);
		ll.addNodeLast(4);
		ll.addNodeLast(5);
		printLL();
	}
}
