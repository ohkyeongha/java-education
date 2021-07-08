package stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueue {

	public static void main(String[] args) {
		//Stack - LIFO
		Stack<String> stack = new Stack<String>();
		
		stack.push("값1");
		stack.push("값2");
		stack.push("값3");
		
		for(int i = 0 ; i <=2 ; i++) {
			System.out.println(stack.pop());
			
		}
		
		//Queue - FIFO
		Queue<String> q = new LinkedList<String>();
		q.offer("큐값1");
		q.offer("큐값2");
		q.offer("큐값3");
		
		while(!q.isEmpty()) { //값이 없으면 true, 있으면 false
			System.out.println(q.poll());
		}
		
	}

}
