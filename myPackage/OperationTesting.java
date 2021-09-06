package myPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
class OperationTesting {

	@Test
	void testAdd() {
		Operation o=new Operation();
		assertEquals(68,o.add(45,23));
	}

}
