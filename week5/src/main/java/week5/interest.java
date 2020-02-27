package week5;
import org.apache.logging.log4j.LogManager;
public class interest 
{	
	private static final org.apache.logging.log4j.Logger a =LogManager.getLogger(interest.class);
	double simple(double p,double r,double t)
	{
		a.debug( (p*t*r)/100);
		return (p*t*r)/100;
	}
	double compound(double p,double r,double t)
	{
		double d= (p*Math.pow(1+r/100,t));
		a.debug( d);
		return d;
	}
}
