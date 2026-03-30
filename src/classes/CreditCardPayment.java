package classes;

import interfaces.IPayment;

public class CreditCardPayment implements IPayment {

	@Override
	public String pay(double amount) {
		// logic for credit card payment
		return "Payment successful through Credit Card!!";
	}

}
