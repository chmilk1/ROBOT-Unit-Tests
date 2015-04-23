import static org.junit.Assert.*;

import org.junit.Test;


public class Robot_Test {

	@Test
	public void testRobotMazeMaker() {
		Robot testBot = new Robot();
		assertEquals(3, testBot.getCell(0).getWalls());
		assertEquals(1, testBot.getCell(1).getWalls());
	}

}
