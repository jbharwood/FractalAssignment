package edu.cofc.csci221.ui;

//This class creates the points that will be used with the line class and the 
//TestGridUI class.
//@author Joseph Harwood
//@since October 8, 2014

public class Point {
	
	private int x= 0; 
	private int y= 0; 
	
//	Constructors
	
	public Point () {
		setX(0);
		setY(0);
	}
	
	public Point (Point point) {
		setPoint(point);
		}
	
	public Point(int x, int y) {
		setX(x);
		setY(y);
		
	
	}
	
//	Get Methods
	
//	Precondition: none.
//	Postcondition: returns x.
	public int getX() {
		return x;
	}
	
//	Precondition: none
//	Postcondition: returns y
	public int getY() {
		return y;
	}
	
//	Set Methods
	
//	Precondition: x must be greater than or equal to 0 and less than or equal to the 
//	Max Panel Width.
//	Postcondition: changes x to x if conditions are met, otherwise it changes to 0.
	public void setX(int x) {
		if (x >= 0 && x <= GridConstants.MAX_PANEL_WIDTH) {
			this.x= x;
		} else {
			this.x= 0;
			}
	}
	
	
//	Precondition: y must be greater than or equal to 0 and less than or equal to the 
//	Max Panel Width.
//	Postcondition: changes y to y if conditions are met, otherwise it changes to 0.
	public void setY(int y) {
		if (y >= 0 && y <= GridConstants.MAX_PANEL_HEIGHT) {
			this.y= y;
		} else {
			this.y= 0;
			}
	}
//	Precondition: p can't be null.
//	Postcondition: sets x and y to the x and y values in Point p.
	public void setPoint(Point p) {
		if (p != null) {                    
			setX(p.getX());
			setY(p.getY());
		}
		}
	
	

} // end Point class
