package study;

public class Employee extends Person{
	
	//�������̽� ���� (DIP)
	private Department department; //�μ� �������̽�
	//ȸ��(���԰���)
	//ȸ����� ȸ��� ������ �����Ƿ� ����� �������ְ�����
	//������� ������ �ξ� �� ũ�� ������ Person�� ��ӹް�
	//Company�� ���԰���� �Ѵ�.
	private Company company;
	
	public Department getiDepartment() {
		return department;
	}
	


	public Employee(String name, int age, Department department, Company company) {
		super(name, age);
		this.department = department;
		this.company = company;
	}
	
	
	//�μ��� ��(OCP) 
	//�μ��� �þ�ų� ���� ������ ����Ǿ �ش� ����Ŭ������ ������ �������ʴ´�.
	public void work() {
		department.work();
	}
	
	//�μ���
	public void deptWork() {
		department.DeptWork();
	}
	
	
}
