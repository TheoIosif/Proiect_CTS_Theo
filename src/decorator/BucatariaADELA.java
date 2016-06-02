package decorator;
public class BucatariaADELA extends DecoratorBucatarie {

	public BucatariaADELA(AbstractMobilaBucatarie modelBucatarie) {
		super(modelBucatarie);
		
	}

	@Override
	public String getPiese() {
		return super.getPiese()+",uscator vase,hota incorporata";
	}

	
}
