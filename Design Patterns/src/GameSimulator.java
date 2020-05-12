import strategy_game.Queen;
import strategy_game.BowAndArrowBehavior;
import strategy_game.Character;

public class GameSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Queen Character");
		Character queen = new Queen();
		queen.fight();
		System.out.println("Giving Queen new weapon for coins");
		queen.setWeapon(new BowAndArrowBehavior());
		queen.fight();
	}

}
