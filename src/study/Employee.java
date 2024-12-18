package study;

public class Employee extends Person{
	
	//인터페이스 의존 (DIP)
	private IDepartment iDepartment; //부서 인터페이스
	//회사(포함관계)
	//회사원은 회사와 관련이 있으므로 상속을 받을수있겠지만
	//사람과의 관련이 훨씬 더 크기 때문에 Person을 상속받고
	//Company는 포함관계로 한다.
	private Company company;
	
	public IDepartment getiDepartment() {
		return iDepartment;
	}
	


	public Employee(String name, int age, IDepartment iDepartment, Company company) {
		super(name, age);
		this.iDepartment = iDepartment;
		this.company = company;
	}



	@Override
	public String toString() {
		return "Employee [iDepartment=" + iDepartment + "]";
	}
	
	//부서의 일(OCP) 
	//부서가 늘어나거나 일의 내용이 변경되어도 해당 구현클래스의 변동이 생기지않는다.
	public void work() {
		iDepartment.work();
	}
	
	
}
