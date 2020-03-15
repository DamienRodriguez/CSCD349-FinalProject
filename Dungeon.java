package practiceFinal;

import dungeonbattle.Action;
import dungeonbattle.Hero;
import dungeonbattle.Room;

public class Dungeon {
	    private static boolean nDirection = false;
	    private static boolean sDirection = false;
	    private static boolean wDirection = false;
	    private static boolean eDirection = false;

	    // CREATING A ROMM 5X5
	    public static Room[][] newRandomDungeon(Hero hero) {
	    	
	        Room[][] dungeon = new Room[8][8];
	        for (int i = 0; i < dungeon.length; i++) {
	            for (int j = 0; j < dungeon.length; j++) {
	                dungeon[i][j] = Room.newRoomInstance();

	            }
	        }
	        hero.setCurrRoom(dungeon[5][5]);
	        return dungeon;
	    }
	    // number of rooms and their decoration 
	    public boolean numberRoomExists(int south, int north) {
	    	
	        return  (rowExists(south)) && (colExists(north));
	    }
	    
	    public boolean rowExists(int south) {
			return (south >=0) && (south <=11);
	    	
	    }
	    public boolean colExists(int north) {
			return (north >=0)&&(north <=11);
	    	
	    }
	    public void heroMove(Hero hero) {
	    	
	        nDirection = roomExists(hero.getCurrX(), hero.getCurrY() + 1);
	        
	        sDirection = roomExists(hero.getCurrX(), hero.getCurrY()
	                - 1);
	        eDirection = roomExists(hero.getCurrX() + 1,
	                hero.getCurrY());
	        wDirection = roomExists(hero.getCurrX() - 1,
	                hero.getCurrY());
	        Action.movePlayer(hero);

	    }
	    
}
