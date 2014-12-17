public class ZivotinjaTest {

	public static void main(String[] args) {
		Zivotinja prva = new Zivotinja("Kuslat", 2, "Ptica");
		Zivotinja druga = new Zivotinja("Miki", 4, "Pas");
		System.out.println(prva.toString());
		System.out.println(prva.equals(druga));

	}

}
