package Clase;
import java.security.InvalidParameterException;

public class Utilizator {
private String nume;
private String departament;
private char gen;
private int varsta;
private String functie;
private boolean accesBD;
public Utilizator(String nume, String departament, char gen, int varsta,
		String functie, boolean accesBD) {
	super();
	this.nume = nume;
	this.departament = departament;
	this.gen = gen;
	this.varsta = varsta;
	this.functie = functie;
	this.accesBD = accesBD;
	
}
public String getNume() {
	return nume;
}
public void setNume(String nume) {
	this.nume = nume;
}
public String getDepartament() {
	return departament;
}
public void setDepartament(String departament) {
	this.departament = departament;
}
public char getGen() {
	return gen;
}
public void setGen(char gen) {
	this.gen = gen;
}
public int getVarsta() {
	return varsta;
}
public void setVarsta(int varsta)throws InvalidParameterException {
	if(varsta<0 ||varsta>65)
		throw new InvalidParameterException();
	this.varsta = varsta;
}
public String getFunctie() {
	return functie;
}
public void setFunctie(String functie) {
	this.functie = functie;
}
public boolean isAccesBD() {
	return accesBD;
}
public void setAccesBD(boolean accesBD) {
	this.accesBD = accesBD;
}




}

