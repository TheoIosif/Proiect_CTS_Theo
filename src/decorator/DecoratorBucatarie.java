package decorator;
public class DecoratorBucatarie extends AbstractMobilaBucatarie{
   protected final AbstractMobilaBucatarie modelBucatarie;
   
   
	public DecoratorBucatarie(AbstractMobilaBucatarie modelBucatarie) {
		
	this.modelBucatarie = modelBucatarie;
}


	@Override
	public String getPiese() {
	  return modelBucatarie.getPiese();
	}

}
