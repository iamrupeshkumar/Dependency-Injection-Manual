package classes;

import interfaces.IPayment;

public class BillCollector {
	
	private IPayment payment;
	
	public void setPayment(IPayment payment) {
		this.payment = payment;
	}
	
	public void payBill(double amount) {
		String status = payment.pay(amount);
		System.out.println(status);
	}

}
