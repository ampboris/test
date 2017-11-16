package au.com.westpac.inf.bnkng.parties.api.factories;

import au.com.westpac.inf.bnkng.parties.api.CustomerprofileApiService;
import au.com.westpac.inf.bnkng.parties.api.impl.CustomerprofileApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-11-03T16:33:37.079+11:00")
public class CustomerprofileApiServiceFactory {
    private final static CustomerprofileApiService service = new CustomerprofileApiServiceImpl();

    public static CustomerprofileApiService getCustomerprofileApi() {
        return service;
    }
}
