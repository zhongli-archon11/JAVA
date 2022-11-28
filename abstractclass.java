abstract class Quadrilateral
{
	double s1,s2,s3,s4;
	public Quadrilateral(double side1, double side2, double side3,double side4)
	{
		s1=side1;
		s2=side2;
		s3=side3;
		s4=side4;
	}
	public abstract double computation();
}

class Square extends Quadrilateral
{
	public Square(double side1)
	{
		super(side1, side2, side3, side4);
	}
	public double computeArea()
	{
		return(s1*s2);
	}
}

class Rectangle extends Quadrilateral
{
	public Rectangle(double side1, double side2)
	{
		super(side1, side2, side3, side4);
	}
	public double computeArea()
	{
		return(s1*s2);
	}
}
class abstractclass
{
	public static void main(String args[])
	{
		Quadrilateral refvar;
		Square s=new Square(10);
		Rectangle r=new Rectangle(10, 20);
		refvar=s;
		System.out.println("Area of the square= " + refvar.computeArea());
		refvar=r;
		System.out.println("Area of the rectangle= " + refvar.computeArea());
	}
}
