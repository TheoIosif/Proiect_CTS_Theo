package State;

public class TranzactieInDesfasurare extends StareTranzactie{
    String numeCasier;
	String mesaj;
	
	
	public TranzactieInDesfasurare(String numeCasier, String mesaj) {
		super();
		this.numeCasier = numeCasier;
		this.mesaj = mesaj;
	}


	@Override
	public void InformatieTranzactie() {
	   System.out.println("Tranzactie realizata"
	   		+ "de casierul:"+this.numeCasier);
	   System.out.println("Tranzactie in desfasurare!");
	   System.out.println(this.mesaj);
		
	}

}
