package au.com.westpac.inf.bnkng.parties.api;

import au.com.westpac.inf.bnkng.parties.*;
import au.com.westpac.inf.bnkng.parties.api.HealthcheckApiService;
import au.com.westpac.inf.bnkng.parties.api.factories.HealthcheckApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import au.com.westpac.inf.bnkng.parties.InlineResponse200;

import java.util.List;
import au.com.westpac.inf.bnkng.parties.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/healthcheck")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the healthcheck API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-11-03T16:33:37.079+11:00")
public class HealthcheckApi  {
   private final HealthcheckApiService delegate = HealthcheckApiServiceFactory.getHealthcheckApi();

    @GET
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "retrieves HealthCheck Summary of API.", response = InlineResponse200.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "basicAuth")
    }, tags={ "getHealthCheckStatus", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = InlineResponse200.class) })
    public Response getHealthCheckStatus(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getHealthCheckStatus(securityContext);
    }
}
