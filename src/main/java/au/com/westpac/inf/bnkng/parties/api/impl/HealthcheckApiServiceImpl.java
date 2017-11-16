package au.com.westpac.inf.bnkng.parties.api.impl;

import au.com.westpac.inf.bnkng.parties.api.*;
import au.com.westpac.inf.bnkng.parties.*;

import au.com.westpac.inf.bnkng.parties.InlineResponse200;

import java.util.List;
import au.com.westpac.inf.bnkng.parties.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-11-03T16:33:37.079+11:00")
public class HealthcheckApiServiceImpl extends HealthcheckApiService {
    @Override
    public Response getHealthCheckStatus(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
