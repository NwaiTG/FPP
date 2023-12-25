package day2;

public class Main {
	public static void main(String args[]) {
		Address billingAdd1 = new Address("1000 4th North Street", "Fairfield", "Iowa", "534566");
		Address shippingAdd1 = new Address("1000 6th North Street", "Fairfield", "Iowa", "534566");
		Address billingAdd2 = new Address("1000 4th North Street", "Fairfield", "Chicago", "534566");
		Address shippingAdd2 = new Address("1000 6th North Street", "Fairfield", "Iowa", "534566");
		
		Customer c1 = new Customer("One", "One", "111-111-1111");
		Customer c2 = new Customer("Two", "Two", "222-222-2222");
		
		c1.setBillingAdd(billingAdd1);
		c1.setShippingAdd(shippingAdd1);
		
		c2.setBillingAdd(billingAdd2);
		c2.setShippingAdd(shippingAdd2);
		
		Customer[] cusArr = new Customer[2];
		cusArr[0] = c1;
		cusArr[1] = c2;
		
		for(int i = 0; i < cusArr.length; i++)
		{
			String state = cusArr[i].getBillingAdd().toString();
			if(state.contains("Chicago"))
				System.out.println(cusArr[i].toString());
			
		}
	}
}
