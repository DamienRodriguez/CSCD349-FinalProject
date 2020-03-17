package finalProject;
import java.util.Random;


public abstract class Monster extends DungeonCharacter implements Attack,SubHitPoint,HitPoint {
	
    private static final Random rand = new Random();

	
		public Monster (final String name, final CharacterData data) {
			super(name,data);
			
		}
		public void attack ( DungeonCharacter charact) {
			
		        rand.nextInt(super.getData().getMaxDamage() - super.getData().getMinDamage() - 1);
		    
			
		}
		//-----------------------------------------------------------------
		 public void subtractHitPoints(int hitPoints)
		 {
				super.subtractHitPoints(hitPoints);;
				heal();

		 }//end method
		 public void addHitpoints (int hitPoints) {
			 super.addHitPoints(hitPoints);
		 }
		 public void heal()
		  {
			boolean canHeal;
			int healPoints;

			canHeal = (Math.random() <= super.getData().getChanceToHeal()) && (super.getHitPoints()> 0);

			if (canHeal)
			{
				healPoints = (int)(Math.random() * (super.getData().getMaxHeal()- super.getData().getMinHeal() + 1)) + super.getData().getMinHeal();
				addHitPoints(healPoints);
				System.out.println(super.getCharName()+ " healed itself for " + healPoints + " points.\n"
									+ "Total hit points remaining are: " + getHitPoints());
				System.out.println();
			}//end can heal


		  }
	

}
