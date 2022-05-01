package designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class CricketData implements ISubject {
	
	private int runs;
	private double overs;
	private int wickets;
	private List<IObserver> subscribers;
	
	public CricketData() {
		this.runs = 0;
		this.overs = 0;
		this.wickets = 0;
		this.subscribers = new ArrayList<>();
	}

	@Override
	public void register(IObserver observer) {
		this.subscribers.add(observer);
	}

	@Override
	public void unregister(IObserver observer) {
		this.subscribers.remove(observer);
	}

	@Override
	public void updateAll() {
		this.subscribers
			.forEach(subscriber -> subscriber.update(this.runs, this.overs, this.wickets));
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public double getOvers() {
		return overs;
	}

	public void setOvers(double overs) {
		this.overs = overs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
}
