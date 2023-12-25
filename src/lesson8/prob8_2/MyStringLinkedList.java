package lesson8.prob8_2;

import java.util.ArrayList;
import java.util.List;

public class MyStringLinkedList {
	Node header;
	public static int size;
	MyStringLinkedList(){
		header = new Node(null);
	}
	//adds to the front of the list
	public void addFirst(String item){
		Node n = new Node(item);
		//place new node after header and 
		//establish links from new node to 
		//surrounding nodes
		n.next = header.next;
		n.previous = header;
		
		//establish links from surrounding 
		//nodes to the new node
		if(header.next != null){
			header.next.previous = n;
		}		
		header.next = n;	
		size++;
	}
	
	//adds to the end of the list
	public void addLast(String item) {
		Node n = new Node(item);
		//find last node
		Node last = header;
		while(last.next != null) {
			last = last.next;
		}
		//now last.next == null
        last.next = n;
        n.previous = last;
        size++;
	}
	
	//removes node in last position
	public void removeLast( ) {
		//if list is empty, return
		if(header.next == null) return;
		
		Node current = header;
		//traverse the list until current.next is 
		//null - then remove current
		while(current.next != null) {
			current = current.next;
		}
		//now current.next == null, so remove current
		Node previous = current.previous; 
		//previous is not null since current is not header
		previous.next = null;
		current.previous = null;
		size--;
	}
	
	//determines whether the input string is in the list
	public boolean search(String s) {
		Node next = header.next;
		while(next != null && !next.value.equals(s)) {
			next = next.next;
		}
		//either next == null or next.value is s
		if(next == null) return false;
		else {//next.value.equals(s) 
			return true;
		}
	}
	public String toString() { 
		var sb = new StringBuffer();
		Node next = header.next;
		while(next != null) {
			sb.append(next.toString() + ", ");
			next = next.next;
		}
		var result = sb.toString().trim();
		if(result.length() == 0) return "<empty list>";
		if(result.charAt(result.length()-1) == ',') {
			return result.substring(0,result.length()-1);
		}
		return result;			
	}
	class Node {
		String value;
		Node next;
		Node previous;
		Node(String value){
			this.value = value;
		}
		
		public String toString() {
			return value == null ? "null" : value;
		}
	}
	public void insert(String s, int pos) {
		Node newNode = new Node(s);
		Node temp = header.next;
		
		for(int i = 0; i < pos - 1; i++) {
			temp = temp.next;
		}
		
		newNode.next = temp.next;
		newNode.previous = temp;
		temp.next.previous = newNode;
		temp.next = newNode;
		size++;
	}
	public void sort() {
		Node temp = header.next;
		while(temp != null) {
			Node smallestNode = minpos(temp);		
			swap(temp, smallestNode);
			temp = temp.next;
		}
		
	}
	public Node minpos(Node botNode) {
		Node smallNode = botNode;
		Node temp = botNode.next;
		while(temp != null) {
			if(smallNode.value.compareTo(temp.value) > 0) {
				smallNode = temp;
				temp = temp.next;
			}
			else {
				temp = temp.next;
			}
		}
		
		return smallNode;
	}
	public void swap(Node node, Node smallestNode) {
		String temp = smallestNode.value;
		smallestNode.value = node.value;
		node.value = temp;
	}
	public static void main(String[] args){
		var list = new MyStringLinkedList();
		list.addLast("Rich");
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		list.addFirst("Bob");
		list.addFirst("Harry");
		list.addFirst("Steve");
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		System.out.println(list.search("Harry"));
		System.out.println(list.search("Bob"));
		list.addLast("Tom");
		System.out.println(list);
		list.insert("Test", 1);
		System.out.println("Before sorting: ");
		System.out.println(list);
		list.sort();
		System.out.println("After sorting: ");
		System.out.println(list);
	}
}
