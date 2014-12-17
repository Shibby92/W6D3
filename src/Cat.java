public class Cat extends Zivotinja {
	private String pasmina;

	public Cat(String ime, int brNogu) {
		super(ime, brNogu, "macka");
		this.pasmina = "Grump";
	}

	public void lajanje() {
		System.out.println("mjau mjau mjau ");
	}

	public String getPasmina() {
		return pasmina;
	}

	public void setPasmina(String pasmina) {
		this.pasmina = pasmina;
	}

	public int testAnimal() {
		return this.getBrNogu();
	}

	public String toString() {
		return "Macka" + this.getIme();
	}

}
