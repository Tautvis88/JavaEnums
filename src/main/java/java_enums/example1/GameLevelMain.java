package java_enums.example1;

public class GameLevelMain {

	public static void main(String[] args) {

		playGame(GameLevel.EASY);
		playGame(GameLevel.NORMAL);
		playGame(GameLevel.HARD);
		playGame(GameLevel.EXPERT);

	}

	private static void playGame(GameLevel gameLevel) {
		switch (gameLevel) {
			case EASY:
				System.out.println("You're playing at the EASY level. It's a piece of cake!");
				break;
			case NORMAL:
				System.out.println("You're playing at the NORMAL level. Things are getting interesting.");
				break;
			case HARD:
				System.out.println("You're playing at the HARD level. It's quite challenging!");
				break;
			case EXPERT:
				System.out.println("You're playing at the EXPERT level. You're a true master!");
				break;
		}
	}
}
