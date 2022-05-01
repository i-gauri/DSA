package designpatterns.observer;

public class AverageScoreDisplay implements IObserver {
	
	private final static int OVERS = 50;
	private double runRate;
	private int predictedScore;

	@Override
	public void update(int runs, double overs, int wickets) {
		this.runRate = runs / overs;
		this.predictedScore = (int)runRate * OVERS;
		display();
	}

	public void display() {
		System.out.println("---------------------");
		System.out.println("Average Score Display");
		System.out.println("---------------------");
		System.out.println("Current Run Rate : " + (Math.round(this.runRate * 100.0) / 100.0));
		System.out.println("Predicted Score  : " + this.predictedScore);
	}

}
