package com.exercise.jaalamc;

import java.util.Stack;

public final class Factorial {

	private int getFactorial(int n) {
		int result = 0;
		var stack = createStack( n );

		while( !stack.isEmpty() ) {
			if(result == 0) {
				result = stack.pop();
			} else {
				result = result * stack.pop();
			}
		}

		return result;
	}

	private Stack<Integer> createStack( final int n ) {
		Stack<Integer> stack = new Stack();

		for( int i = 1; i <= n; i++) {
			stack.push( i );
		}

		return stack;
	}

	public static void main(String[] args) {
		Factorial factorial = new Factorial();
		System.out.println(factorial.getFactorial( 3 ));
	}
}
