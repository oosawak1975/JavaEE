package sample;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

@ApplicationPath("/sample")
@Path("/hello")
public class Hello extends Application{

  @GET
  @Path("/hello")
  @Produces(MediaType.TEXT_PLAIN)
  public String start() {
    System.out.println("access.");
    return "executed.";
  }
  
  
  @GET
  @Path("/call")
  @Produces(MediaType.TEXT_PLAIN)
  public String call(){
	  Client client = ClientBuilder.newClient();
	  WebTarget target = client.target("https://rest")
	      .path("");

	  String str = target.request().get(String.class);

	  return str;
  }
}
