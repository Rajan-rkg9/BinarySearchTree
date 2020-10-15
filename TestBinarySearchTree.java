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

	@Test
	public void givenMultipleNumbersWhenAddedToBInaryTreeShouldHaveSizeEqualToNumberOfNumbers() {
		BinarySearchTree<Integer> treeObj=new BinarySearchTree<Integer>();
		Integer[] elements={56,30,70,22,40,60,95,11,65,3,63,67};
		treeObj.addTreeElements(elements);
		int size = treeObj.getSize();
		assertEquals(elements.length, size);
	}
}
