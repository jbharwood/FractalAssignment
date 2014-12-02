package edu.cofc.csci221.ui;

//This class creates the lines that will be used in addLine() in the GridUI. 
//@author Joseph Harwood
//@since October 8, 2014

public class Line {
	
	private Point start= null;
	private Point end= null;
	
//	Constructors
	
	public Line(Point start, Point end) {
		if (start != null && end != null) {
			this.start= start;
			this.end= end;
		}
	}
	
//	Get Methods
	
//	Precondition: none.
//	Postcondition: returns start.
	public Point getStart() {
		return start;
	}
	
//	Precondition: none.
//	Postcondition: returns end.
	public Point getEnd() { 
		return end;
	}
	
//	Set Methods
	
//	Precondition: start can't be null.
//	Postcondition: changes start to start.
	pubpackage edu.cofc.csci221.ui;

//This class creates the lines that will be used in addLine() in the GridUI. 
//@author Joseph Harwood
//@since October 8, 2014

public class Line {
	
	private Point start= null;
	private Point end= null;
	
//	Constructors
	
	public Line(Point start, Point end) {
		if (start != null && end != null) {
			this.start= start;
			this.end= end;
		}
	}
	
//	Get Methods
	
//	Precondition: none.
//	Postcondition: returns start.
	public Point getStart() {
		return start;
	}
	
//	Precondition: none.
//	Postcondition: returns end.
	public Point getEnd() { 
		return end;
	}
	
//	Set Methods
	
//	Precondition: start can't be null.
//	Postcondition: changes start to start.
	public void setStart(Point start) {
		if (start != null) {
			this.start= start;
		}
	}
	
//	Precondition: end can't be null.
//	Postcondition: changes end to end.
	public void setEnd(Point end) {
		if (end != null) {
			this.end= end;
		}
	}
	
//	Other Methods
	
//	Precondition: start and end can't be null.
//	Postcondition: returns true if they aren't null and false if they are null.
	public boolean isValid() {
		boolean valid= false;
		if (start != null && end != null) {
			valid= true;
		}
		return valid;
	}

} // end Line classlic void setStart(Point start) {
		if (start != null) {
			this.start= start;
		}
	}
	
//	Precondition: end can't be null.
//	Postcondition: changes end to end.
	public void setEnd(Point end) {
		if (end != null) {
			this.end= end;
		}
	}
	
//	Other Methods
	
//	Precondition: start and end can't be null.
//	Postcondition: returns true if they aren't null and false if they are null.
	public boolean isValid() {
		boolean valid= false;
		if (start != null && end != null) {
			valid= true;
		}
		return valid;
	}

} // end Line class
