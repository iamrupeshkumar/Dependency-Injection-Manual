package classes;

import interfaces.IPayment;

public class UpiPayment implements IPayment {

	@Override
	public String pay(double amount) {
		// logic for upi payment
		return "Payment successful using UPI!!";
	}

}
