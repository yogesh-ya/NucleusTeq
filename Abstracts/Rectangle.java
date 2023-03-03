import abc.Shape;
public class Rectangle
{
	public float perimeter(float length,float breadth)
	{
		return (float)(2*(length*breadth));
	}
	public float area(float length,float breadth)
	{
		return (float)(length*breadth);
	}
	public static void main(String ar[])
	{
		Rectangle rectangle=new Rectangle();
	System.out.println("Perimeter of Rectangle is: "+rectangle.perimeter((float)10,(float)10));
	System.out.println("Area of Rectangle is: "+rectangle.area((float)10,(float)10));
	}
}