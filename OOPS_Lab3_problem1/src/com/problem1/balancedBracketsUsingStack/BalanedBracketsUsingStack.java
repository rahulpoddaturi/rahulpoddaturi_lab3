package com.problem1.balancedBracketsUsingStack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalanedBracketsUsingStack {
	
	Deque<Character> m_stack;
	public BalanedBracketsUsingStack()
	{
		m_stack= new ArrayDeque<Character>();
	}
	public boolean areBracketsBalanced(String expr)
	{
		for (int i = 0; i < expr.length(); i++)
        {
            char x = expr.charAt(i);
 
            if (x == '(' || x == '[' || x == '{')
            {
                m_stack.push(x);
                continue;
            }
            // all the opening brackets are added 
            // now we are processing the closing
            // the stack should not be empty at this point 
            if (m_stack.isEmpty())
            	return false;
            char top ;
            switch (x)
            {
            	case ')': 
            		top = m_stack.pop();
            		if(top == '}' || top == ']')
            			return false;
            		break;
            	case '}': 
            		top = m_stack.pop();
            		if(top == ')' || top == ']')
            			return false;
            	     break;
            	case ']': 
            		top = m_stack.pop();
            		if(top == '}' || top == ')')
            			return false;
            		 break;	
            }
        }
		//the processing of the whole expression is done
		//stack should be empty at this point
		return (m_stack.isEmpty());
		
	}
	public void clearBlancedStack()
	{
		m_stack.clear();
	}
}
