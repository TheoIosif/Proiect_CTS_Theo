package Main;

import AccesBD.AccesProduseBD;
import Aplicatie.InterfataAplicatie;
import Aplicatie.ProduseDinAplicatie;
import Clase.AdaptorAplicatie2Imprimanta;
import Clase.BuilderUtilizator;
import Clase.Conexiune;
import Clase.ProxyProduseAplicatie;
import Clase.SimpleFactoryTranzactie;
import Clase.TipTranzactie;
import Clase.TranzactiePersoanaFizica;
import Clase.Utilizator;
import Composite.CategorieProduse;
import Composite.ProdusBD;
import State.Tranzactie;
import State.TranzactieInDesfasurare;
import State.TranzactieIncheiata;
import decorator.BucatariaADELA;
import decorator.BucatariaALMA;
import decorator.BucatarieSimpla;

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
	  
	  //decorator
	  BucatarieSimpla bucatarie=new BucatarieSimpla(25,"Simpla",1250);
	  BucatariaALMA bucatariaAlma=new BucatariaALMA(bucatarie);
	  BucatariaADELA bucatariaAdela=new BucatariaADELA(bucatarie);
	  
	  System.out.println(bucatarie.getPiese());
	  System.out.println(bucatariaAlma.getPiese());
	  System.out.println(bucatariaAdela.getPiese());
	  
	  //test adaptor
	  
	  InterfataAplicatie aplicatie=new ProduseDinAplicatie();
	  
	  AdaptorAplicatie2Imprimanta adaptor=new AdaptorAplicatie2Imprimanta(aplicatie);
	  try {
		System.out.println(adaptor.getDateFactura("10.0.0.2")[0]);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  //test composite
	  ProdusBD setScaune=new ProdusBD("Set scaune Sahara",5,799);
	  ProdusBD masa=new ProdusBD("Masa ISSA",6,529);
	  
	  ProdusBD setScauneExterior=new 
			  ProdusBD("Set scaune Africa",7,729);
	  ProdusBD masaExterior=new ProdusBD("Masa ASIA",9,660);
	  
	  CategorieProduse produseInterior=
			  new CategorieProduse("Produse Interior");
	  CategorieProduse produseExterior=
			  new CategorieProduse("Produse Exterior");
	  
	  produseInterior.adaugaElement(setScaune);
	  produseInterior.adaugaElement(masa);
	  
	  produseExterior.adaugaElement(setScauneExterior);
	  produseExterior.adaugaElement(masaExterior);
	  
	  CategorieProduse produseMagazin=
			  new CategorieProduse("Produse Magazin");
	  
	  produseMagazin.adaugaElement(produseInterior);
	  produseMagazin.adaugaElement(produseExterior);
	  
	  System.out.println("Test Composite:");
	  System.out.println(produseMagazin.getInfo());
	  
	  //test State
	  
	  Tranzactie tranzactie=new Tranzactie();
	  tranzactie.getInformatii();
	  
	  try {
		tranzactie.setStare(
				  new TranzactieInDesfasurare("Ionescu","Proces in desfasurare..."));
       tranzactie.getInformatii();
       
       tranzactie.setStare(
    		   new TranzactieIncheiata("Ionescu", "Tranzactie incheiata!"));
         tranzactie.getInformatii();
       
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	  
	  
	  
	  
	  
	  
	  

	}

}
