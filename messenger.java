package resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.Message;
import service.messageservice;
@Path("/messages")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class messenger {
	messageservice Messageserv=new messageservice();
	@GET
	public List<Message> getmessage()
	{
		return Messageserv.getallmessages();
	}
	
	@POST
	public Message addMessage(Message message)
	{
		return Messageserv.addMessage(message);
	}
	@PUT
	@Path("/(messageId)")
	public Message updatemessage(@PathParam("(messageId)") long id,Message message)
	{
		message.setId(id);
		return Messageserv.updatemessage(message);
	}
	@DELETE
	@Path("/messageId")
	public Message deleteMessage(@PathParam("messageId")long id)
	{
		return Messageserv.deleteMessage(id);
	}
	@GET
	@Path("/messageId")
	public Message getmessage(@PathParam("messageId")long id)
	{
		return Messageserv.getmessage(id);
	}
	
	
	
	
	
	


}

