package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Path;
import javax.xml.stream.events.Comment;

import model.Message;

public class CommentService {
	private static Map<Long, Message> messages = Database.getMessages();
	public List<Comment> getAllComment(long messageId)
	{
		Map<Long,Comment> comments=messages.get(messageId).getComments();
		return new ArrayList<Comment>(comments.values());
	}
	public Comment getComment(long messageId,long commentId)
	{
		Map<Long,Comment> comments=messages.get(messageId).getComments();
		return comments.get(commentId);
		
	}
	public Comment addComment(long messageId,Comment comment)
	{
		Map<Long,Comment> comments=messages.get(messageId).getComments();
		 comment.setId(comments.size()+1);
		 comments.get(comment.getId(),comment);
		 return comment;
	}
	public Comment update(long messageId,Comment comment)
	{
		Map<Long,Comment> comments=messages.get(messageId).getComments();
		if(comment.getId()<=0)
		{
			return null;
		}
		comments.get(comment.getId(),comment);
		return comment;
	}
	public Comment delete(long messageId,long commentId)
	{
		Map<Long,Comment> comments=messages.get(messageId).getComments();
		return comments.remove(commentId);
	}


}
