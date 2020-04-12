package model;

public class errormessage {
	private String errormesssage;
	private int errorcode;
	private String documentation;
	public errormessage()
	{
		
	}
	public errormessage(String errormesssage, int errorcode, String documentation) {
		super();
		this.errormesssage = errormesssage;
		this.errorcode = errorcode;
		this.documentation = documentation;
	}
	public String getErrormesssage() {
		return errormesssage;
	}
	public void setErrormesssage(String errormesssage) {
		this.errormesssage = errormesssage;
	}
	public int getErrorcode() {
		return errorcode;
	}
	public void setErrorcode(int errorcode) {
		this.errorcode = errorcode;
	}
	public String getDocumentation() {
		return documentation;
	}
	public void setDocumentation(String documentation) {
		this.documentation = documentation;
	}
	

}
