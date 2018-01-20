package javacore;

import java.util.*;

class BloodyMary implements Observer {

	public void update(Observable o, Object arg) {
		if (o instanceof Chris) {
			System.out.println("Mary says : Go to hell.");
		} else {
			System.out.println("Mary says : I don't know you.");
		}
	}
}

class SweetJane implements Observer {

	public void update(Observable o, Object arg) {
		if (o instanceof Chris) {
			System.out.println("Jane says : How are you.");
		} else {
			System.out.println("Jane says : I don't know you.");
		}
	}
}

class Chris extends Observable {
	public void helloGirls() {
		System.out.println("Hello girls");
		setChanged();
		notifyObservers();
	}
}

class TestObserve {

	public static void main(String[] args) {
		Chris chris = new Chris();
		chris.addObserver(new BloodyMary());
		chris.addObserver(new SweetJane());
		chris.helloGirls();

	}

}