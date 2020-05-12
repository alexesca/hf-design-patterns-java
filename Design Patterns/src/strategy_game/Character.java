package strategy_game;

public abstract class Character {
	WeaponBehavior weapon = new KnifeBehavior();
	
	public void setWeapon(WeaponBehavior w) {
		this.weapon = w;
	}
	
	public void fight() {
		this.weapon.useWeapon();
	};
}
