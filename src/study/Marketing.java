package study;

public class Marketing implements IDepartment{
	private static Marketing instance = new Marketing();

	public static Marketing getInstance() {
		return instance;
	}
	@Override
	public void work() {
		System.out.println("������ ���մϴ�.");
	}
}
