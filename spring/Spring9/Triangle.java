package triangledemo;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean, DisposableBean {
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

public void draw() {

	System.out.println("Point A = (" + getPointA().getX() + "," + getPointA().getY() + ")");
	System.out.println("Point B = (" + getPointB().getX() + "," + getPointB().getY() + ")");
	System.out.println("Point C = (" + getPointC().getX() + "," + getPointC().getY() + ")");
	
}



  public void afterPropertiesSet() throws Exception {
	  // TODO Auto-generated
  System.out.println("InitialisingBean init method called for triangle"); }
  public void destroy() throws Exception { 
	  // TODO Auto-generated method stub
  System.out.println("DisposableBean destroy method called for triangle");
  
  }
 
public void myInit() {
	 System.out.println("my init method called for triangle");
	 }
public void cleanUp() {
	 System.out.println("my destroy method called for triangle");
	 
}
@PostConstruct
		public void start(){
		      System.out.println("In postconstruct  init.");
		}
@PreDestroy
		public void end() {
		      System.out.println("In predestroy destroy.");

}

}
