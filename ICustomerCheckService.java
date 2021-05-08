package Abstracts;

import Concretes.Customer;

public interface ICustomerCheckService {
	
	boolean CheckIfRealPerson(Customer customer);
}
