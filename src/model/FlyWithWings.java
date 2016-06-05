package model;
 
// 飞行接口的implement类--用翅膀飞
public class FlyWithWings implements FlyBehavior{
	@Override
	public void fly() {
		System.out.println("翅膀飞");
	}
}
