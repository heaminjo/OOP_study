package study;

public class Design implements IDepartment{
	//�μ� �ν��Ͻ��� �Ķ���ͷ� ������ �ѱ���ְ�
	//�ν��Ͻ� ������ �Ҽ��ֵ��� �صд�.
	private static Design instance = new Design();
	@Override
	public void work() {
		System.out.println("�����κ� ���մϴ�.");
	}
	
	public static Design getInstance() {
		return instance;
	}
}
