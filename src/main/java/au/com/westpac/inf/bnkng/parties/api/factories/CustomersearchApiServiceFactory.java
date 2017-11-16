package au.com.westpac.inf.bnkng.parties.api.factories;

import au.com.westpac.inf.bnkng.parties.api.CustomersearchApiService;
import au.com.westpac.inf.bnkng.parties.api.impl.CustomersearchApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-11-03T16:33:37.079+11:00")
public class CustomersearchApiServiceFactory {
    private final static CustomersearchApiService service = new CustomersearchApiServiceImpl();

    public static CustomersearchApiService getCustomersearchApi() {
        return service;
    }
}
