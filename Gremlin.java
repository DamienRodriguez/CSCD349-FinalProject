public class Gremlin extends Monster {

   public Gremlin() {
      super("Slyn the Gremlin", Stats.getGremlinStats());
   }
   
   @Override
   public void attack(DungeonCharacter opponent) {
      System.out.println(super.getName() + " jabs his kris at " + opponent.getName() + ":");
      super.attack(opponent);
   }
}


