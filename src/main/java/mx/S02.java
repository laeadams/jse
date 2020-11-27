package mx;

import java.util.logging.Logger;

public class S02 {
    private static final Logger LOG = Logger.getGlobal();
    
    
    
    
    public static void main(String[] args) {
    	
    	// Exercise 1    
        double avgS = speed(10, 3);
        LOG.info(String.format("The average speed is %.2f m/s", avgS));
        
        //Exercise 2
        double dst = distance(1, 0, 0, 0);
        LOG.info(String.format("The distance between [x0,y0] and [x1,y1] is %.2f", dst));
        
        //Exercise 3
        double cil = engineCapacity(10, 15, 6);
        LOG.info(String.format("The engine capacity is %.2f cm^3", cil));
        
        //Exercise 4        
        int num = digitSum(500);
        LOG.info(String.format("The sum of the digits is %d ", num));
        
        //Exercise 5
        int punt = score(1,0);
        LOG.info(String.format("The score is %d ", punt));
        
	}
    
    

    /**
     * Average speed
     * 
     * @param distance in meters
     * @param time     in seconds
     * @return speed in meters per second
     */    
	public static double speed (double distance, double time) {
		//LOG.info(String.format("distance is %.2f m and time is %.2f s", distance, time));

//		if (time == 0.0) {
//			return Double.POSITIVE_INFINITY;
//		}
		
		if (time <0) {
			throw new ExUncheckedException("No negative values expected");
		}
		
		return distance / time;

	}

    /**
     * Distance between (x0, y0) and (x1, y1)
     * 
     * @param x0 first point x
     * @param y0 first point y
     * @param x1 second point x
     * @param y1 second point y
     * @return distance
     */
    public static double distance(int x0, int y0, int x1, int y1) {
    	
        return Math.sqrt(Math.pow(x0-x1, 2.0)+ Math.pow(y0-y1, 2.0));
    }

    /**
     * Engine capacity
     * 
     * @param bore   in mm
     * @param stroke in mm
     * @param nr     number of cylinders
     * @return the engine capacity in cm^3
     */
    public static double engineCapacity(double bore, double stroke, int nr) {
    	
        return nr * stroke * Math.PI * Math.pow(bore/2, 2) *1E-3;
    }

    /**
     * Add up all the digits in an integer
     * 
     * @param value
     * @return sum of digits
     */
    public static int digitSum(int value) {
    	
    	value = Math.abs(value);
    	int result = value % 10;
    	
    	while (value !=0) {		
    		value /= 10;
    		result += value % 10;
    	}
    	return result;
    		
    	}
    

    /**
     * Score based on distance from (0, 0) [1, 5, 10] -> [10, 5, 1, 0]
     *
     * @param x
     * @param y
     *
     * @return
     */
    public static int score(double x, double y) {
    	
    	double dist = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
    	
    	if (dist <= 1.0) {
    		return 10;
    	} else if (dist <=5){
    		return 5;
    	} else if (dist <= 10) {
    		return 1;
    	} else {
    		return 0;
    	}

    }
}
