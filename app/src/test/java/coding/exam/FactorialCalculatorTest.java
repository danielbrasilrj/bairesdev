package coding.exam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FactorialCalculatorTest {

	@Test
	void getFactorialFromZero()  {
		Double factorial = FactorialCalculator.calculateFactorial(0);

		assertEquals( 1d, factorial);
	}

	@Test
	void calculate()  {
		Double factorial = FactorialCalculator.calculateFactorial(15);

		assertEquals(Double.valueOf(1307674368000d), factorial);
	}
}
