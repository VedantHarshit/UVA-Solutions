import java.io.*;


public class Main
{
	public static void main(String[] args)throws IOException
	{ 
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(input.readLine());

		String[] names = new String[n];

		for(int i = 0 ; i < n ; i++)
			names[i] = input.readLine();

		int sp = 0;

		String[] song = {"Happy", "birthday", "to", "you", "Happy", "birthday", "to", "you", "Happy", "birthday", "to", "Rujia", "Happy", "birthday", "to", "you"};


		for(int i = 0 ; i < n ; i++)
		{
			System.out.println(names[i] + ": " + song[sp++]);
			sp %= song.length;
		}

		if(sp != 0)
		{
			int index = 0;
			while(sp < song.length)
			{
				System.out.println(names[index++] + ": " + song[sp++]);
				index %= n;
			}
		}
	} 
}
