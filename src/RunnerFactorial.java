
public class RunnerFactorial {

	public static void main(String [] args)
	{
		Factorial test = new Factorial();
		System.out.println("Factorial: Input 3628800");
		System.out.println(test.backFactorial(3628800));
		
		System.out.println("Factorial: Input 4.....");
		System.out.println(test.backFactorial(479001600));
		
		System.out.println("Factorial: Input 6");
		System.out.println(test.backFactorial(6));
		
		System.out.println("Factorial: Input 18");
		System.out.println(test.backFactorial(18));
		
	}
}
