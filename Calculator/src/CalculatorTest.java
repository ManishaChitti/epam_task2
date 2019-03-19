import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	public void additionTest() {
		Calculator c=new Calculator();
		assertEquals(300,c.addition(100, 200));
	}
	@Test
	public void multiplicationTest() {
		Calculator c=new Calculator();
		assertEquals(50,c.multiplication(10, 5));
	}
	@Test
	public void divisionTest() {
		Calculator c=new Calculator();
		assertEquals(3,c.division(30, 10));
	}
	
	
	

}
