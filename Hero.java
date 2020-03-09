public class Hero extends DungeonCharacter implements Attack{
	
	private int numTurns;

	public Hero(final String name, final Stats stats) {
		super(name,stats);
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

	@Override
	public String toString() {
		return "Hero name: "+getName()+"\n"
				+"Hitpoints: "+getCurrentHP()+"\n"
				+"Total Healing Potions: "+"\n"
				+"Total Vision Potions: "+ "\n"
				+"Total Pillars of OO Found: ";
	}
	//stuff goes here
}
