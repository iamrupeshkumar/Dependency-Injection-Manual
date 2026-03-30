import classes.BillCollector;
import classes.CreditCardPayment;
import classes.DebitCardPayment;

public class Test {

	public static void main(String[] args) {
		
		BillCollector bc = new BillCollector();
		
		// injecting credit card object into bill collector (setter injection)
		bc.setPayment(new CreditCardPayment());
		bc.payBill(1400.00);
		
		// injecting debit card object into bill collector (constructor injection)
		BillCollector bc1 = new BillCollector(new DebitCardPayment());
		bc1.payBill(2900.00);

	}

}
