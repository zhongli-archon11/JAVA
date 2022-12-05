import java.util.Scanner;

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
class inquad
{
	public static void main(String args[])
	{
		Quadrilateral refvar;
			
		int num,x;
		Scanner s = new Scanner(System.in);
		System.out.print("Square, enter l: ");
		num = s.nextInt();
		Square l= new Square(num);
		refvar= l;
		System.out.println("Area of the square= "+refvar.ComputeArea());
		
		int num1, num2,y;
		Scanner r = new Scanner(System.in);
		System.out.print("Rectangle, enter l: ");
		num1 = s.nextInt();
		System.out.print("Rectangle, enter b: ");
		num2 = s.nextInt();
		
		Rectangle b= new Rectangle(num1,num2);
		refvar= b;
		System.out.println("Area of the rectangle= "+refvar.ComputeArea());
	}
};
                                                                 
