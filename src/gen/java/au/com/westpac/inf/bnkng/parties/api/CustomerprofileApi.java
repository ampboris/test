package au.com.westpac.inf.bnkng.parties.api;

import au.com.westpac.inf.bnkng.parties.*;
import au.com.westpac.inf.bnkng.parties.api.CustomerprofileApiService;
import au.com.westpac.inf.bnkng.parties.api.factories.CustomerprofileApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import au.com.westpac.inf.bnkng.parties.CustomerProfileRequest;
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

@Path("/customerprofile")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the customerprofile API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-11-03T16:33:37.079+11:00")
public class CustomerprofileApi  {
   private final CustomerprofileApiService delegate = CustomerprofileApiServiceFactory.getCustomerprofileApi();

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Information API to create (load) customer profile along with the customer id, brand and customer type", response = void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "basicAuth")
    }, tags={ "customers", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Customer Profile loaded successfully", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 202, message = "Customer profile already exist", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = void.class) })
    public Response postCustomerProfile(@ApiParam(value = "Globally unique message identifier  - GUID. This uniquely identifies this call." ,required=true)@HeaderParam("x-messageId") String xMessageId
,@ApiParam(value = "Consumer generated message identifier for correlation purposes. e.g. Can be used to group together a number of API calls making up a business transaction." ,required=true)@HeaderParam("x-appCorrelationId") String xAppCorrelationId
,@ApiParam(value = "The organisation the caller is operating in." ,required=true, allowableValues="WBC, STG, BSA, BOM, BTPL, UBS, VIRG")@HeaderParam("x-organisationId") String xOrganisationId
,@ApiParam(value = "Channel Type" ,required=true, allowableValues="Branch, Online, Contact Centre, ATM, Mobile, IVR Telephony, Relationship Managed, External Broker, External EFA, External, Unknown, Internal")@HeaderParam("x-channelType") String xChannelType
,@ApiParam(value = "System Id of Application e.g. MA-005" ,required=true)@HeaderParam("x-originatingSystemId") String xOriginatingSystemId
,@ApiParam(value = "Customer profile" ,required=true) CustomerProfileRequest customerprofile
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.postCustomerProfile(xMessageId,xAppCorrelationId,xOrganisationId,xChannelType,xOriginatingSystemId,customerprofile,securityContext);
    }
}
