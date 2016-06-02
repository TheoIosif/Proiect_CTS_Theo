
public class TranzactiePersoanaJuridica extends Client{
    private String denPersoanaJuridica;
    private static final double LIMITA_REDUCERE=15000.0;
    
    
    
	public TranzactiePersoanaJuridica(String denPersoanaJuridica) {
		super();
		this.denPersoanaJuridica = denPersoanaJuridica;
	}

	@Override
	public String getNume() {
		return this.denPersoanaJuridica;
		
	}

	@Override
	public void achitareProdus(double suma) {
		this.totalDePlata+=suma;
		
	}

	@Override
	public void reducereClient(double procentReducere) throws Exception {
		if(procentReducere>0 && procentReducere<=1){
			   if(this.totalDePlata>LIMITA_REDUCERE){
				     this.totalDePlata*=(1-procentReducere);
		        	}
			}
			else{
				throw new Exception("Valoare ilegala!");
			}
		
		
	}

	

	

	

}
