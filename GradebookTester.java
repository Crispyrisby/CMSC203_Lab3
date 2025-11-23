import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradebookTester {
	
	private static GradeBook g1;
	private static GradeBook g2;
	
	@Before
	public void setUp() throws Exception {
		g1= new GradeBook(5);
		g1.addScore(50);
		g1.addScore(75);
		
		g2= new GradeBook(5);
		g2.addScore(90);
		g2.addScore(60);
		g2.addScore(30);
	}

	@After
	public void tearDown() throws Exception {
		g1 = null;
		g2 = null;
	}

	@Test
	public void testAddScore() {
		assertTrue(g1.toString().equals("50.0 75.0 "));
		assertEquals(2, g1.getScoreSize());
		
		assertTrue(g2.toString().equals("90.0 60.0 30.0 "));
		assertEquals(3, g2.getScoreSize());
	}

	@Test
	public void testSum() {
		assertEquals(125, g1.sum(), 0.001);
		assertEquals(180, g2.sum(), 0.001);
	}

	@Test
	public void testMinimum() {
		assertEquals(50, g1.minimum(), 0.001);
		assertEquals(30, g2.minimum(), 0.001);
	}

	@Test
	public void testFinalScore() {
		assertEquals(75, g1.finalScore(), 0.001);
		assertEquals(150, g2.finalScore(), 0.001);;
	}
}
