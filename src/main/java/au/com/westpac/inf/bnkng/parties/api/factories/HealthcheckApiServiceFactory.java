package au.com.westpac.inf.bnkng.parties.api.factories;

import au.com.westpac.inf.bnkng.parties.api.HealthcheckApiService;
import au.com.westpac.inf.bnkng.parties.api.impl.HealthcheckApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-11-03T16:33:37.079+11:00")
public class HealthcheckApiServiceFactory {
    private final static HealthcheckApiService service = new HealthcheckApiServiceImpl();

    public static HealthcheckApiService getHealthcheckApi() {
        return service;
    }
}
