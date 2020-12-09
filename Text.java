package jiekou;

public class Text{
	float a,x,y;
	public void Sub(float x,float y){
		this.x = x;
		this.y = y;
		float a=(x-5000-y);
		System.out.println("应交税："+0.03*a+"元");
	}
}
