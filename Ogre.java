public class Ogre extends Monster implements Attack {

   public Ogre() {
      super("Og-Mar the Ogre", Stats.getOgreStats());
   }
   
   @Override
   public void attack(DungeonCharacter opponent) {
      System.out.println(super.getName() + " slowly swings a club toward's " + opponent.getName() + ":");
      super.attack(opponent);
   }
}


