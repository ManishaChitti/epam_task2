/*
 * program estimates cost of construction based on given parameters
 * material: standard(1)
 * material: above standard(2)
 * material: high standard(3)
 * 
 * @author manisha
 */ 
public class Estimator {
	public double estimateCost(int material,double area,boolean isAutomated)
	{
		int cost=0;
		if(material==1)
			cost=1200;
		if(material==2)
			cost=1500;
		if(material==3)
			cost=1800;
		if(material==3 && isAutomated)
			cost=2500;
		return cost*area;
	}

}
