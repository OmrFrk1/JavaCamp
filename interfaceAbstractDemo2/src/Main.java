import Abstract.BaseCustomerManager;
import java.util.GregorianCalendar;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;
import Adapter.MernisServiceAdapter;

public class Main {
    public static void main(String[] args) {
        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter() );
        Customer customer = new Customer(1, "Omer", "Bulut", "123123",new GregorianCalendar(2001, 03 , 15).getTime());
        customerManager.Save(customer);
        
        
    }
}
