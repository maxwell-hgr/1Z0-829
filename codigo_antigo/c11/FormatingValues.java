import java.text.DecimalFormat;
import java.text.NumberFormat;

public class FormatingValues{
	public static void main(String[] args){
		double cpf = 123456789.11;
		NumberFormat f1 = new DecimalFormat("###,###,###.00");
		System.out.println(f1.format(cpf));

		var formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy 'as' hh:mm");

		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt.format(f));
	}
}