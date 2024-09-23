/*Q3: Write a class Rectangle with attributes length and width.
  Use a constructor to set these values. Add methods to
 calculate the area and perimeter of the rectangle. Create an object to test your class*/
package hellojava;

public class Rectangle {
	int length,width;
	public Rectangle()
	{
		length=10;
		width =20;
	}
public void calcArea()
{
	int area= length * width;
	System.out.println("The total area is"+area);
}
public void calcPerimeter()
{ int perimeter= 2*(length+width);
	System.out.println("The Perimeter of rectangle is"+perimeter);;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rectangle r=new Rectangle();
r.calcArea();
r.calcPerimeter();

	}

}
