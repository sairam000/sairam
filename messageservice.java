package service;

import java.util.ArrayList;
import java.util.List;

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

}
