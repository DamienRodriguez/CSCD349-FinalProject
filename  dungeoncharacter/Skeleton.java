public class Skeleton extends Monster {

   public Skeleton() {
      super("Skeletor the Skeleton Warrior", Stats.getSkeletonStats());
   }
   
   @Override
   public void attack(DungeonCharacter opponent) {
      System.out.println(super.getName() + " slices his rusty longsword at " + opponent.getName() + ":");
      super.attack(opponent);
   }
}


