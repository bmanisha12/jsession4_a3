
public class employee {
int eid;
String ename, designation;
double sal;


	public int getEid() {
	return eid;
}


public void setEid(int eid) {
	this.eid = eid;
}


public String getEname() {
	return ename;
}


public void setEname(String ename) {
	this.ename = ename;
}


public String getDesignation() {
	return designation;
}


public void setDesignation(String designation) {
	this.designation = designation;
}


public double getSal() {
	return sal;
}


public void setSal(double sal) {
	this.sal = sal;
}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		employee e = new employee();
		e.setEid(123);
		e.setEname("Manisha");
		e.setDesignation("CEO");
		e.setSal(980000);
System.out.println("Employee ID: "+e.getEid());
System.out.println("Employee Name: "+e.getEname());
System.out.println("Employee Designation: "+e.getDesignation());
System.out.println("Employee Salary: "+e.getSal());
	}

}
