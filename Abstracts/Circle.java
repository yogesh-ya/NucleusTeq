import abc.Shape;
public class Circle
{
	public float perimeter(float r)
	{
		return (float)(2*3.14*r);
	}
	public float area(float r)
	{
		return (float)(3.14*r*r);
	}
	public static void main(String ar[])
	{
		Circle circle=new Circle();
	System.out.println("Perimeter OF Cirlce is:  "+circle.perimeter((float)10));
	System.out.println("Area of Circle is: "+circle.area((float)10));
	}
}