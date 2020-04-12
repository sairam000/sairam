package exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;

import model.errormessage;

public class anyexception implements ExceptionMapper<Throwable> {

	@Override
	public Response toResponse(Throwable exception) {
		// TODO Auto-generated method stub
		errormessage error=new errormessage(exception.getMessage(),404,"http://sairam");
		return Response.status(Status.ACCEPTED)
						.entity(error)
						.build();
	}

}
