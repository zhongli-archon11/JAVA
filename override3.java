class A
{
    int i,j;
    A(int a, int b)
    {
        i=a;
        j=b;
    }
    void show()
    {
        System.out.print("i= "+i);
        System.out.println("    j= "+j);
    }
}

class B extends A
{
    int k;
    B(int a,int b,int c)
    {
        super(a,b);
        k=c;
    }
    void show(String string)
    {
        System.out.println("k= "+k);
    }
}

class override3
{
    public static void main(String args[])
    {
        B subob=new B(1,2,3);
        subob.show("This is K: ");
        subob.show();
    }
}
