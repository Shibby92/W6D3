
public class Dog extends Zivotinja{
	private String pasmina;
	
	public Dog(String ime,int brNogu){
		super(ime, brNogu,"dog");		
		this.pasmina="nepoznata";
		
	}
	public void lajanje(){
		System.out.println("av av av");
	}
public String getPasmina() {
		return pasmina;
	}
	public void setPasmina(String pasmina) {
		this.pasmina = pasmina;
	}
public int testAnimal(){
	return this.getBrNogu();
}
public String toString(){
	return "Pas" + this.getIme();
}
}
