package study;

public class Main {

	public static void main(String[] args) {
		Company company = new Company("����","����",100000);
		Employee employee = new Employee("ȫ�浿",20,Design.getInstance(),company);
		
		employee.work();
		employee.deptWork();
	}

}
