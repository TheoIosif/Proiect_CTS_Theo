package Aplicatie;

import java.util.Random;

//produse achizitionate

public class ProduseDinAplicatie implements InterfataAplicatie{

	@Override
	public boolean conecteazaDeviceExtern(String ip) {
		System.out.println("Conecteaza device cu ip-ul : "+ip);
		return true;
	}




	@Override
	public String getProdus(String provider, String db, String password) {
		Random pret=new Random();
		return "S-a achizitionat produsul"
				+ " cu pretul de "+pret.nextInt(3000)+" lei";		
            }
	}