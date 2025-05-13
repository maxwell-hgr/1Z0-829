public class Var{
	String name;

	int count;
	{count++;}

	public void var(){
		var var = "var";

		// var name = "dole", surname = "james"; -> não é permitido
		// System.out.println(name + " | " + surname);
		System.out.println("local variable type inference");
	}

	public void Var(){
		Var var = new Var();
		System.out.println("Creating Var");
	}

	public static void main(String[] args){
		final Var var = new Var();
		var.Var();
		var.var();
		System.out.println(var.name);
		System.out.println(var.count);
	}
}