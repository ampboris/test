package au.com.westpac.inf.bnkng.parties.api;

import au.com.westpac.inf.bnkng.parties.*;
import au.com.westpac.inf.bnkng.parties.api.CustomersApiService;
import au.com.westpac.inf.bnkng.parties.api.factories.CustomersApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import au.com.westpac.inf.bnkng.parties.InlineResponse400;
import au.com.westpac.inf.bnkng.parties.CustomerResponse;
import au.com.westpac.inf.bnkng.parties.CustomerRelationshipResponse;

import java.util.List;
import au.com.westpac.inf.bnkng.parties.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/customers")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the customers API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-11-03T16:33:37.079+11:00")
public class CustomersApi  {
   private final CustomersApiService delegate = CustomersApiServiceFactory.getCustomersApi();

    @GET
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Retrive demographic data for the given CustomerID/ CISKey/GCISKey Number", response = CustomerResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "basicAuth")
    }, tags={ "customers", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Demographic information of the customer", response = CustomerResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = CustomerResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Customer Not found", response = CustomerResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = CustomerResponse.class) })
    public Response getCustomer(@ApiParam(value = "Globally unique message identifier  - GUID. This uniquely identifies this call." ,required=true)@HeaderParam("x-messageId") String xMessageId
,@ApiParam(value = "Consumer generated message identifier for correlation purposes. e.g. Can be used to group together a number of API calls making up a business transaction." ,required=true)@HeaderParam("x-appCorrelationId") String xAppCorrelationId
,@ApiParam(value = "The organisation the caller is operating in." ,required=true, allowableValues="WBC, STG, BSA, BOM, BTPL, UBS, VIRG")@HeaderParam("x-organisationId") String xOrganisationId
,@ApiParam(value = "Channel Type" ,required=true, allowableValues="Branch, Online, Contact Centre, ATM, Mobile, IVR Telephony, Relationship Managed, External Broker, External EFA, External, Unknown, Internal")@HeaderParam("x-channelType") String xChannelType
,@ApiParam(value = "System Id of Application e.g. MA-005" ,required=true)@HeaderParam("x-originatingSystemId") String xOriginatingSystemId
,@ApiParam(value = "Scheme of the Id eg:CISKey/CustomerId/GCISKey",required=true) @QueryParam("idScheme") String idScheme
,@ApiParam(value = "Type of the customer eg:Organisation/Individual",required=true) @QueryParam("customerType") String customerType
,@ApiParam(value = "Brand e.g WBC, SGB",required=true, allowableValues="WPAC, SGB") @QueryParam("brandSilo") String brandSilo
,@ApiParam(value = "CustomerId/CISKey/GCISKey e.g. 12345678",required=true) @PathParam("id") String id
,@ApiParam(value = "Retrieve active/inactive addresses based on the specified value. If not provided all addresses will be  returned e.g. true for active / false for inactive") @QueryParam("activeAddresses") Boolean activeAddresses
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getCustomer(xMessageId,xAppCorrelationId,xOrganisationId,xChannelType,xOriginatingSystemId,idScheme,customerType,brandSilo,id,activeAddresses,securityContext);
    }
    @GET
    @Path("/{id}/relationships")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Retrive relationships for the given CustomerID/ CISKey/GCISKey Number", response = CustomerRelationshipResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "basicAuth")
    }, tags={ "customers", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Relationship data of the customer", response = CustomerRelationshipResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = CustomerRelationshipResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Customer Not found", response = CustomerRelationshipResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = CustomerRelationshipResponse.class) })
    public Response getCustomerRelationships(@ApiParam(value = "Globally unique message identifier  - GUID. This uniquely identifies this call." ,required=true)@HeaderParam("x-messageId") String xMessageId
,@ApiParam(value = "Consumer generated message identifier for correlation purposes. e.g. Can be used to group together a number of API calls making up a business transaction." ,required=true)@HeaderParam("x-appCorrelationId") String xAppCorrelationId
,@ApiParam(value = "The organisation the caller is operating in." ,required=true, allowableValues="WBC, STG, BSA, BOM, BTPL, UBS, VIRG")@HeaderParam("x-organisationId") String xOrganisationId
,@ApiParam(value = "Channel Type" ,required=true, allowableValues="Branch, Online, Contact Centre, ATM, Mobile, IVR Telephony, Relationship Managed, External Broker, External EFA, External, Unknown, Internal")@HeaderParam("x-channelType") String xChannelType
,@ApiParam(value = "System Id of Application e.g. MA-005" ,required=true)@HeaderParam("x-originatingSystemId") String xOriginatingSystemId
,@ApiParam(value = "Scheme of the Id eg:CISKey/CustomerId/GCISKey",required=true) @QueryParam("idScheme") String idScheme
,@ApiParam(value = "Type of the customer eg:Organisation/Individual",required=true) @QueryParam("customerType") String customerType
,@ApiParam(value = "Brand e.g WBC, SGB",required=true, allowableValues="WPAC, SGB") @QueryParam("brandSilo") String brandSilo
,@ApiParam(value = "CustomerId/CISKey/GCISKey e.g. 12345678",required=true) @PathParam("id") String id
,@ApiParam(value = "Retrieve related customers based on the specified value. If not provided all related customers will be returned e.g. Director. To filter by multiple values then it should be separated by '|' symbol. e.g. Director|Signatory.") @QueryParam("relationshipType") String relationshipType
,@ApiParam(value = "If true Retrieve relationshipFrom. If not populated, by default it will be true.") @QueryParam("relationshipFrom") Boolean relationshipFrom
,@ApiParam(value = "If true Retrieve relationshipTo. If not populated, by default it will be true.") @QueryParam("relationshipTo") Boolean relationshipTo
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getCustomerRelationships(xMessageId,xAppCorrelationId,xOrganisationId,xChannelType,xOriginatingSystemId,idScheme,customerType,brandSilo,id,relationshipType,relationshipFrom,relationshipTo,securityContext);
    }
}
