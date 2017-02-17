package Shape;
public class circle implements Shape{
	
	private double radius ;
	
			public circle(double radius){
				
				this.radius=radius;
			}
			
			public circle(){
				
				this.radius=0;
			}
			
			public void setRadius(double radius){
				
				this.radius=radius;		
			}
			public double getRadius(){
				
				return this.radius;		
			}
			
	public double area(){
		
		return Math.PI*Math.pow(this.radius, 2);	
		
	}		
}
