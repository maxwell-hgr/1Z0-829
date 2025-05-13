public class WorkingWithVarargs{

	public void dealWithVarargs(String... args){
		for(String name : args){
			System.out.println(name);
		}
	}

	public static void main(String[] args){
		String[] names = new String[] {"dole", "james", "silva"};

		WorkingWithVarargs varargs = new WorkingWithVarargs();
		varargs.dealWithVarargs(names);
		varargs.dealWithVarargs("Dizas", "Clebe");

	}
}