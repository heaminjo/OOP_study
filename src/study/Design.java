package study;

//�����κδ� �ٹ̱�� �׸��⸦ �Ҽ��ִ�. 
//�ش� ����� �ϴ� �������̽��� ���� �������ش�.
//(ISP)
public class Design implements IDepartment,Adorn,Drow{
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
	
	@Override
	public void drowing() {
		System.out.println("�����κΰ� �׸��� �׸��ϴ�.");
	}
	@Override
	public void adorn() {
		System.out.println("�����κΰ� �ٹӴϴ�.");
	}
}
