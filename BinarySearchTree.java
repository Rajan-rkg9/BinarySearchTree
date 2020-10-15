package com.DataStructure.BinarySearchTree;

public class BinarySearchTree<K extends Comparable<K>> {
	 BSTNode<K> root;
	 
	public BinarySearchTree() {
		this.root=null;
	}
	
	public void add(K key) {
		this.root = this.addRecursively(this.root , key);
	}
	
	public void addTreeElements(K elements[]) {
		for(K key: elements) {
			this.add(key);
		}
	}
	
	public BSTNode<K> addRecursively(BSTNode<K> current , K key) {
		if(current == null) 
			return new BSTNode<K>(key);
		int result = key.compareTo(current.key);
		if(result == 0)
			return current;
		else if(result < 0) 
			current.left = addRecursively(current.left, key);
		else 
			current.right = addRecursively(current.right, key);
		return current;
	}
	
	public boolean search(K key) {
		return this.searchRecursively(this.root,key);
	}
	
	public boolean searchRecursively(BSTNode<K> current, K key) {
		if(current == null) 
			return false;
		else if(current.key == key) 
			return true;
		else if(key.compareTo(current.key) < 0) 
			return searchRecursively(current.left, key);
		else
			return searchRecursively(current.right, key);
	}
	
	public int getSize() {
		return this.getSizeRecursively(this.root);
	}
	
	public int getSizeRecursively(BSTNode<K> current) {
		return (current==null) ? 0 : this.getSizeRecursively(current.left) + 1 + getSizeRecursively(current.right);
	}
	
	public static void main(String[] args) {
		BinarySearchTree<Integer> treeObj=new BinarySearchTree<Integer>();
		Integer elements[] = {56,30,70,22,40,60,95,11,65,3,63,67};
		treeObj.addTreeElements(elements);
		System.out.println("Binary tree of size "+ treeObj.getSize()+" created.");
		Integer searchElement = 63;
		System.out.println("63 "+ (treeObj.search(searchElement) ? "is in the tree" : "is not in the tree"));
	}
}

