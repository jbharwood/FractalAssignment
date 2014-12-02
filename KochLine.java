package edu.cofc.csci221.ui;

/**
This class uses the Line class to make KochLines and compute the fractal equations.
@author Joseph Harwood
@since December 1, 2014
*/

public class KochLine extends Line{
	
	private Point p1= null;
	private Point p2= null;
	private Point p3= null;
	private Point p4= null;
	private Point p5= null;
	
	public KochLine(Point start, Point end) {
		super(start, end);
		start= super.getStart();
		p1= start;
		end= super.getEnd();
		p5= end;
	}
	
	/**
	 * Gets lineA
	 * @param none
	 */
	
//	Pre-conditions: none
//	Post-conditions: returns lineA
	
	public KochLine getLineA() {
		KochLine lineA= new KochLine(p1, p2);
		return lineA;
	}
	
	/**
	 * Gets lineB
	 * @param none
	 */
	
//	Pre-conditions: none
//	Post-conditions: returns lineB
	
	public KochLine getLineB() {
		KochLine lineB= new KochLine(p2, p3);
		return lineB;
	}
	
	/**
	 * Gets lineC
	 * @param none
	 */
	
//	Pre-conditions: none
//	Post-conditions: returns lineC
	
	public KochLine getLineC() {
		KochLine lineC= new KochLine(p3, p4);
		return lineC;
	}
	
	/**
	 * Gets lineD
	 * @param none
	 */
	
//	Pre-conditions: none
//	Post-conditions: returns lineD
	
	public KochLine getLineD() {
		KochLine lineD= new KochLine(p4, p5);
		return lineD;
	}
	
	/**
	 * Computes the fractal equations
	 * @param none
	 */
	
//	Pre-conditions: none
//	Post-conditions: void. allows the user to make points 2, 3 and 4
	
	public void computeFractal() {
		int x51= p5.getX() - p1.getX();
		int y51= p5.getY() - p1.getY();
		int x2= p1.getX() + (x51/3);
		int y2= p1.getY() + (y51/3);
		int x3= (int) (((p1.getX() + p5.getX())/2) + ((Math.sqrt(3) * (p1.getY() - p5.getY())/6))); 
		int y3= (int) (((p1.getY() + p5.getY())/2) + ((Math.sqrt(3) * (p5.getX() - p1.getX())/6)));
		int x4= p1.getX() + ((2 * x51)/3);
		int y4= p1.getY() + ((2 * y51)/3);
		p2= new Point(x2, y2);
		p3= new Point(x3, y3);
		p4= new Point(x4, y4);
		
	}
	
	/**
	 * tells if a KochLine is valid according to a condition
	 * @param none
	 */
	
//	Pre-conditions: each line has to be valid according to the Line class
//	Post-conditions: returns a boolean
	
	public boolean isKochLineValid() {
		boolean valid= false;
		if (getLineA().isValid()== true && getLineB().isValid()== true && 
		getLineC().isValid()== true && getLineD().isValid()== true) {
			valid= true;
		} return valid;
	}

}
