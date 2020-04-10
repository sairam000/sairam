package resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/messages")
public class messenger {
	@GET
	
	@Produces(MediaType.APPLICATION_JSON)
	public String getmessage()
	{
		return "hello world";
	}
	

}
