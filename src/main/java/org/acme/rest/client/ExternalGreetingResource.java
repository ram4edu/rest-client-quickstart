package org.acme.rest.client;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.acme.rest.client.quick.ContactExternalService;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/getExternalGreeting")
public class ExternalGreetingResource {

	@Inject
    @RestClient
	ContactExternalService contactExternalService;
	
    @GET
    public Response hello() {
    	return contactExternalService.getGreeting();
        
    }
}