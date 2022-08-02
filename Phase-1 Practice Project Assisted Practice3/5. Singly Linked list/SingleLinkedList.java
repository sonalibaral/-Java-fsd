package LinkedList;

import java.util.NoSuchElementException;
 
/**
 * How to remove first node from a Singly Linked List in Java ?
 * @author KK JavaTutorials
 */
public class SingleLinkedList<T> {
	
	private Node<T> head;
	
	//This internal class represents Node in Linked List
	private static class Node<T>{
		
		private T data;
		private Node<T> next;
		public Node(T data) {
			super();
			this.data = data;
			this.next = null;
		}
	}
	
	/**
	 * This method insert a Node in Linked List
	 * @param data has to insert in the List
	 */
	public void insert(T data) {
		Node<T> newNode = new Node<T>(data);
		if(head == null) {
			head = newNode;
		}else {
			Node<T> currentNode = head;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			 currentNode.next = newNode;
		}
	}
	
	/**
	 * Removes and returns the first element from this list.
	 * @return the first element from this list
	 * @throws NoSuchElementException if this list is empty
	 */
	public T removeFirst() {
		if(head == null) {
			throw new NoSuchElementException("List is Empty!!");
		}
		
		Node<T> tempNode = head;
		T result = tempNode.data;
		head = head.next;
		tempNode.next = null;
		return result;
	}
	
	/**
	 * Method which traverse Linked List and display all data.
	 */
	public void displayLinkedList() {
		Node<T> currentNode = head;
		while(currentNode!= null) {
			System.out.print(currentNode.data+" ");
			currentNode = currentNode.next;
		}
	}
	
	public static void main(String[] args) {
		
		SingleLinkedList<Integer> linkedList = new SingleLinkedList<>();
		linkedList.insert(10);
		linkedList.insert(20);
		linkedList.insert(30);
		linkedList.insert(40);
		linkedList.insert(50);
		linkedList.insert(60);
		
		System.out.println("Original LinkedList:");
		linkedList.displayLinkedList();
		System.out.println();
		Integer removeFirst = linkedList.removeFirst();
		System.out.println("After removing first Elememnt:"+removeFirst);
		linkedList.displayLinkedList();
		
	}
}