package study;

//디자인부는 꾸미기와 그리기를 할수있다. 
//해당 기능을 하는 인터페이스를 각각 가져와준다.
//(ISP)
public class Design implements IDepartment,Adorn,Drow{
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
	
	@Override
	public void drowing() {
		System.out.println("디자인부가 그림을 그립니다.");
	}
	@Override
	public void adorn() {
		System.out.println("디자인부가 꾸밉니다.");
	}
}
