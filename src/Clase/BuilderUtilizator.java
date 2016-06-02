package Clase;

public class BuilderUtilizator {

	//referinta catre obiectul construit
	
	private Utilizator utilizator=null;
	
	public BuilderUtilizator(String nume,String functie){
		this.utilizator=new Utilizator(nume,"Vanzari",
				'M',20,functie,false);
	}
	
	public Utilizator build(){
		return this.utilizator;
	}
	
	public BuilderUtilizator setVarsta(int varsta){
		this.utilizator.setVarsta(varsta);
		return this;
	}
	
	public BuilderUtilizator setGen(char gen){
		this.utilizator.setGen(gen);
		return this;
	}
	public BuilderUtilizator setDepartament(String departament){
		this.utilizator.setDepartament(departament);
		return this;
	}
	public BuilderUtilizator accesBD(){
		this.utilizator.setAccesBD(true);
		return this;
	}
}
