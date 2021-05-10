package interfaceAbstractsDemo.concreate;

import interfaceAbstractsDemo.abstracts.CustomerCheckService;
import interfaceAbstractsDemo.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{
     
	public boolean checkIfRealPerson(Customer customer) {
		return true;	
	}	
}
