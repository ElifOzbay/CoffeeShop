package Concretes;

import Abstracts.ICustomerService;

public class BaseCustomerManager implements ICustomerService{

	@Override
	public void add(Customer customer) {
		System.out.println("Veritabanưna kaydedildi. "+ customer.firstName );
		
	}

}
