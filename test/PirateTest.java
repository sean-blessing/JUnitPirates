import static org.junit.Assert.*;

import org.junit.Test;

public class PirateTest {

	@Test
	public void pirateCreateTest() {
		Pirate p1 = new Pirate("Patchy");
		assertEquals("Patchy", p1.getName());
		assertEquals(4,p1.getLimbsRemaining());
	}
	
	@Test
	public void octoPirateTest() {
		Pirate octoPirate = new Pirate("OctoPete",8);
		
		assertEquals(8, octoPirate.getLimbsRemaining());
	}
	
	@Test
	public void isDeadTest() {
		Pirate p2 = new Pirate("Blackbeard");
		assertFalse(p2.isDead());
	}
	
	@Test(timeout=1000)
	public void infiniteLoopTest() {
		while (true) {
			
		}
	}

	
	
	
	
}
