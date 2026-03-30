import classes.BillCollector;
import classes.CreditCardPayment;

public class Test {

	public static void main(String[] args) {
		
		BillCollector bc = new BillCollector();
		
		// injecting credit card object into bill collector (setter injection)
		bc.setPayment(new CreditCardPayment());
		bc.payBill(1400.00);

	}

}
