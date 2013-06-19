package org.sunil.model;

/**
 * 
 * @author Sunil Kalyanpur
 *
 */
public class Employee {
	//two member variables
	private int id;
	private String name;

	// an empty constructor

	public Employee(){
		super();
	}

	/**
	 * @param id
	 * @param name
	 */
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}




}
