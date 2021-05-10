package interfaceAbstractsDemo.abstracts;

import interfaceAbstractsDemo.entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) {
		
		System.out.println(" Kaydedildi : " + customer.getFirstName() + " " + customer.getLastName());
		
	}

}
