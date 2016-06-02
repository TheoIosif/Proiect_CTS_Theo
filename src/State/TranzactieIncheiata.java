package State;

public class TranzactieIncheiata extends StareTranzactie{
    String numeCasier;
	String mesaj;
	
	
    
	
	public TranzactieIncheiata(String numeCasier, String mesaj) {
		super();
		this.numeCasier = numeCasier;
		this.mesaj = mesaj;
	}




	@Override
	public void InformatieTranzactie() {
		System.out.println("Tranzactie realizata de : "+this.numeCasier);
		System.out.println(this.mesaj);
		
	}

}
