package Composite;

public class ProdusBD extends ElementBD{
 
	private String denumireProdus;
	private int cod;
	private double pret;
	
	
	
	public ProdusBD(String denumireProdus, int cod, double pret) {
		super();
		this.denumireProdus = denumireProdus;
		this.cod = cod;
		this.pret = pret;
	}

	@Override
	public String getInfo() {
	return "Produsul "+this.denumireProdus+"-cod: "+this.cod
			+" cu pretul: "
			+this.pret+"\n";
	}

	@Override
	public double getPret() {
		return this.pret;
	}

	
	
	@Override
	public void adaugaElement(ElementBD element) {
		throw new UnsupportedOperationException();
		
	}

	@Override
	public void stergeElement(ElementBD element) {
		throw new UnsupportedOperationException();
		
	}

	@Override
	public ElementBD getElement(int index) {
		throw new UnsupportedOperationException();
	}

	@Override
	public int getNumarElemente() {
		throw new UnsupportedOperationException();
	}

}
