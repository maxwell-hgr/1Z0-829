public class CreatingClasses{
	public static void main(String[] main){
		Leao leao = new Leao();
		leao.setProperties(12, "Scarface");
		leao.roar();

		leao.printaTotal();
	}
}

class Animal{
	private int age;
	protected String name;

	public int getAge(){
		return age;
	}
	public void setAge(int newAge){
		age = newAge;
	}

	public int total = 20;
}

class Leao extends Animal{
	public int total = 3;

	protected void setProperties(int age, String n){
		setAge(age);
		name = n;
	}

	public void roar(){
		System.out.println(name + ", age " + getAge() + ", says: Roar!");
	}

	public void printaTotal(){
		System.out.println(total + " leões e " + super.total + " animais!");
	}
}
