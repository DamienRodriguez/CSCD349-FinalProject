public class StatsTest {
	
	public static void main (String[] args) {
		Stats warriorStats = new Stats(125,4,.8,35,60,.2);
		
		int[] dmgVar = warriorStats.getDamageVariance();
		
		System.out.println(warriorStats.getHP());
		System.out.println(warriorStats.getAS());
		System.out.println(warriorStats.getChanceToBlock());
		System.out.println(warriorStats.getChanceToHit());
		System.out.println(dmgVar[0] + " " + dmgVar[1]);
	}
}

