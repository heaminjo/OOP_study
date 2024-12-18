package study;

public class Employee extends Company{
	
	private IDepartment iDepartment; //부서 인터페이스

	
	public Employee(String name, int age, String companyName, String address, int sales, IDepartment iDepartment) {
		super(name, age, companyName, address, sales);
		this.iDepartment = iDepartment;
	}


	@Override
	public String toString() {
		return "Employee [iDepartment=" + iDepartment + "]";
	}
	
	public void work() {
		iDepartment.work();
	}
	
	
}
