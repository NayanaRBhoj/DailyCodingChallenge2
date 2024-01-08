package com.data.structures.practice.linkedList;

public class LinkedListExample {

	public static class LinkedListNode {
		int val;
		LinkedListNode next = null;

		public LinkedListNode(int val) {
			this.val = val;
		}

		public LinkedListNode() {

		}
	}

	public static LinkedListNode head = null;
	public static LinkedListNode tail = null;

	/**
	 * Add Node to first of LL
	 */
	public static void addNodeFirst(int val) {
		// Step1: Create new node.
		LinkedListNode newNode = new LinkedListNode(val);

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
	public static void addNodeLast(int val) {
		// Step1: Create new node.
		LinkedListNode newNode = new LinkedListNode(val);

		if (head == null) {
			head = tail = newNode;
			return;
		}
		LinkedListNode current = head;
		while (current != null) {
			current = current.next;
		}
		// Step2: newNode.next = head
		current.next = newNode;
		tail = newNode;
		
		// Step3: head = newNode
		//head = newNode;
	}
	
	/**
	 * Add Node in middle of LL
	 */

	/**
	 * Add at K'th index in LL
	 */

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
	 * Print LL with given head of LL.
	 */
	public static void printLL(LinkedListNode head) {
		if (head == null) {
			System.out.println("LinkedList is null");
			return;
		}
		LinkedListNode current = head;
		while (current != null) {
			System.out.print(current.val + "->");
			current = current.next;
		}
		System.out.print("NULL");
	}

	public static void main(String[] args) {

		LinkedListExample ll = new LinkedListExample();
		ll.addNodeFirst(1);
		ll.addNodeFirst(2);
		printLL(head);
	}
}
