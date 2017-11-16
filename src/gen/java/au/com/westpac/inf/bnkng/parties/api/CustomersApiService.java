package au.com.westpac.inf.bnkng.parties.api;

import au.com.westpac.inf.bnkng.parties.api.*;
import au.com.westpac.inf.bnkng.parties.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import au.com.westpac.inf.bnkng.parties.InlineResponse400;
import au.com.westpac.inf.bnkng.parties.CustomerResponse;
import au.com.westpac.inf.bnkng.parties.CustomerRelationshipResponse;

import java.util.List;
import au.com.westpac.inf.bnkng.parties.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-11-03T16:33:37.079+11:00")
public abstract class CustomersApiService {
    public abstract Response getCustomer(String xMessageId,String xAppCorrelationId,String xOrganisationId,String xChannelType,String xOriginatingSystemId,String idScheme,String customerType,String brandSilo,String id,Boolean activeAddresses,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getCustomerRelationships(String xMessageId,String xAppCorrelationId,String xOrganisationId,String xChannelType,String xOriginatingSystemId,String idScheme,String customerType,String brandSilo,String id,String relationshipType,Boolean relationshipFrom,Boolean relationshipTo,SecurityContext securityContext) throws NotFoundException;
}
