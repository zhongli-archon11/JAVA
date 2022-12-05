
abstract class Quadrilateral
{
	double S1, S2, S3, S4;
	public Quadrilateral(double side1, double side2, double side3, double side4)
	{
		S1 = side1;
		S2 = side2;
		S3 = side3;
		S4 = side4;
       }
	public abstract double ComputeArea();
};
class Square extends Quadrilateral
{
	public Square(double side1)
	{
		super(side1, side1, side1, side1);
	}
	public double ComputeArea()
	{
		return(S1*S1);
	}
};
class Rectangle extends Quadrilateral
{
	public Rectangle(double side1, double side2)
	{
		super(side1, side2, side1, side2);
	}
	public double ComputeArea()
	{
		return(S1 * S2);
	}
};
class abstractclass
{
	public static void main(String args[])
	{
		Quadrilateral refvar;
		Square s= new Square(10);
		Rectangle r= new Rectangle(10, 20);
		refvar= s;
		System.out.println("Area of the square= "+refvar.ComputeArea());
		refvar= r;
		System.out.println("Area of the recatngle= "+refvar.ComputeArea());
	}
};
                                                                 
