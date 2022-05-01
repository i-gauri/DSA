package designpatterns.observer;

public class CurrentScoreDisplay implements IObserver {

	private int runs;
	private double overs;
	private int wickets;
	
	@Override
	public void update(int runs, double overs, int wickets) {
		this.runs = runs;
		this.overs = overs;
		this.wickets = wickets;
		display();
	}

	public void display() {
		System.out.println("---------------------");
		System.out.println("Current Score Display");
		System.out.println("---------------------");
		System.out.println("Runs    : " + this.runs);
		System.out.println("Overs   : " + this.overs);
		System.out.println("Wickets : " + this.wickets);
	}

}
