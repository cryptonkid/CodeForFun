package com.vivek.javatutorial.Collections;

public class MyList {
	
}
class LinkedList<T extends Comparable<T>>{
	private Node<T> head = null;
	private static int size = 0;
	
	public LinkedList(){
	}
	public void add(T data){
		if(head == null){
			head = new Node<T>(data);
			size++;
		}
		else{
			Node<T> curr = head;
			while(head.getNext()!= null){
				curr = curr.getNext();
			}
			curr.setNext(new Node<T>(data)); 
			size++;
		}
	}
	public T remove(){
		if(head != null){
			T data = head.getData();
			head = head.getNext();
			size--;
			return data;
		}
		size = 0;
		return null;
	}
	public int size(){
		return size;
	}
}
class Node<T extends Comparable<T>>{
	private T data;
	private Node<T> next;
	
	public Node(T data){
		this.data = data;
		setNext(null);
	}
	public void setNext(Node<T> next){
		this.next = next;
	}
	public T getData(){
		return data;
	}
	public Node<T> getNext(){
		return next;
	}
	@Override
	public String toString() {
		return String.valueOf(this.data);
	}
}