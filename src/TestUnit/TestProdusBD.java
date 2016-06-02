package TestUnit;
import Composite.ProdusBD;
import junit.framework.TestCase;

public class TestProdusBD extends TestCase {

	ProdusBD canapea;
	protected void setUp() throws Exception {
		super.setUp();
		canapea=new ProdusBD("canapea Bella",291,2200.0);
	}
	
	public void testValidarePret(){
		assertEquals(2200.0,canapea.getPret());
	}
	
	public void testPretIncorect(){
		assertEquals(2200,canapea.getPret());
		//pretul trebuie sa fie double
		//trebuie sa asteptam 2200.0
		//de aceea nu trece testul
	}

}
