package edu.cofc.csci221.ds;

/**
This class used to get and set the value in the data instance variable.
@author Joseph Harwood
@since November 18, 2014
*/


public class Node {
	
	private double data;
	
	public Node(double m_data) {
		setData(m_data);
	}
	
	/**
	 * Sets the data variable to m_data.
	 * @param double m_data
	 */
	
//	Pre-conditions: none
//	Post-conditions: data equals m_data
	
	public void setData(double m_data) {
		this.data= m_data;
	}
	
	/**
	 * Returns data.
	 * @param none
	 */
	
//	Pre-conditions: none
//	Post-conditions: returns data
	public double getData() {
		return this.data;
	}

}
