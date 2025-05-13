import java.util.*;
import java.text.*;

public class Internationalization{
	public static void main(String[] args){
		Locale locale = Locale.getDefault();
		System.out.println(locale);

		String amount = "$26,540.45";
		var ci = NumberFormat.getCurrencyInstance();
		double number = 0;
		try{
			number = (Double) ci.parse(amount);
		} catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(number);
		
	}
}