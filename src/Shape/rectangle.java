package Shape;

public class rectangle implements Shape{
	
	private int heighth;
	private int width;
	
	public rectangle(){
		
		this.heighth=0;
		this.width=0;
	}
	
	public rectangle(int heighth,int width){
		
		this.heighth=heighth;
		this.width=width;
	}
	//mutator
		public void setHeigth(int heigth){
		
			this.heighth=heigth;		
		}
	
		public void setWidth(int width){
		
			this.width=width;		
		}
	
	//accessor
		public int getHeigth(){
			
			return this.heighth;		
		}
		public int getWidth(){
			
			return this.width;		
		}
	
		public double area(){
			
			return width*heighth;
			
		}		
}
