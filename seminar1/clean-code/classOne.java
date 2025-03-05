// package ...;

public class classOne {
	
	public float calculate(int n, float s, int period)
	  {
	    float result = 0;
	    float value = (period > 10) ? (float)30/100 : (float)period/100; 
	    if (n == 1)
	    {
	    	result = s;
	    }
	    else if (n == 2)
	    {
	    	result = (s - (0.1f * s)) - value * (s - (0.1f * s));
	    }
	    else if (n == 3)
	    {
	    	result = (s - (0.25f * s)) - value * (s - (0.25f * s));
	    }
	    else if (n == 4)
	    {
	    	result = (s - (0.35f * s)) - value * (s - (0.35f * s));
	    }
	    return result;
	  }

}