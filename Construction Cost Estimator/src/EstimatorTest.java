import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EstimatorTest {

	@Test
	void test() {
		Estimator e=new Estimator();
		assertEquals(240000,e.estimateCost(1, 200, false));
		assertEquals(375000,e.estimateCost(2, 250, false));
		assertEquals(540000,e.estimateCost(3, 300, false));
		assertEquals(750000,e.estimateCost(3, 300, true));
	}

}
