package org.acme.rest.client.quick;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient
public interface ContactExternalService {

	@GET
	@Path("greeting")
	Response getGreeting();
}
