package info.java8.prog;

public class Employee {
	private int eno;
	private String ename;
	private String location;
	
	
	public Employee(int eno, String ename, String location) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.location = location;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", location=" + location + "]";
	}

}
