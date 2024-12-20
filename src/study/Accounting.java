package study;

public class Accounting implements Department,Calculate{
	private static Department instance = new Accounting();

	public void work() {
		System.out.println("회계부 일합니다.");
	}

	@Override
	public void DeptWork() {
		calutate();
	}
	@Override
	public void calutate() {
		System.out.println("계산 중");	
	}
	public static Department getInstance() {
		return instance;
	}
}
