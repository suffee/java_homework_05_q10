package homework_5_q10;
import Shape.*;
public class homework_5_q10 {

	public static void main(String[] args) {
		
		circle 			c	=	new	 circle(4);
		rectangle 	r	=	new	rectangle(4,3);
		
		showArea(c);
		showArea(r);
	}
	
	public static void showArea(Shape s) {
		
		double area =s.area();
		System.out.println("The area of the shape is "+area);		
	
	}
}
