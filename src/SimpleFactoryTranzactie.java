
public class SimpleFactoryTranzactie {

	
	//metoda factory
	
	public static Client getTranzactieClient(TipTranzactie tipTranzactie,String nume) throws Exception{
		switch(tipTranzactie){
		case PERSOANA_FIZICA:
			return new TranzactiePersoanaFizica(nume);
		case PERSOANA_JURIDICA:
			return new TranzactiePersoanaJuridica(nume);
		default:
			throw new Exception("Tip tranzactie nerecunoscut!");
				
		}
		
	}
}
