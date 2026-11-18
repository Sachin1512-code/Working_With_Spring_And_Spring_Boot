package com.kodewala01.Bean;

/*
 * Now we will tell :: How to container use it 
 * 
 *                  --> We need to write confriguration file to tell everything ::
 *                  --> we will wrtie configuration in .java
 * 
 */
public class Employee {
	// it will exectued when classs will get loaded
	
	static {		
		System.out.println("Employee class loaded\n");
	}
	
	public Employee(){
		super();
	    System.out.println("Object created using zero argment contructor with default value\n");
		
	}
	
	private Integer eid;
    private String ename;
    private Integer eage;
    private String eaddress;
    
    
    
    // setter 
	public void setEid(Integer eid) {
		this.eid = eid;
		System.out.println("setter setting the given value:: for Employee ");
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setEage(Integer eage) {
		this.eage = eage;
	}
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}
	
	//getter
	
	public Integer getEid() {
		return eid;
	}
	public String getEname() {
		return ename;
	}
	public Integer getEage() {
		return eage;
	}
	public String getEaddress() {
		return eaddress;
	}
	
	//input print using system  ==>	
	
	@Override
    public String toString() {
		return "\nEmp id =[ " + eid + ", Emp Name= " + ename + ", Emp age= " + eage + "Emp Add= " + eaddress + " ] ";	
    }
}
