package study;

//ȸ�� Ŭ����(���԰���)
//ȸ����� ����̸鼭 ȸ�縦 �ٴϹǷ� 
//Person�� ��� �ް� Company�� �����Ѵ�.
public class Company extends Person{
	
	private String companyName; //ȸ��
	private String address; //��ġ
	private int sales; //ȸ�� ����
	
	public Company(String name, int age, String companyName, String address, int sales) {
		super(name, age);
		this.companyName = companyName;
		this.address = address;
		this.sales = sales;
	}	
}
