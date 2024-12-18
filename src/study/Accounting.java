package study;

public class Accounting implements IDepartment{
	private static Accounting instance = new Accounting();

	public static Accounting getInstance() {
		return instance;
	}
	@Override
	public void work() {
		System.out.println("회계부 일합니다.");
	}
}
