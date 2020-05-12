package strategy;

public class DuckCall implements QuackBehaviour {
	
	private QuackBehaviour quackBehaviour = new MuteQuack();
	
	public void setQuackBehaviour(QuackBehaviour qb) {
		quackBehaviour = qb;
	}
	@Override 
	public void  quack() {
		quackBehaviour.quack();
	}
}
