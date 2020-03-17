
public class Stats {

	private int healthPoints;
	private int attackSpeed;
	private double chanceToHit;
	private int minDamage, maxDamage;
	private double chanceToBlock;
	private double chanceToHeal;
	private int minHeal, maxHeal;

	public Stats(final int healthPoints, final int attackSpeed, final double chanceToHit, final int minDamage, final int maxDamage, final double changeToBlock, final double chanceToHeal, final int minHeal, final int maxHeal) {
		setHP(healthPoints);
		setAS(attackSpeed);
		setChanceToHit(chanceToHit);
		setDamageVariance(minDamage,maxDamage);
		setChanceToBlock(chanceToBlock);
		setChanceToHeal(chanceToHeal);
		setHealVariance(minHeal,maxHeal);
	}

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
		return new Stats(125, 4, .8, 35, 60, .2, 0.0, 0, 0);
	}
   
	public static Stats getAlchemistStats() {
	   return new Stats(68, 4, .6, 13, 28, 0.0, .6, 18, 50);    
   }

	public static Stats getClericStats() {
	   return new Stats(75, 4, .3, 19, 40, 0.0, .9, 30, 55);
   }
	
   public static Stats getSorceressStats() {
		return new Stats(75, 5, .7, 25, 50, .3, 0.0, 25, 50);
	}

	public static Stats getThiefStats() {
		return new Stats(75, 6, .8, 20, 40, .5, 0.0, 0, 0);
	}

	public static Stats getOgreStats() {
		return new Stats(200, 2, .6, 30, 50, 0.0, .1, 30, 50);
	}

	public static Stats getSkeletonStats() {
		return new Stats(100, 3, .8, 30, 50, 0.0, .3, 30, 50);
	}

	public static Stats getGremlinStats() {
		return new Stats(70, 5, .8, 15, 30, 0.0, .4, 20, 40);
	}
   
	public static Stats getGoblinStats() {
	   return new Stats(80, 7, .9, 16, 25, 0.0, .3, 22, 42);
	}
   
	public static Stats getBugBearStats() {
      return new Stats(73, 8, .7, 13, 32, 0.0, .5, 16, 33);	      
	}
}