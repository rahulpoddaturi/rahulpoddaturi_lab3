package com.lab3.model;

import java.util.ArrayList;

public class BinarySearchTree {
	
		static class Node
		{
			int data;
			Node left,right;
			
			Node(int d)
			{
				data = d;
				left = right = null;
			}
		}
		Node m_root; 
		public BinarySearchTree()
		{
			m_root = null;
		}
		public void insert(int key)
		{
			m_root = insertRec(m_root,key);
		}
		
		Node insertRec(Node root,int data)
		{
			if(root == null)
			{
				root = new Node(data);
				return root;
			}
			if(data<root.data)
				root.left = insertRec(root.left, data);
			else if (data>root.data)
				root.right = insertRec(root.right,data);
			return root;
		}
		//convert tree to list for the finding the pair
		ArrayList<Integer> treeToList(Node node, ArrayList<Integer>
        list)
		{
			// Base Case
			if (node == null)
			return list;
			
			treeToList(node.left, list);
			//System.out.print(node.data + " ");
			list.add(node.data);
			treeToList(node.right, list);
			
			return list;
		}
		public boolean isPairPresent(int target)
		{
			ArrayList<Integer> a1 = new ArrayList<>();
			ArrayList<Integer> a2 = treeToList(m_root,a1);

			//finding the pair
			int start = 0; // Starting index of a2
	        int end = a2.size() - 1; // Ending index of a2
	        while (start < end) 
	        {
	            if (a2.get(start) + a2.get(end) == target) // Target Found!
	            {
	                System.out.println("Pair is (" + a2.get(start) + "," + a2.get(end) + ")");
	                return true;
	            }
	 
	            if (a2.get(start) + a2.get(end) > target) // decrements end
	            {
	                end--;
	            }
	 
	            if (a2.get(start) + a2.get(end) < target) // increments start
	            {
	                start++;
	            }
	        }
	        System.out.println("Nodes are not found");
	        return false;
			
		}
			
}

