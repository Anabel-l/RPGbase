
public class GameCharacter extends Person {
	int happiness, food, drink, wealth;// happiness, food & drink are 0-10,
										// wealth is infinite
	boolean isHealthy, isHappy;

	public GameCharacter() {
		wealth = 0;
		happiness = 5;
		food = 10;
		drink = 10;
		update();
	}

	public GameCharacter(String name1, String name2, String race, String land, String sexuality, String history, int age, int numSiblings, boolean relationship, int gender, int wealth, int hap, int food, int drink) {
		super(name1, name2, race, land, sexuality, history, age, numSiblings, relationship, gender);
		this.wealth = wealth;
		happiness = hap;
		this.food = food;
		this.drink = drink;
		update();
	}
	
	public GameCharacter(String name1, String name2, String race, String land, String sexuality, int age, int numSiblings, int gender) {
		super(name1, name2, race, land, sexuality, "", age, numSiblings, false, gender);
		wealth = 0;
		happiness = 5;
		food = 10;
		drink = 10;
		update();
	}
	
	public GameCharacter(int wealth, int hap, int food, int drink) {
		this.wealth = wealth;
		happiness = hap;
		this.food = food;
		this.drink = drink;
		update();
	}

	public void update() {
		if (food > 5 && drink > 5) {
			isHealthy = true;
		} else {
			isHealthy = false;
			happiness--;
		}
		if (happiness > 6) {
			isHappy = true;
		} else {
			isHappy = false;
		}
	}

	public void timePeriod(int amount) {
		for (int i = 0; i < amount; i++) {
			food--;
			drink--;
		}
		update();
	}

	public void eat(int amount) {
		food += amount;
		update();
	}

	public void drink(int amount) {
		drink += amount;
		update();
	}

	public void feel(int amount) {
		happiness += amount;
		update();
	}

	public void moneyExchange(int amount) {
		wealth += amount;
		update();
	}
}
