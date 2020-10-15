package com.DataStructure.BinarySearchTree;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestBinarySearchTree {

	@Test
	public void givenThreeNumbers_WhenAddedToBInarySearchTree_ShouldHaveSizeThree() {
		BinarySearchTree<Integer> treeObj=new BinarySearchTree<Integer>();
		Integer a=56, b=30, c=70;
		treeObj.add(a);
		treeObj.add(b);
		treeObj.add(c);
		int size=treeObj.getSize();
		assertEquals(3, size);
	}

}
