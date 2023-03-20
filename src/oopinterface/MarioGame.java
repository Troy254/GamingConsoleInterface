package oopinterface;

public class MarioGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("jump up");
		
	}

	@Override
	public void down() {
		System.out.println("Enter Chimney");
		
	}

	@Override
	public void right() {
		System.out.println("move forward");
		
	}

	@Override
	public void left() {
		System.out.println("go back");
		
	}

}
