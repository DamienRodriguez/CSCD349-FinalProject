public class Hero extends DungeonCharacter implements Attack{
	
	private int numTurns;
	private int[] pots;

	public Hero(final String name, final Stats stats) {
		super(name,stats);
	}
   
   public int getCurrentHP() {
      return super.getCurrentHP();
   }
   
   public String getName() {
      return super.getName();
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


	public void battleChoices(final DungeonCharacter opponent) {
      setNumTurns(super.getStats().getAS() / opponent.getStats().getAS());
      if(getNumTurns() == 0) {
         setNumTurns(getNumTurns() + 1);   
      }
      
      System.out.println("Number of turns this round is: " + getNumTurns());
   }

	public boolean hasPots() {
		if(pots[0] == 0 && pots[1] == 0) {
			System.out.println("You have no potions in your inventory.");
			return false;
		}
		else if(pots[0] == 0) {
			System.out.println("You have: " + this.pots[1] + " vision potions in your inventory.");
			return true;
		}
		else if(pots[1] ==  0) {
			System.out.println("You have: " + this.pots[0] + " healing potions in your inventory.");
			return true;
		}
		else {
			System.out.println("You have: " + this.pots[0] + " healing potions, and " + this.pots[1] + " vision potions in your inventory.");
			return true;
		}
	}
	
	public void healthPot() {
		int hp = Math.random(5,16);
		if(hasPots()) {
			System.out.println("You have drank the mighty red liquid of vigor! You have healed for: " + hp);
			this.addHP(hp);
		}
	}
}
