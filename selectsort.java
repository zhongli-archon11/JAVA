import java.io.DataInputStream;

class selectsort
{
	public static void main(String args[])
	{
		DataInputStream in=new DataInputStream(System.in);
		int list[]=new int[5];
		int i;
		try
		{
			for(i=0;i<5;i++)
			{
				System.out.print("Enter element: ");
				list[i]=Integer.parseInt(in.readLine());
			}
			System.out.println("Given list: ");
			for(i=0;i<5;i++)
			{
				System.out.println(" "+list[i]);
			}
			System.out.println("\n");
			for(i=0;i<(5-1);i++)
			{
				int min=i;
				for(int j=i+1;j<5;j++)
					if(list[min]>list[j])
					{
						min=j;
					}
					if(min!=i)
					{
						int temp=list[min];
						list[min]=list[i];
						list[i]=temp;
					}
			}
			System.out.println("Sorted list: ");
			for(i=0;i<5;i++)
			{
				System.out.println(" "+list[i]);
			}
			System.out.println("\n");
		}
		catch(Exception e){}
	}
}

