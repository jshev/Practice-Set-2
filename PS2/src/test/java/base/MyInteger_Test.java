package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testisOdd() {
		MyInteger oddInt = new MyInteger(7);
		assertTrue(oddInt.isOdd());
		assertFalse(oddInt.isEven());
		assertTrue(oddInt.isPrime());
	}
	
	@Test
	public void testisEven() {
		MyInteger evenInt = new MyInteger(4);
		assertFalse(evenInt.isOdd());
		assertTrue(evenInt.isEven());
		assertFalse(evenInt.isPrime());
	}
	
	@Test
	public void testisPrime() {
		MyInteger primeInt = new MyInteger(11);
		assertTrue(primeInt.isOdd());
		assertFalse(primeInt.isEven());
		assertTrue(primeInt.isPrime());
	}
	
	@Test
	public void testEquals() {
		MyInteger firstNumber = new MyInteger(7);
		MyInteger secondNumber = new MyInteger(4);
		assertFalse(equals(firstNumber==secondNumber));
	}

}
