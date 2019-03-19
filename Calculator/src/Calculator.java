/*
 * program calculates addition,multiplication,division of two numbers
 * @author manisha
 */
public class Calculator {
	/*
	 * addition of two numbers
	 */
	public int addition(int a,int b)
	{
		return a+b;
	}
	/*
	 * multiplication of two numbers
	 */
	public int multiplication(int a,int b)
	{
		return a*b;
	}
	/*
	 * division of two numbers
	 */
	public double division(double a,double b)
	{
		if(b==0)
			throw new ArithmeticException("division by zero is not finite");
		else
		return a/b;
	}

}
