package State;

public class Tranzactie {
 private StareTranzactie stare;
 
 public Tranzactie(){
	 stare=(StareTranzactie)new TranzactieNepornita();
 }
 
 public void setStare(StareTranzactie stareNoua) throws Exception{
	 
	 if(stare instanceof TranzactieInDesfasurare)
		 if(stareNoua instanceof TranzactieNepornita)
			 throw new Exception();
	 this.stare=stareNoua;
	 
 }
 
 public void getInformatii(){
	 this.stare.InformatieTranzactie();
 }
 
}
