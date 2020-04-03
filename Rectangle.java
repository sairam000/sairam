package firstspring;

public class Rectangle {
	private String type;
	private int breadth;
	public int getBreadth() {
		return breadth;
	}


	public Rectangle(String type)
	{
		this.type=type;
	}
	public Rectangle(int breadth)
	{
		this.breadth=breadth;
	}
	public Rectangle(String type,int breadth)
	{
		this.type=type;
		this.breadth=breadth;
		
	}
	
	public void draw()
	{
		System.out.println(getType() + " are drawn of length" + getBreadth());
	}

	public String getType() {
		return type;
	}

	//public void setLength(String length) {
		//this.length = length;
	//}
	
	

}
