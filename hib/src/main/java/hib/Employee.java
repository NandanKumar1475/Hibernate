package hib;

public class Employee {
	private int id;
	private String name;
	private String dept;
	private String clgname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getClgname() {
		return clgname;
	}
	public void setClgname(String clgname) {
		this.clgname = clgname;
	}
	@Override
	public String toString() {
	    return "Employee [id = " + id + ", name = " + name + ", dept = " + dept + ", clgname = " + clgname + "]";
	}


	 

}
