package service;

import java.util.ArrayList;
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
@Path("/messages")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class messageservice {
	public List<Message> getallmessages()
	{
		Message m1=new Message(1l,"hello","sairam");
		Message m2=new Message(2l,"world","kishore");
		List <Message> l=new ArrayList<>();
		l.add(m1);
		l.add(m2);
		
		return l;
			}
    @POST
	public static  Message addMessage(Message message) {
		// TODO Auto-generated method stub
		return messageservice.addMessage(message);
	}
    @GET
	public static Message getmessage(long id) {
		// TODO Auto-generated method stub
		return messageservice.getmessage(id);
	}
    @PUT
    @Path("messageId")
	public static Message updatemessage(@PathParam("messageId") long id, Message message) 
	{
		// TODO Auto-generated method stub
		message.setId(id);
		return messageservice.updatemessage(id, message);
	}
    @DELETE
	public static Message deletemessage(Message message) {
		// TODO Auto-generated method stub
		return messageservice.deletemessage(message);
	}
    

	



}
