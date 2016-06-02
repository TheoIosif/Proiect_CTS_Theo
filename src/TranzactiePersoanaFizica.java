

public class TranzactiePersoanaFizica extends Client{
	private String nume;
	private static final double PRAG_REDUCERE=5000.0;

	
	
	public TranzactiePersoanaFizica(String nume) {
		super();
		this.nume = nume;
	}
	
	
	@Override
	public String getNume() {
		return this.nume;
	
	}
	@Override
	public void achitareProdus(double suma) {
		this.totalDePlata+=suma;
		
	}
	@Override
	public void reducereClient(double procent) throws Exception {
		if(procent>0 && procent<=1){
		   if(this.totalDePlata>PRAG_REDUCERE){
			     this.totalDePlata*=(1-procent);
	        	}
		}
		else{
			throw new Exception("Valoare incorecta!");
		}
	}

	

}
