import java.util.Locale;
import java.util.ResourceBundle;

public class PropertiesResourceBundles{
	public static void main(String[] args){
		var rb = ResourceBundle.getBundle("Zoo", new Locale("pt", "BR"));
		System.out.println(rb.getString("hello"));
		System.out.println(rb.getString("open"));
		System.out.println(rb.getString("cadastro"));
	}
}