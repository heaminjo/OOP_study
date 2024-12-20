package study;

public class Main {

	public static void main(String[] args) {
		Company company = new Company("»ïÀü","¼­¿ï",100000);
		Employee employee = new Employee("È«±æµ¿",20,Design.getInstance(),company);
		
		employee.work();
		employee.deptWork();
	}

}
