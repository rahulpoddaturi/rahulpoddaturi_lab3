package com.problem1.driver;

import com.problem1.balancedBracketsUsingStack.BalanedBracketsUsingStack;

public class BalancedBrackets {
	static boolean IsBalancedBrackets(String str2)
	{
		return true;
		
	}
	public static void main(String[] args) {
		
		String str1 = "([[{}]])";
		BalanedBracketsUsingStack stack = new BalanedBracketsUsingStack();
		if(stack.areBracketsBalanced(str1))
			System.out.println("The entered String has Balanced Brackets");
		else 
			System.out.println("The entered String does not contain Balanced Brackets");
		stack.clearBlancedStack();
		
		String str2 = "([[{}]]))";	
		if(stack.areBracketsBalanced(str2))
			System.out.println("The entered String has Balanced Brackets");
		else 
			System.out.println("The entered String does not contain Balanced Brackets");
	}

}
