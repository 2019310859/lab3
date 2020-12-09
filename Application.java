package jiekou;

import java.util.*;

public class Application {
	public static void main(String args[]){
		for(int i = 1;i==1;i++) {
			System.out.println("请输入你的编号：");
			Scanner in = new Scanner(System.in);
			int a=in.nextInt();
			if(a == 1) {
				Doctor people1;
				people1 =new Doctor("1","张三","男","23");
				System.out.println(people1.toString());
				people1.getPay(0);
				people1.setPay(Student.setPay1);
				people1.getSalaly(10000);
				people1.setSalaly(Teacher.setSalaly1);
				Text T1;
				T1=new Text();
				T1.Sub(Teacher.setSalaly1,Student.setPay1);
				in.close();
			}
			else if(a == 2) {
				Doctor people2;
				people2 =new Doctor("2","李四","女","22");
				System.out.println(people2.toString());
				people2.getPay(2500);
				people2.setPay(Student.setPay2);
				people2.getSalaly(15000);
				people2.setSalaly(Teacher.setSalaly2);
				Text T2;
				T2=new Text();
				T2.Sub(Teacher.setSalaly2,Student.setPay2);
				in.close();
			}
			else {
				System.out.println("请输入正确编号！");
				i=i-1;
			}
		}
	}
}
