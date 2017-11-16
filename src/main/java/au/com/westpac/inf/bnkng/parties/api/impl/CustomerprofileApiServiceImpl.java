package au.com.westpac.inf.bnkng.parties.api.impl;

import au.com.westpac.inf.bnkng.parties.api.*;
import au.com.westpac.inf.bnkng.parties.*;

import au.com.westpac.inf.bnkng.parties.CustomerProfileRequest;
import au.com.westpac.inf.bnkng.parties.InlineResponse400;

import java.util.List;
import au.com.westpac.inf.bnkng.parties.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-11-03T16:33:37.079+11:00")
public class CustomerprofileApiServiceImpl extends CustomerprofileApiService {
    @Override
    public Response postCustomerProfile(String xMessageId, String xAppCorrelationId, String xOrganisationId, String xChannelType, String xOriginatingSystemId, CustomerProfileRequest customerprofile, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
