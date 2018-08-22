
public class Factorial {

	public String backFactorial(int num)
	{
		double result = num; 
		int increment = 2;
		
		if (num == 1)
		{
			return "1!";
		}
		
		while (result > 1)
		{
			result = result / increment; 
			
			if (result != (int)result)
			{
				return "NONE";
			}
		//	System.out.println(result);
			
			if (result == 1)
			{
				return "= " + increment  + "!";
			}
			
			increment++; 
		}
		return "NONE";
		 
	}
}
