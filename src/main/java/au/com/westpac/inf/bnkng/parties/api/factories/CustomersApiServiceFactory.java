package au.com.westpac.inf.bnkng.parties.api.factories;

import au.com.westpac.inf.bnkng.parties.api.CustomersApiService;
import au.com.westpac.inf.bnkng.parties.api.impl.CustomersApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-11-03T16:33:37.079+11:00")
public class CustomersApiServiceFactory {
    private final static CustomersApiService service = new CustomersApiServiceImpl();

    public static CustomersApiService getCustomersApi() {
        return service;
    }
}
