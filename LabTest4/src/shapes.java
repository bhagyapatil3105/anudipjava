
public interface shapes {
	
	
	abstract void RectangleArea(int length,int width); 
	abstract void SquareArea(int area);
	abstract void CircleArea(int radius);
}
 class Area implements shapes{

public void RectangleArea(int length,int width) 
{
	int area=length*width;
	System.out.println("Area of Rectangle : "+area);
} 
public void SquareArea(int side) 
{
	int area=side*side;
	System.out.println("Area of Square : "+area);
}
public void CircleArea(int radius) 
{float area=2.314f*(radius*radius);
System.out.println("Area of Circle : "+area);
}
}
