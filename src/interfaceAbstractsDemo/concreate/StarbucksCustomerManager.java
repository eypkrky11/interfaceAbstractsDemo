package interfaceAbstractsDemo.concreate;

import interfaceAbstractsDemo.abstracts.BaseCustomerManager;
import interfaceAbstractsDemo.abstracts.CustomerCheckService;
import interfaceAbstractsDemo.entities.Customer;

public class StarbucksCustomerManager  extends BaseCustomerManager{
 
	CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager (CustomerCheckService customerCheckService) {
	               this.customerCheckService = customerCheckService;             
	}
	@Override
	public void save(Customer customer) {
		if (CustomerCheckService.checkIfRealPerson(customer)) {
			
		}else {
			System.out.println("Kiþi geçersiz");
		}
		
	}
}
