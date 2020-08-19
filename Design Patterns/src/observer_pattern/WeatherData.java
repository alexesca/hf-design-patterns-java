package observer_pattern;

import java.util.*;

public class WeatherData implements Subject {
	
	private List<Observer> observers = new ArrayList<Observer>();
	
	public void registerObserver(Observer observer) {
		this.observers.add(observer);
		System.out.println("Added new observer to list.");
	};
	
	public void removeObserver(Observer observer) {
		int index = this.observers.indexOf(observer);
		this.observers.remove(index);
		System.out.println("Removed observer from list.");
	};
	
	public void notifyObservers() {
		for(int i=0; i < this.observers.size(); i++) {
			this.observers.get(i).update();
		}
		System.out.println("Notified all observers in list.");
	}
}
