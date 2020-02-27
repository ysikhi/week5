package week5;


import org.apache.logging.log4j.LogManager;
public class Houseconcost 
{
	private static final org.apache.logging.log4j.Logger LOGGER =LogManager.getLogger(Houseconcost.class);	/*Here "ms" means materials of standard and input can be given from 1 to 4 numbers 
	example if ms=1 means materials of standard is standard materials and ms=2 means materials of 
	standard is above standard materials.and variable "s" is whether we need fully automation or not
	the input is in the format of boolean*/
	double est(int ms,float area,boolean s)
	{
		if(area<=0)
		{
			LOGGER.warn("area is zero");
		}
		if(ms==1&&s==false)
		{
			LOGGER . debug("Total Cost"+ area*1200);
			return area*1200;
		}
		else if(ms==2&&s==false)
		{
			LOGGER . debug("Total Cost"+ area*1500);
			return area*1500;
		}
		else if(ms==3&&s==false)
		{
			LOGGER . debug("Total Cost"+ area*1800);
			return area*1800;
		}
		else if(ms==4&&s==true)
		{
			LOGGER . debug("Total Cost"+ area*2500);
			return area*2500;
		}
		return 0;
	}
}
