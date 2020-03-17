public abstract class DungeonCharacter implements Attack {

	private String name;
	private int currentHP;
	private Stats stats;
	
	
	public DungeonCharacter(final String name, final Stats stats) {
		if(name.isEmpty())
			throw new IllegalArgumentException("Name parmesan in DungeonCharacter constructor was empty.");
		if(name == null || stats == null)
			throw new NullPointerException("Name or Stats parmesan was passed in as null");

		setStats(stats);
		setName(name);
		setCurrentHP();
	}
	
	public void setStats(final Stats stats) {
		this.stats = stats;
	}
	
	public void setName(final String name) {
		this.name = name;
	}
	
	public void setCurrentHP() {
		this.currentHP = stats.getHP();
	}
   
   public String getName() {
      return this.name;
   }
   
   public int getCurrentHP() {
      return this.currentHP;
   }
   
   public Stats getStats() {
      return this.stats;
   }
	
	public void addHP(final int hp) {
      if(super.getCurrentHP() > 0)
		   this.currentHP += hp;
	}
	
	public void subHP(final int hp) {
		this.currentHP -= hp;
	}
	
	public void attack(final DungeonCharacter opponent) {
      if(opponent == null)
         throw new IllegalArgumentException("Opponent parmesan was passed as null.");
	
		boolean canAttack = false;
		int damage = 0;
      int[] dmgVar = this.stats.getDamageVariance();
		
		canAttack = Math.random() <= this.stats.getChanceToHit();
      
      System.out.println("========================");
      System.out.println(canAttack);
		System.out.println("========================");
      
		if(canAttack) {
			damage = (int)(Math.random() * (dmgVar[0] - dmgVar[1] + 1)) + dmgVar[0];
         System.out.println(this.getName() + "'s attack connected with: " + opponent.getName() + " dealing "+ damage);
			opponent.subHP(damage);
			
		} else {
			System.out.println(this.getName() + "'s attack failed to connect with the " + opponent.getName());
			System.out.println();
		}
	}
}
