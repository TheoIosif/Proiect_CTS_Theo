package Composite;

public abstract class ElementBD {
	//interfata produse
 public abstract String getInfo();
 public abstract double getPret();
 
 //interfata noduri intermediare
 public abstract void adaugaElement(ElementBD element);
 public abstract void stergeElement(ElementBD element);
 public abstract ElementBD getElement(int index);
 public abstract int getNumarElemente();
}
