package study;

public class Design implements IDepartment{
	//부서 인스턴스를 파라미터로 언제든 넘길수있게
	//인스턴스 생성을 할수있도록 해둔다.
	private static Design instance = new Design();
	@Override
	public void work() {
		System.out.println("디자인부 일합니다.");
	}
	
	public static Design getInstance() {
		return instance;
	}
}
