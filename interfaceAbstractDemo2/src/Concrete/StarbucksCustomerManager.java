package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CheckCustomerService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
    CheckCustomerService checkCustomerService;

    public StarbucksCustomerManager(CheckCustomerService checkCustomerService) {
        this.checkCustomerService = checkCustomerService;
    }

    @Override
    public void Save(Customer customer) {
        if (checkCustomerService.checkIfRealPerson(customer)) {
            super.Save(customer);
        } else {
            System.out.println("Not valid person");
        }
    }

}
