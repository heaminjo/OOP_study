package study;

public class Marketing implements Department{
	private static Marketing instance = new Marketing();

	public static Department getInstance() {
		return instance;
	}
	
	@Override
	public void DeptWork() {
		
	}
	@Override
	public void work() {
		System.out.println("영업부 일합니다.");
	}
}
