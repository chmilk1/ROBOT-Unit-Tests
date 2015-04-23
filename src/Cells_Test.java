import static org.junit.Assert.*;

import org.junit.Test;


public class Cells_Test {

	@Test
	public void testCellConstruction() {
		Cell ts = new Cell(1, 0, 1, 1, true, 1);
		assertEquals(true, ts.isNorth());
		assertEquals(false, ts.isEast());
		assertEquals(true, ts.isSouth());
		assertEquals(true, ts.isWest());
		assertEquals(true, ts.isStartCell());
	}
	@Test
	public void testCountWalls() throws Exception {
		Cell ts = new Cell(1, 0, 1, 1, true, 1);
		assertEquals(3, ts.getWalls());
	}

}
