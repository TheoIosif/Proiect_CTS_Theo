
import AccesBD.AccesProduseBD;
import Aplicatie.ProduseDinAplicatie;

public class Test {

	public static void main(String[] args) {
	 //singleton
		Conexiune conexiune= Conexiune.getConexiune("myDatabase");
	  Conexiune conexiune2=Conexiune.getConexiune("myDatabase");
	  
	  if(conexiune==conexiune2)
		  System.out.println("Aceeasi conexiune!");
	  else
		  System.out.println("Conexiuni diferite");
	  
	  //factory
	  try {
		TranzactiePersoanaFizica fizica=(TranzactiePersoanaFizica)
				  SimpleFactoryTranzactie.getTranzactieClient
				  (TipTranzactie.PERSOANA_FIZICA, "Ionescu");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  //builder
	  Utilizator utilizator=new Utilizator
			  ("Gheorghe", "vanzari", 'M', 25,"casier", false);
	  Utilizator utilizator2=new BuilderUtilizator("Iordanescu", "manager")
			  .setVarsta(35).accesBD().build();
      //proxy
	  ProduseDinAplicatie produse=new ProduseDinAplicatie();
	  System.out.println(produse.getProdus("Provider", "MyDB", "myDBPassword"));
	  
	  System.out.println("Test Proxy:");
	  ProxyProduseAplicatie proxy=new ProxyProduseAplicatie(produse);
	  try {
		System.out.println(proxy.getProdus("Provider", "MyDB","myDBPassword"));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  //iosif theo
	  //iosif theooo
	  
	  

	}

}
