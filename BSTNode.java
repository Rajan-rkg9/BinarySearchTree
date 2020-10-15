package com.DataStructure.BinarySearchTree;

public class BSTNode<K extends Comparable<K>> {
		K key;
		BSTNode<K> left;
		BSTNode<K> right;
		
		public BSTNode(K key) {
			this.key=key;
			this.left=null;
			this.right=null;
		}

}
