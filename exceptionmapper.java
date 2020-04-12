package exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import model.errormessage;
@Provider
public class exceptionmapper implements ExceptionMapper<datanotfoundexception> {

	@Override
	public Response toResponse(datanotfoundexception exception) {
		// TODO Auto-generated method stub
		errormessage error=new errormessage(exception.getMessage(),404,"http://sairam");
		return Response.status(Status.NOT_FOUND)
						.entity(error)
						.build();
	}

}
