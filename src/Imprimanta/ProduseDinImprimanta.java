package Imprimanta;

import java.util.Random;

public class ProduseDinImprimanta implements InterfataProduseImprimanta{

	@Override
	public String[] getDateFactura(String ipDevice) {
		System.out.println("S-a stabilit o conexiune"
				+" cu device-ul cu ip-ul : "+ipDevice);
		Random factura=new Random();
		
		return new String[]{
				"Factura cu id-ul: "+ factura.nextInt(100)
				
	};

	}
}



