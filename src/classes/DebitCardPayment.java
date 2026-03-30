package classes;

import interfaces.IPayment;

public class DebitCardPayment implements IPayment {

	@Override
	public String pay(double amount) {
		// logic for Debit Card payment
		return "Payment successful through Debit Card!!";
	}

}
