package au.com.westpac.inf.bnkng.parties.api;

import au.com.westpac.inf.bnkng.parties.api.*;
import au.com.westpac.inf.bnkng.parties.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import au.com.westpac.inf.bnkng.parties.SearchRequest;
import au.com.westpac.inf.bnkng.parties.CustomersResponse;
import au.com.westpac.inf.bnkng.parties.InlineResponse400;

import java.util.List;
import au.com.westpac.inf.bnkng.parties.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-11-03T16:33:37.079+11:00")
public abstract class CustomersearchApiService {
    public abstract Response getCustomers(String xMessageId,String xAppCorrelationId,String xOrganisationId,String xChannelType,String xOriginatingSystemId,SearchRequest searchCriteria,SecurityContext securityContext) throws NotFoundException;
}
