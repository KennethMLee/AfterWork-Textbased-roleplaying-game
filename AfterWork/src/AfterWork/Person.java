package AfterWork;

public class Person 
{
	private String name;
	private static int energy;
	private static int happiness;
	private static int money;
	
	public Person(String initName)
	   {
	      setName(initName);
	      setEnergy(100);
	      setHappiness(0);
	      setMoney(100);
	   }

	public void setStats(int newEnergy, int newHappiness, int newMoney) 
	{
		energy += newEnergy;
		happiness += newHappiness;
		money += newMoney;	
		
		System.out.println("Happiness level: " + happiness);
		System.out.println("Money left     : " + money);
	}

	
	public void setEnergy(int energy) {
		Person.energy = energy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHappiness(int happiness) {
		Person.happiness = happiness;
	}

	public static int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		Person.money = money;
	}

	public static int getEnergy() {
		return energy;
	}

	public static int getHappiness() {
		return happiness;
	}

}