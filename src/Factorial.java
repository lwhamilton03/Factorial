
public class Factorial {

	public String backFactorial(int num)
	{
		double result = num; 
		int increment = 2;
		
		while (result > 1)
		{
			result = result / increment; 
			increment++; 
			System.out.println(result);
			
			if (result == 1)
			{
				return "= " + (increment -1) + " !";
			}
			
		}
		return "NONE";
		 
	}
}
