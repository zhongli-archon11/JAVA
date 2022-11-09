import java.io.*;

class bubble
{
	public static void main(String args[]) throws IOException
	{
		int n;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str[]=new String[100];
		System.out.println("Enter string: ");
		System.out.println("Enter 'STOP' to quit: ");
		for( n=0;n<100;n++)
		{
			str[n]=br.readLine();
			if(str[n].equals("STOP")) break;
		}
		String temp=null;
		System.out.println("Input strings are: ");
		for(n=0;n<100;n++)
		{
			if(str[n].equals("STOP")) break;
			System.out.println(str[n]);
		}
		for(int item=0;item<n;item++)
			for(int j=0;j<n-item-1;j++)
				if(str[j].compareTo(str[j+1])>0)
				{
					temp=str[j];
					str[j]=str[j+1];
					str[j+1]=temp;
				}
				System.out.println("Reordered list: ");
				for(int i=0;i<n;i++)
					System.out.println(str[i]);
	}
}
