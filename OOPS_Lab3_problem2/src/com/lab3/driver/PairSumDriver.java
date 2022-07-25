package com.lab3.driver;

import com.lab3.model.BinarySearchTree;

public class PairSumDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(40);
		tree.insert(20);
		tree.insert(60);
		tree.insert(10);
		tree.insert(30);
		tree.insert(50);
		tree.insert(70);
		//60+70
		tree.isPairPresent(130);
		//not present
		tree.isPairPresent(140);
	}

}
