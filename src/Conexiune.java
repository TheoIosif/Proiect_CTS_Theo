
public class Conexiune {
	final String denumireBD;
	
	private static Conexiune conexiune=null;
	
	private Conexiune(String denumire_BD){
		this.denumireBD=denumire_BD;
	}
	
	public static Conexiune getConexiune(String denumire){
		if(conexiune==null)
			conexiune=new Conexiune(denumire);
		return conexiune;
	}
	
	
	

}
