package tw.edu.ntub.imd.birc.rpggame.character;

public abstract class Career {

	private int healthPoint;
	private int magicPoint;
	private int attack;
	private int magicAttack;
	private int defense;
	private int magicDefense;

	public int getHealthPoint() {
		return healthPoint;
	}

	public void setHealthPoint(int healthPoint) {
		if (healthPoint > 0)
			this.healthPoint = healthPoint;
		else
			System.out.println("生命不能為負");
	}

	public int getMagicPoint() {
		return magicPoint;
	}

	public void setMagicPoint(int magicPoint) {
		if (magicPoint > 0)
			this.magicPoint = magicPoint;
		else
			System.out.println("魔力不能為負");
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		if (attack > 0)
			this.attack = attack;
		else
			System.out.println("攻擊不能為負");
	}

	public int getMagicAttack() {
		return magicAttack;
	}

	public void setMagicAttack(int magicAttack) {
		if (magicAttack > 0)
			this.magicAttack = magicAttack;
		else
			System.out.println("魔攻不能為負");
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		if (defense > 0)
			this.defense = defense;
		else
			System.out.println("防禦不能為負");
	}

	public int getMagicDefense() {
		return magicDefense;
	}

	public void setMagicDefense(int magicDefense) {
		if (magicDefense > 0)
			this.magicDefense = magicDefense;
		else
			System.out.println("魔防不能為負");
	}

	public abstract String getCareerName();

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(getCareerName() + " [healthPoint=").append(healthPoint).append(", magicPoint=")
				.append(magicPoint).append(", attack=").append(attack).append(", magicAttack=").append(magicAttack)
				.append(", defense=").append(defense).append(", magicDefense=").append(magicDefense).append("]");
		return builder.toString();
	}

}
