import java.security.InvalidParameterException;

import junit.framework.TestCase;

public class UnitTest extends TestCase {

	Utilizator utilizator_test;
	TranzactiePersoanaFizica tranzactie_persoanaFizica;
	
	protected void setUp() throws Exception {
		super.setUp();
		utilizator_test=new Utilizator("Ionescu", "vanzari",
				'M', 25, "casier", true);
		
		tranzactie_persoanaFizica=new TranzactiePersoanaFizica("Stefanescu");		
	}
	

	public void testVarstaValida(){
		utilizator_test.setVarsta(30);
		
		int varsta=utilizator_test.getVarsta();
		assertEquals(30, varsta);
	}
	
	public void testVarstaInvalida(){
		try{
		utilizator_test.setVarsta(-5);
		fail();
		
		}
		catch(InvalidParameterException e){
			
		}
		
	}
	
	public void testReducereInvalida(){
		try{
			tranzactie_persoanaFizica.reducereClient(-3);
			fail();
		}
		catch(Exception e){
			
		}
	}
}
