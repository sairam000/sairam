package resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.Message;
import model.Profile;
import service.ProfileService;
import service.messageservice;
@Path("/profiles")
public class profileresource {
	
		ProfileService Profileserv=new ProfileService();
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		public List<Profile> getprofile()
		{
			return Profileserv.getallprofiles();
		}
		
	

}
