package service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.POST;

import model.Message;

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
	public  Message addMessage(Message message) {
		// TODO Auto-generated method stub
		return messageservice.addMessage(message);
	}

	public static Message getmessage(long id) {
		// TODO Auto-generated method stub
		return null;
	}.

	



}
