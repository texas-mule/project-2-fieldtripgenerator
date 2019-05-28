package vehicle.transportation;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class VehiclesTest {
	
	Vehicles v;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		v = new Vehicles(12, null, null, 0, null, 0, 0, 0, 0);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetId() {
		fail("Not yet implemented.");
		assertEquals(12, v.getId());
	}

}
