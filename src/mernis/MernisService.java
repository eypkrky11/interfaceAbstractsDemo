package mernis;

import java.rmi.RemoteException;

import interfaceAbstractsDemo.abstracts.CustomerCheckService;
import interfaceAbstractsDemo.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisService implements CustomerCheckService{
  
	public boolean checkIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = true;
		
		try {
			
			result = client.TCKimlikNoDogrula(
					Long.parseLong(customer.getNationalityId()),
					customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(),
					customer.getDataOfBirth());
					
		}catch(RemoteException e) {
			result = false;
			System.out.println("Müþteri hatasý");
			e.printStackTrace();
		}
		System.out.println(result);	
		return result;
	}
		
}
