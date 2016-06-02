package decorator;
public class BucatariaANAISSA extends DecoratorBucatarie{

	public BucatariaANAISSA(AbstractMobilaBucatarie modelBucatarie) {
		super(modelBucatarie);
	
	}

	@Override
	public String getPiese() {
		return super.getPiese()+"jolly(sticle),corp masina de spalat incastrata";
	}

	
	

}
