package resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message addMessage(Message message)
	{
		return Messageservice.addMessage(message);
	}
	@GET
	@PathParam("/(messageId)")
	@Produces(MediaType.APPLICATION_JSON)
	public Message updateMessage(Message message)
	{
		return 
	}
	
	@GET
	@PathParam("/(messageId)")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getmessage(@PathParam("messageId") long id)
	{
		return messageservice.getmessage(id);
	}


}

