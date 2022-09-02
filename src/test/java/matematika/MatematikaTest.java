package matematika;

import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MatematikaTest {
	Matematika mtk;
	double doublePertama;
	double doubleKedua;
	Random random;
	@BeforeTest
	public void befTest() {
		mtk = new Matematika();
		random = new Random();
	}
  @Test
  public void modulusTest() {
    doublePertama = 80.0;
    doubleKedua = 20.3;
    assertEquals(mtk.modulus(doublePertama, doubleKedua), (80.0 % 20.3));
  }

  @Test
  public void pembagianTest() {
    doublePertama = 29.0;
    doubleKedua = 30.0;
    assertEquals(mtk.pembagian(doublePertama, doubleKedua), (29.0/30.0)); 
  }

  @Test
  public void penguranganTest() {
	  doublePertama =10.0;
	  doubleKedua = 20.0;
	  assertEquals(mtk.pengurangan(doublePertama, doubleKedua), (doublePertama-doubleKedua));
  }

  @Test
  public void penjumlahanTest() {
    doublePertama = 9.0; 
    doubleKedua = 10.0;
    dataGenerator();
    assertEquals(mtk.penjumlahan(doublePertama, doubleKedua), (doublePertama+doubleKedua));
  }
  
  /* 
   * buat method dataGenerator untuk menggenerate data dummy 
   */
  public void dataGenerator() {
	  System.out.println("ini datagenerator");
  }
}
