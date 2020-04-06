package firstspring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle{
	private Point pointA;
	private Point pointB;
	private Point pointC;
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	public void draw()
	{
		System.out.println("point A =(" + getPointA().getX() + ","+getPointA().getY()+")");
		System.out.println("point B =(" + getPointB().getX() + ","+getPointB().getY()+")");
		System.out.println("point C =(" + getPointC().getX() +","+getPointC().getY()+")");
	}
	
	/*@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("init method called for triangle");
		
		
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy method called for triangle");
		
		
	}*/
	public void Init()
	{
		System.out.println("init method called for triangle");
	}
	public void Destroy()
	{
		System.out.println("destroy method called for triangle");
	}
	

}
