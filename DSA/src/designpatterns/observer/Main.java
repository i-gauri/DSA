package designpatterns.observer;

public class Main {

	public static void main(String[] args) {
		CricketData subject = new CricketData();
		IObserver observer1 = new CurrentScoreDisplay();
		IObserver observer2 = new AverageScoreDisplay();

		// Unregister CurrentScoreDisplay and AverageScoreDisplay
		subject.register(observer1);
		subject.register(observer2);

		// Display data in the beginning.
		subject.updateAll();

		// Update data.
		subject.setOvers(5.2);
		subject.setRuns(28);
		subject.setWickets(1);

		// Display data.
		subject.updateAll();

		// Unregister AverageScoreDisplay
		subject.unregister(observer2);

		// Update data.
		subject.setOvers(15.2);
		subject.setRuns(97);
		subject.setWickets(3);

		// Display data.
		subject.updateAll();
	}
}
