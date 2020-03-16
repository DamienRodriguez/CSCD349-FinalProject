package dungeoncharacter;
public class Hero extends DungeonCharacter implements Attack{

	private int numTurns;
	private int[] inventory;
	private int foundPillars;

	public Hero(final String name, final Stats stats) {
		super(name,stats);
		setInitialInventory();
		setInitialPillars();
	}

	public String getName() {
		return super.getName();
	}

	private void setInitialInventory() {
		this.inventory = new int[]{0, 0};
	}

	private void setInitialPillars() {
		this.foundPillars = 0;
	}

	public int getFoundPillars() {
		return this.foundPillars;
	}

	public void addPillar() {
		this.foundPillars++;
	}


	public int[] getInventory() {
		return this.inventory;
	}

	public void setNumTurns(final int numTurns) {
		this.numTurns = numTurns;
	}

	public int getNumTurns() {
		return this.numTurns;
	}

	public boolean defend() {
		return Math.random() <= super.getStats().getChanceToBlock();
	}

	public void subHP(final int hp) {
		if(defend()) {
			System.out.println(super.getName() + " Blocked the attack!");
		}

		else {
			super.subHP(hp);
		}
	}

	public void addHP(final int hp) {
		super.addHP(hp);
	}

	public void attack(DungeonCharacter opponent) {
		super.attack(opponent);
	}

	public void addHealthPotion() {
		this.inventory[0]++;
	}
   
   public void useHealthPotion() {
      this.inventory[0]--;
   }

	public void addVisionPotion() {
		this.inventory[1]++;
	}
   
   public void useVisionPotion() {
		this.inventory[1]--;
	}


	public void battleChoices(final DungeonCharacter opponent) {
		setNumTurns(super.getStats().getAS() / opponent.getStats().getAS());
		if(getNumTurns() == 0) {
			setNumTurns(getNumTurns() + 1);
		}

		System.out.println("Number of turns this round is: " + getNumTurns());
	}

	@Override
	public String toString() {
		return "Hero name: "+getName()+"\n"
				+"Hitpoints: "+getCurrentHP()+"\n"
				+"Total Healing Potions: "+ this.inventory[0] + "\n"
				+"Total Vision Potions: "+ this.inventory[1] +  "\n"
				+"Total Pillars of OO Found: " + getFoundPillars();
	}
}
