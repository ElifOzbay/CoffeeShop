package Concretes;

import Abstracts.ICustomerCheckService;
import Abstracts.ICustomerService;

public class StarbucksCustomerManager extends BaseCustomerManager {
	private ICustomerCheckService _customerCheckService;

	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {

		_customerCheckService = customerCheckService;
	}

	@Override
	public void add(Customer customer) {
		if (_customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Kullan�c� kaydedildi. " + customer.firstName+" " + customer.lastName);
		} else {
			System.out.println("Ge�ersiz kullan�c�.");
		}

	}

}
