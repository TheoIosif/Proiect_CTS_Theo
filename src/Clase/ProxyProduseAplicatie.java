package Clase;


	
import AccesBD.InterfataAccesBD;
import Aplicatie.InterfataAplicatie;

public class ProxyProduseAplicatie implements InterfataAplicatie{
  InterfataAplicatie accesProduse;
  
  



public ProxyProduseAplicatie(InterfataAplicatie accesProduse) {
	super();
	this.accesProduse = accesProduse;
}

public InterfataAplicatie getNume(){
	return this.accesProduse;
}



public boolean AccessConnection(String password){
	//test parola
	if(password.equals("myDBPassword"))
		return true;
	else return false;
}







@Override
public boolean conecteazaDeviceExtern(String ip) {
	return true;
}



@Override
public String getProdus(String provider, String db, String password) throws Exception {
	if(AccessConnection(password))
		return this.accesProduse.getProdus(provider, db, password);
	else 
		throw new Exception("Parola gresita!");
}
  
	
	
	

}
