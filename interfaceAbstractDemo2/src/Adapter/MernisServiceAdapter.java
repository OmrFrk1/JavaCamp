package Adapter;

import Abstract.CheckCustomerService;
import Entities.Customer;
import java.rmi.RemoteException;
import java.time.ZoneId;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoap.*;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class MernisServiceAdapter implements CheckCustomerService {

	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		try {
			return kpsPublicSoapProxy.TCKimlikNoDogrula(
					Long.parseLong(customer.getNationalityId()), 
					customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(), 
					customer.getDateOfBirth().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear());
		} catch (NumberFormatException | RemoteException e) {
			e.printStackTrace();
		}
		return false ;
	}
}
