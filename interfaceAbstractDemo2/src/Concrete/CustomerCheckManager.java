package Concrete;

import Abstract.CheckCustomerService;
import tr.gov.nvi.tckimlik.WS.*;
import Entities.Customer;

public class CustomerCheckManager implements CheckCustomerService{
    
    public boolean checkIfRealPerson(Customer customer){
    	return true;
        
    }
}
