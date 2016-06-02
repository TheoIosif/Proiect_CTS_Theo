import Aplicatie.InterfataAplicatie;
import Clase.ProxyProduseAplicatie;
import junit.framework.TestCase;

public class TestProxy extends TestCase {

	ProxyProduseAplicatie proxy;
	InterfataAplicatie access_Aplicatie;
	protected void setUp() throws Exception {
		super.setUp();
		proxy=new ProxyProduseAplicatie(access_Aplicatie);
	}
	
	public void testValidareConstructor(){
		assertEquals("eroare constructor",access_Aplicatie,proxy.getNume());
		
	}

	public void testValidareProxy(){
		boolean test_proxy=proxy.AccessConnection("myDBPassword");
		assertEquals("proxy gresit!",true,test_proxy);
	}
	
    public void testParolaInvalida(){
    	
    	
    	boolean test_proxy_gresit=proxy.AccessConnection("myDBPassword");
    	assertEquals(true,test_proxy_gresit);
    	fail();
    
    }
}
