package study;

public class Accounting implements Department,Calculate{
	private static Department instance = new Accounting();

	public void work() {
		System.out.println("ȸ��� ���մϴ�.");
	}

	@Override
	public void DeptWork() {
		calutate();
	}
	@Override
	public void calutate() {
		System.out.println("��� ��");	
	}
	public static Department getInstance() {
		return instance;
	}
}
