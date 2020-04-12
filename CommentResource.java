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
import javax.xml.stream.events.Comment;

import service.CommentService;
@Path("/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CommentResource {
	private static CommentService commentservice=new  CommentService() ;
	@GET
	public static List<Comment> getAllComment(@PathParam("messageId")long messageId)
	{
		return commentservice.getAllComment(messageId);
	}
	@POST
	public Comment addComment(@PathParam("messageId") long messageId,Comment comment)
	{
		return commentservice.addComment(messageId,comment);
	}
	@PUT
	@Path("/commentId")
	public Comment update(@PathParam("messageId")long messageId,@PathParam("commentId")long commentId,Comment comment)
	{
		comment.setId(commentId);
		return commentservice.update(messageId, comment);
		
	}
	@DELETE
	@Path("/commentId")
	public Comment deleteComment(@PathParam("messageId")long messageId,@PathParam("commentId")long commentId)
	
	{
		return commentservice.delete(messageId, commentId);
	}
	@GET
	@Path("/commentId")
	public Comment getMessage(@PathParam("messageId")long messageId,@PathParam("commentId")long commentId)
	{
	return commentservice.getComment(messageId,commentId);
	}

}
