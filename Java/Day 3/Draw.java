class Circle{
	private float radius, area;
	
	public void Circle(){
		r=0;
	}
	
	public void Circle(int radius){
		this.radius=radius;
		System.out.println(" ");
	}
	
	public double calculateArea(int radius){
		float area;
		area = Math.PI*radius*radius;
		return area;
	}
	
	public void draw(){
			System.out.println("Circle is Drawn...")
	}
	
	public void setRadius(float radius){
		this.radius = radius;
	}
	
	public int getRadius(){
		return radius;
	}		
}
