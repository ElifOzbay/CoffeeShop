import java.util.Date;

import Adapters.MernisServiceAdapter;
import Concretes.BaseCustomerManager;
import Concretes.Customer;
import Concretes.StarbucksCustomerManager;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.add(new Customer(1,"Elif","Özbay",2001,"21474427415"));
		System.out.println();
		
		

	}

}
