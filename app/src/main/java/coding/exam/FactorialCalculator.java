package coding.exam;

import java.util.Stack;

public final class FactorialCalculator {
	public static Double calculateFactorial(final int number) {
		Stack<Double> stack = new Stack<>();

		stack.push( 1d );

		for(double i = 2 ; i <= number ; i++) {
			stack.push( i * stack.peek() );
		}

		return stack.peek();
	}
}
