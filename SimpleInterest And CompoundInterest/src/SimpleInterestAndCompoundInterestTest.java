import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleInterestAndCompoundInterestTest {

	@Test
	void simpleInterestTest() {
		SimpleInterestAndCompoundInterest si=new SimpleInterestAndCompoundInterest();
		assertEquals(2000,si.simpleInterest(1000, 1, 2));
	}
	@Test
	void compoundInterestTest() {
		SimpleInterestAndCompoundInterest ci=new SimpleInterestAndCompoundInterest();
		assertEquals(5970.261482645001,ci.compoundInterest(5000, 6, 3));
	}
	

}
