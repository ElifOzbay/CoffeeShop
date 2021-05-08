package Adapters;

import Abstracts.ICustomerCheckService;
import Concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {

KPSPublicSoapProxy kpsPublic= new KPSPublicSoapProxy();
		
		try {
            return kpsPublic.TCKimlikNoDogrula(Long.parseLong(customer.nationalityId),
                    customer.firstName.toUpperCase(), customer.lastName.toUpperCase(),
                    customer.dateOfBirth);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  false;

	}
	

}