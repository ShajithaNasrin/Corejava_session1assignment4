class Ascii
{
	public static void main(String args[])
	{
		int i = 65;                          //initialising i value for int
		do
		{
		char c= (char)i;		     //Type casting the value,from int to char for 							display ascii values and their characters.
		System.out.println(" " + i + "-"+c); 
		i++;				     //incrementing the value for i
		}while(i<=90);
	}
}