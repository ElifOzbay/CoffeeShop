package Concretes;

import Abstracts.ICustomerCheckService;
import Abstracts.ICustomerService;
import Adapters.MernisServiceAdapter;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;

	}

}
