package produkOOP;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestBelanja {
	Belanja blj = new Belanja();
	@Test
	public void tambahStokProdTest()
	{
		assertEquals(blj.tambahStok(9), (9+12));
	}
}
