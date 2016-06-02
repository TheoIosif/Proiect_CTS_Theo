package Composite;

import java.util.ArrayList;

public class CategorieProduse extends ElementBD{

	ArrayList<ElementBD> elemente=
			new ArrayList<>();
	String denumireCategorieProduse;
	
	
	 public CategorieProduse(String denumireCategorieProduse) {
		
		this.denumireCategorieProduse = denumireCategorieProduse;
	}
	 

	@Override
	public String getInfo() {
		StringBuilder sb=new StringBuilder();
		sb.append(this.denumireCategorieProduse+"\n");
		for(ElementBD element:elemente)
			sb.append(element.getInfo());
		return sb.toString();
	}

	@Override
	public double getPret() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void adaugaElement(ElementBD element) {
	     elemente.add(element);
		
	}

	@Override
	public void stergeElement(ElementBD element) {
		elemente.remove(element);
		
	}

	@Override
	public ElementBD getElement(int index) {
	 if(index>=0 && index<this.elemente.size())
		 return this.elemente.get(index);
	 else 
		throw new UnsupportedOperationException();
	}

	@Override
	public int getNumarElemente() {
	   return this.elemente.size();
	}

}
