package decorator;
public class BucatarieSimpla extends AbstractMobilaBucatarie{
    
	
	
	public BucatarieSimpla(int id,String modelBucatarie,float pret) {
		this.idModel=id;
		this.denumireModel=modelBucatarie;
		this.pret=pret;
		
	}

	@Override
	public String getPiese() {
		return "Corp inferior,corp superior,blat ";
	}

}
