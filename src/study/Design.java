package study;

//�����κδ� �ٹ̱�� �׸��⸦ �Ҽ��ִ�. 
//�ش� ����� �ϴ� �������̽��� ���� �������ش�.
//(ISP)
public class Design implements Department,Adorn,Drow{
	//�μ� �ν��Ͻ��� �Ķ���ͷ� ������ �ѱ���ְ�
	//�ν��Ͻ� ������ �Ҽ��ֵ��� �صд�.
	
	private static Design instance= new Design(); 
	
	//�ν��Ͻ� ��ȯ
	public static Department getInstance() {
		return instance;
	}
	
	@Override
	public void work() {
		System.out.println("�����κ� ���մϴ�.");
	}
	
	@Override
	public void drowing() {
		System.out.println("�����κΰ� �׸��� �׸��ϴ�.");
	}
	@Override
	public void adorn() {
		System.out.println("�����κΰ� �ٹӴϴ�.");
	}
	
	@Override
	public void DeptWork() {
		drowing();
		adorn();
	}
	
}
