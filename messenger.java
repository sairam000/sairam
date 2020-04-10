package resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.Message;
import service.messageservice;

@Path("/messages")
public class messenger {
	messageservice Messageserv=new messageservice();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getmessage()
	{
		return Messageserv.getallmessages();
	}
	

}
