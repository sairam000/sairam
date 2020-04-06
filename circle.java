package firstspring;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
@Component
public class circle implements shape{
	private Point Center;
	public Point getCenter() {
		return Center;
	}
	/*@Required*/
	@Autowired
	@Resource(name="pointA")
	public void setCenter(Point center) {
		Center = center;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("circle drawn");
		System.out.println("center =(" + getCenter().getX() + ","+getCenter().getY()+")");
		
	}
	

}