import java.io.*;
class super1
{
    int x;
    super1(int x)
    {
        this.x=x;
    }
    void display()
    {
        System.out.println("Super x: "+x);
    }
}

class sub1 extends super1
{
    int y;
    sub1(int x, int y)
    {
        super(x);
        this.y=y;
    }
    void display()
    {
        System.out.println("Super x: "+x);
        System.out.println("Sub y: "+y);
    }
}

class override2
{
    public static void main(String args[])
    {
        sub1 s1=new sub1(10,20);
        s1.display();
    }
}
