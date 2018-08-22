
public class RunnerFactorial {

	public static void main(String [] args)
	{
		Factorial test = new Factorial();
		System.out.println("Does it have a factorial, if so what is it?");
		System.out.println(test.backFactorial(3628800));
		
		System.out.println("Does it have a factorial, if so what is it?");
		System.out.println(test.backFactorial(479001600));
		
		System.out.println("Does it have a factorial, if so what is it?");
		System.out.println(test.backFactorial(6));
		
		System.out.println("Does it have a factorial, if so what is it?");
		System.out.println(test.backFactorial(18));
		
		System.out.println("Does it have a factorial, if so what is it?");
		System.out.println(test.backFactorial(-2));
		
		System.out.println("Does it have a factorial, if so what is it?");
		System.out.println(test.backFactorial(1));
		
		
	}
}
