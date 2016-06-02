import Aplicatie.InterfataAplicatie;
import Imprimanta.InterfataProduseImprimanta;

public class AdaptorAplicatie2Imprimanta implements InterfataProduseImprimanta{
   InterfataAplicatie produse;
   String provider;
   String db;
   String pass;
   
   
   
	public AdaptorAplicatie2Imprimanta(InterfataAplicatie produse,String provider,String db,
			String pass) {
	this.produse = produse;
	this.provider=provider;
	this.db=db;
	this.pass=pass;
}



	@Override
	public String[] getDateFactura(String ipDevice) throws Exception {
		if(this.produse.conecteazaDeviceExtern(ipDevice))
			return new String[]{
					this.produse.getProdus(provider,db,pass)
			};
		
		return null;
	}

}
