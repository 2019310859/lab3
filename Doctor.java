package jiekou;

public class Doctor implements Student,Teacher{
	String ID;
	String Name;
	String Sex;
	String Age;
	float Salaly;
	float Pay;
	public Doctor(String ID,String Name,String Sex,String Age)
	{
		this.ID = ID;
		this.Name = Name;
		this.Sex = Sex;
		this.Age = Age;
	}
	public String toString() {
		return "��ţ�"+this.ID+"  ����: "+this.Name+"  �Ա�: "+this.Sex+"  ����: "+this.Age;
	}
	public void setPay(float Pay){
		this.Pay = Pay;
		System.out.println("Ӧ��ѧ�ѣ�"+this.Pay);
	}
	public void getPay(float Pay){
		this.Pay = Pay;
		System.out.println("����ѧ�ѣ�"+this.Pay);
	}
	public void setSalaly(float Salaly){
		this.Salaly = Salaly;
		System.out.println("Ӧ�칤�ʣ�"+this.Salaly);
	}
	public void getSalaly(float Salaly){
		this.Salaly = Salaly;
		System.out.println("���칤�ʣ�"+this.Salaly);
	}
}
