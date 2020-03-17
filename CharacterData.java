package finalProject;

public class CharacterData {
	// these are given in the previous project
	
	private int healthPoints;
	private int attackSpeed;
	private double chanceToHit;
	private int minDamage, maxDamage;
	private double chanceToBlock;
	private double chanceToHeal;
	private int minHeal, maxHeal;
	
	
	// constructor 
	public CharacterData(final int healthPoints, final int attackSpeed, final double chancetoHit,final int minDam,final int maxDam,final double changeToBlock, final double chanceToHeal, final int minHeal, final int maxHeal) {
		
		setHealthPoints(healthPoints);
		setAttackSpeed(attackSpeed);
		setChanceToHit(chanceToHit);
		setMinDamage(minDamage);
		setMaxDamage(maxDamage);
		setChanceToHeal(chanceToHeal);
		setMinHeal(minHeal); 
		setMaxHeal(maxHeal);
		
	}
// automatic setters
    public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}

	public void setAttackSpeed(int attackSpeed) {
		this.attackSpeed = attackSpeed;
	}

	public void setChanceToHit(double chanceToHit) {
		this.chanceToHit = chanceToHit;
	}

	public void setMinDamage(int minDamage) {
		this.minDamage = minDamage;
	}

	public void setMaxDamage(int maxDamage) {
		this.maxDamage = maxDamage;
	}

	public void setChanceToHeal(double chanceToHeal) {
		this.chanceToHeal = chanceToHeal;
	}

	public void setMinHeal(int minHeal) {
		this.minHeal = minHeal;
	}

	public void setMaxHeal(int maxHeal) {
		this.maxHeal = maxHeal;
	}
	// automatic gettrs 


	public double getChanceToBlock() {
		return chanceToBlock;
	}
	public void setChanceToBlock(double chanceToBlock) {
		this.chanceToBlock = chanceToBlock;
	}
	public int getHealthPoints() {
		return healthPoints;
	}
	public int getAttackSpeed() {
		return attackSpeed;
	}
	public double getChanceToHit() {
		return chanceToHit;
	}
	public int getMinDamage() {
		return minDamage;
	}
	public int getMaxDamage() {
		return maxDamage;
	}
	public double getChanceToHeal() {
		return chanceToHeal;
	}
	public int getMinHeal() {
		return minHeal;
	}
	public int getMaxHeal() {
		return maxHeal;
	}
	
	
	
// hero datas most of the datas i got from the origional data numbers  that was given for the assignment 
	 
	public static CharacterData ArragornData() {
	      return new CharacterData(68, 4, .6, 13, 28, 0.0, .6, 18, 50);
	      
       }
  
	public static CharacterData gimlyData() {
	      return new CharacterData(75, 4, .3, 19, 40, 0.0, .9, 30, 55);
        }
      
	   public static CharacterData warriorData() {
	      return new CharacterData(125, 4, .8, 35, 60, .2, 0.0, 0, 0);
	   }
	   
	   public static CharacterData sorceressdata() {
	      return new CharacterData(75, 5, .7, 25, 50, .3, 0.0, 25, 50);
	   }
	   
	   public static CharacterData thiefData() {
	      return new CharacterData(75, 6, .8, 20, 40, .5, 0.0, 0, 0);
	   }
	   
	   // monster datas 
	   public static CharacterData ogreData() {
	      return new CharacterData(200, 2, .6, 30, 50, 0.0, .1, 30, 50);
	   }
	   
	   public static CharacterData skeletonData() {
	      return new CharacterData(100, 3, .8, 30, 50, 0.0, .3, 30, 50);
	   }
	   
	   public static CharacterData gremlinData() {
	      return new CharacterData(70, 5, .8, 15, 30, 0.0, .4, 20, 40);
	   }
	   
	   public static CharacterData BolfgremlinData() {
		      return new CharacterData(80, 7, .9, 16, 25, 0.0, .3, 22, 42);
		      }
	   public static CharacterData OrcolgData() {
			      return new CharacterData(73, 8, .7, 13, 32, 0.0, .5, 16, 33);
			      
		   }
	   
}
