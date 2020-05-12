package strategy;

public class DuckCall implements QuackBehavior {
	
	private QuackBehavior quackBehavior = new MuteQuack();
	
	public void setQuackBehaviour(QuackBehavior qb) {
		quackBehavior = qb;
	}
	@Override 
	public void  quack() {
		quackBehavior.quack();
	}
}
