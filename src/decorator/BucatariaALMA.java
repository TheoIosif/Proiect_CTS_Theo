package decorator;
public class BucatariaALMA extends DecoratorBucatarie{

	public BucatariaALMA(AbstractMobilaBucatarie modelBucatarie) {
		super(modelBucatarie);
		
	}

	@Override
	public String getPiese() {
		return super.getPiese()+",frigider incastrat";
	}
	

}
