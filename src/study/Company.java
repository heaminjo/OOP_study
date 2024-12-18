package study;

//회사 클래스(포함관계)
//회사원은 사람이면서 회사를 다니므로 
//Person을 상속 받고 Company를 포함한다.
public class Company{
	
	private String companyName; //회사
	private String address; //위치
	private int sales; //회사 매출
	
	public Company(String companyName, String address, int sales) {
		this.companyName = companyName;
		this.address = address;
		this.sales = sales;
	}	
}
