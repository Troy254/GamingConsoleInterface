package oopinterface;

public class MarioGameRunner {

	public static void main(String[] args) {
		//MarioGame game = new MarioGame();
		ChessGame game = new ChessGame();
		game.up();
		game.down();
		game.left();
		game.right();
		
		
		GamingConsole[] gamingconsoles = {new MarioGame(),new ChessGame()};
		for(GamingConsole gamingconsole : gamingconsoles) {
			gamingconsole.up();
			gamingconsole.down();
			gamingconsole.left();
			gamingconsole.right();
			
		}
	}

}
