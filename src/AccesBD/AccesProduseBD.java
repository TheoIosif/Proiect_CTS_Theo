package AccesBD;

public class AccesProduseBD implements InterfataAccesBD{

	@Override
	public String[] getProduse(String provider,String source,String password) {
		System.out.println("Provider= "
		  		+ provider+" Data source="+source);
		  return new String[]{
				  "Produsul cu id-ul: 0"};
	}

}
