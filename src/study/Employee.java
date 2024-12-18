package study;

public class Employee extends Person{
	
	//�������̽� ���� (DIP)
	private IDepartment iDepartment; //�μ� �������̽�
	//ȸ��(���԰���)
	//ȸ����� ȸ��� ������ �����Ƿ� ����� �������ְ�����
	//������� ������ �ξ� �� ũ�� ������ Person�� ��ӹް�
	//Company�� ���԰���� �Ѵ�.
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
	
	//�μ��� ��(OCP) 
	//�μ��� �þ�ų� ���� ������ ����Ǿ �ش� ����Ŭ������ ������ �������ʴ´�.
	public void work() {
		iDepartment.work();
	}
	
	
}
