import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	GradeBook one;
	GradeBook two;
	@BeforeEach
	void setUp() throws Exception {
		one = new GradeBook(5);
		two = new GradeBook(5);
		one.addScore(12.6);
		one.addScore(16.8);
		two.addScore(13.9);
		two.addScore(12.7);
	}

	@AfterEach
	void tearDown() throws Exception {
		one = null;
		two = null;
	}

	@Test
	void testAddScore() {
		assertTrue(one.toString().equals("12.6 16.8 "));
		assertTrue(two.toString().equals("13.9 12.7 "));
		assertEquals(one.getScoreSize(), 2);
		assertEquals(two.getScoreSize(), 2);
	}

	@Test
	void testSum() {
		assertTrue(one.sum() == 29.4);
		assertTrue(two.sum() == 26.6);
	}

	@Test
	void testMinimum() {
		assertTrue(one.minimum() == 12.6);
		assertTrue(two.minimum() == 12.7);
	}

	@Test
	void testFinalScore() {
		assertEquals(one.finalScore(), 16.8, .0001);
		assertEquals(two.finalScore(), 13.9, .0001);
	}

}
