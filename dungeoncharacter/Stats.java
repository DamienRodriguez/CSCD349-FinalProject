public class Stats {

	private int healthPoints;
	private int attackSpeed;
	private double chanceToHit;
	private int minDamage, maxDamage;
	private double chanceToBlock;
	private double chanceToHeal;
	private int minHeal, maxHeal;
	
	public Stats(final int healthPoints, final int attackSpeed, final double chanceToHit, final int minDamage, final int maxDamage, final double chanceToBlock) { 
		setHP(healthPoints);
		setAS(attackSpeed);
		setChanceToHit(chanceToHit);
		setDamageVariance(minDamage,maxDamage);
		setChanceToBlock(chanceToBlock);
		
		setHealVariance(0,0);
		setChanceToHeal(0.0);
	} //end of Hero Stats constructor
	
	public Stats(final int healthPoints, final int attackSpeed, final double chanceToHit, final int minDamage, final int maxDamage, final double chanceToHeal, final int minHeal, final int maxHeal) {
		setHP(healthPoints);
		setAS(attackSpeed);
		setChanceToHit(chanceToHit);
		setDamageVariance(minDamage,maxDamage);
		setChanceToHeal(chanceToHeal);
		setHealVariance(minHeal,maxHeal);
		
		setChanceToBlock(0.0);
	}  //end of Monster Stats constructor
	
	public void setHP(final int healthPoints) { 
		this.healthPoints = healthPoints; 
	}
	public void setAS(final int attackSpeed) { 
		this.attackSpeed = attackSpeed; 
	}
	public void setChanceToHit(final double chanceToHit) { 
		this.chanceToHit = chanceToHit; 
	}
	public void setDamageVariance(final int minDamage, final int maxDamage) { 
		this.minDamage = minDamage; 
		this.maxDamage = maxDamage; 
	}
	public void setHealVariance(final int minHeal, final int maxHeal) { 
		this.minHeal = minHeal; 
		this.maxHeal = maxHeal; 
	}
	public void setChanceToHeal(final double chanceToHeal) { 
		this.chanceToHeal = chanceToHeal; 
	}
	public void setChanceToBlock(final double chanceToBlock) { 
		this.chanceToBlock = chanceToBlock; 
	}
	
	public int getHP() { 
		return this.healthPoints; 
	}
	public int getAS() { 
		return this.attackSpeed; 
	}
	public double getChanceToHit() { 
		return this.chanceToHit; 
	}
	
	public int[] getDamageVariance() {
      int[] var = {this.minDamage, this.maxDamage};
		return var;  
	}
	public int[] getHealVariance() {
      int[] var = {this.minHeal, this.maxHeal};
		return var;  
   }
	public double getChanceToHeal() { 
		return this.chanceToHeal; 
	}
	public double getChanceToBlock() { 
		return this.chanceToBlock; 
	}
   
   
   //This needs a better design pattern solution
   public static Stats getWarriorStats() {
      return new Stats(125, 4, .8, 35, 60, .2);
   }
   
   public static Stats getSorceressStats() {
      return new Stats(75, 5, .7, 25, 50, .3);
   }
   
   public static Stats getThiefStats() {
      return new Stats(75, 6, .8, 20, 40, .5);
   }
   
}
