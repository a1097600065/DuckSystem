package model;
 
// 飞行接口的implement类——用火箭飞
public class FlyWithRocket implements FlyBehavior{
	@Override
	public void fly() {
		System.out.println("火箭飞");
	}
}
