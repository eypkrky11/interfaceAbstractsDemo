import interfaceAbstractsDemo.concreate.NeroCustomerManager;
import interfaceAbstractsDemo.concreate.StarbucksCustomerManager;
import interfaceAbstractsDemo.entities.Customer;
import mernis.MernisService;

public class Main {
	
	public static void main(String[] args) {
		
		Customer customer1 = new Customer(1,"Eyüp","Karakaya",1993-15-12,"12345678912");
		StarbucksCustomerManager starbucksCustomerManager =new StarbucksCustomerManager(new MernisService());
		starbucksCustomerManager.save(customer1);
		
		Customer customer2 = new Customer(2,"Barýþ" ,"Ateþ",1996-12-10,"12345678999");
		NeroCustomerManager neroCustomerManager =new NeroCustomerManager();
		neroCustomerManager.save(customer2);
	}
	

}
