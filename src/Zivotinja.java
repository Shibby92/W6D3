
public class Zivotinja {
	private String ime;
	private int brNogu;
	private String tip;
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public int getBrNogu() {
		return brNogu;
	}
	public void setBrNogu(int brNogu) {
		this.brNogu = brNogu;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	private int test(){
		return -1;
	}
	
	public Zivotinja(String ime,int brNogu,String tip){
		this.ime=ime;
		this.brNogu=brNogu;
		this.tip=tip;
		
	}
	public String toString(){
		StringBuilder sb= new StringBuilder();
		sb.append(this.ime);
		sb.append(" "+this.brNogu);
		sb.append(" "+this.tip);
		return sb.toString();
	}
	public boolean equals(Zivotinja other){
		if(this.brNogu==other.brNogu && this.ime==other.ime && this.tip== other.tip)
			return true;
		return false;
	}

}
