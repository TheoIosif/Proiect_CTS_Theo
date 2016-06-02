package TestUnit;
import Clase.TranzactiePersoanaFizica;
import junit.framework.TestCase;

public class UnitTestConstructor extends TestCase {

	
	TranzactiePersoanaFizica persoanaFizica;
	protected void setUp() throws Exception {
		super.setUp();
		persoanaFizica=new TranzactiePersoanaFizica("Constantin");
	}
	
	public void testConstructorValid(){
		assertEquals("nume gresit","Constantin",persoanaFizica.getNume());
	}

}
