package au.com.westpac.inf.bnkng.parties.api;

import au.com.westpac.inf.bnkng.parties.*;
import au.com.westpac.inf.bnkng.parties.api.CustomersearchApiService;
import au.com.westpac.inf.bnkng.parties.api.factories.CustomersearchApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import au.com.westpac.inf.bnkng.parties.SearchRequest;
import au.com.westpac.inf.bnkng.parties.CustomersResponse;
import au.com.westpac.inf.bnkng.parties.InlineResponse400;

import java.util.List;
import au.com.westpac.inf.bnkng.parties.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/customersearch")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the customersearch API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-11-03T16:33:37.079+11:00")
public class CustomersearchApi  {
   private final CustomersearchApiService delegate = CustomersearchApiServiceFactory.getCustomersearchApi();

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Information API to search existing customers based on the search criteria's. Searches for the customer across all brands. Individual and Organization customer types will be supported. API will return number of customers in the response based up on a fuzzy match.", response = CustomersResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "basicAuth")
    }, tags={ "CustomerSearch", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Existing customers will be retrieved", response = CustomersResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = CustomersResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = CustomersResponse.class) })
    public Response getCustomers(@ApiParam(value = "Globally unique message identifier  - GUID. This uniquely identifies this call." ,required=true)@HeaderParam("x-messageId") String xMessageId
,@ApiParam(value = "Consumer generated message identifier for correlation purposes. e.g. Can be used to group together a number of API calls making up a business transaction." ,required=true)@HeaderParam("x-appCorrelationId") String xAppCorrelationId
,@ApiParam(value = "The organisation the caller is operating in." ,required=true, allowableValues="WBC, STG, BSA, BOM, BTPL, UBS, VIRG")@HeaderParam("x-organisationId") String xOrganisationId
,@ApiParam(value = "Channel Type" ,required=true, allowableValues="Branch, Online, Contact Centre, ATM, Mobile, IVR Telephony, Relationship Managed, External Broker, External EFA, External, Unknown, Internal")@HeaderParam("x-channelType") String xChannelType
,@ApiParam(value = "System Id of Application e.g. MA-005" ,required=true)@HeaderParam("x-originatingSystemId") String xOriginatingSystemId
,@ApiParam(value = "Customer search criteria" ,required=true) SearchRequest searchCriteria
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getCustomers(xMessageId,xAppCorrelationId,xOrganisationId,xChannelType,xOriginatingSystemId,searchCriteria,securityContext);
    }
}
