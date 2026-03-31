import java.lang.reflect.Field;

import classes.BillCollector;
import classes.CreditCardPayment;
import classes.DebitCardPayment;
import classes.UpiPayment;

public class Test {

	public static void main(String[] args) throws Exception{
		
		BillCollector bc = new BillCollector();
		
		// injecting credit card object into bill collector (setter injection)
		bc.setPayment(new CreditCardPayment());
		bc.payBill(1400.00);
		
		// injecting debit card object into bill collector (constructor injection)
		BillCollector bc1 = new BillCollector(new DebitCardPayment());
		bc1.payBill(2900.00);
		
		
		// injecting upi object into bill collector (Field Injection)
		// Using Reflection API to access private member outside of the the class
		
		Class<?> clz = Class.forName("classes.BillCollector");
		Field field = clz.getDeclaredField("payment");
		field.setAccessible(true);
		
		Object obj = clz.newInstance();
		field.set(obj, new UpiPayment());
		
		BillCollector upi = (BillCollector)obj;
		upi.payBill(3200.00);
		

	}

}
