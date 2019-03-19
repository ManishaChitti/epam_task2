/*
 * calculates simple interest and compound interest for given principle,time period,rate of interest 
 * @author manisha
 */
public class SimpleInterestAndCompoundInterest {
	/*
	 * returns simple interest for given principle,time period,rate of interest 
	 */
	public double simpleInterest(double principle,double time,double rate)
	{
		return (principle*rate*time);
	}
	/*
	 * returns compound interest for given principle,time period,rate of interest 
	 */
	public double compoundInterest(double principle,double time,double rate)
	{
		return principle*(Math.pow((1+rate/100),time));
	}

}
