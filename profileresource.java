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
import model.Profile;
import service.ProfileService;
import service.messageservice;
@Path("/profiles")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class profileresource {
	
	private ProfileService Profileserv=new ProfileService();
		@GET
		public List<Profile> getprofiles()
		{
			return Profileserv.getallprofiles();
		}
		@POST
		public Profile addprofile(Profile profile)
		{
			return Profileserv.addprofile(profile);
		
		}
		@GET
		@Path("/profilename")
		public Profile getprofile(@PathParam("profileName")String profileName)
		{
			return Profileserv.getprofile(profileName);
		
		}
		
		@PUT
		@Path("/profilename")
		public Profile updateprofile(@PathParam("profilename")String profileName,Profile profile)
		
		{
			profile.setProfileName(profileName);
			return Profileserv.updateprofile(profile);
		}
		@DELETE
		public Profile deleteProfile(Profile profile)
		{
			return Profileserv.deleteProfile(profile);
		}
		
	

}
