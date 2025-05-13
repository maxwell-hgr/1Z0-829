public class AccessingStaticData{
	// static
	String name;

	static String coolestName;

	final static constant;
	{constant = "Sou uma constante";}

	public static void main(String... args){
		AccessingStaticData asd = new AccessingStaticData();

		asd.name = "Dole";
		AccessingStaticData.coolestName = asd.name;

		asd = null;

		System.out.println(AccessingStaticData.coolestName); // printa Dole
	}
}