package interfaceAbstractsDemo.abstracts;

import interfaceAbstractsDemo.entities.Customer;

public interface CustomerCheckService {
	
	static boolean checkIfRealPerson(Customer customer) {
		return true;
	}

}
