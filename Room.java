package finalProject;
import java.util.Random;
// Hewr Tarkhany


public class Room {
	private boolean monster ;
	private boolean healingPotion;
	private boolean pitDamage ;
	private boolean exit;
	private boolean Entrance;
	private boolean fourPillarsOO;
	private boolean vision;
	private final String SN ="*-*";
	private final String EW = "|";
	
	// creating an array for wal side numbers 
	private int [] walls;
	
	// room constructor 
	public Room() {
		
		setHealingPotion(healingPotion);
		setPitDamage(pitDamage);
		setMonster(this.monster);
		setPitDamage(this.pitDamage);
		setExit(exit);
		setEntrance(Entrance);
		setFourPillarsOO(this.fourPillarsOO);
		setVision(this.vision);
		getSN();
		getEW();
		
	}
	
	


	public boolean isMonster() {
		return this.monster;
	}






	public void setMonster(boolean monster) {
		this.monster = monster;
	}






	public boolean isHealingPotion() {
		return healingPotion;
	}






	public void setHealingPotion(boolean healingPotion) {
		this.healingPotion = healingPotion;
	}






	public boolean isPitDamage() {
		return pitDamage;
	}






	public void setPitDamage(boolean pitDamage) {
		this.pitDamage = pitDamage;
	}






	public boolean isExit() {
		return exit;
	}






	public void setExit(boolean exit) {
		this.exit = exit;
	}






	public boolean isEntrance() {
		return Entrance;
	}






	public void setEntrance(boolean entrance) {
		Entrance = entrance;
	}






	public boolean isFourPillarsOO() {
		return fourPillarsOO;
	}






	public void setFourPillarsOO(boolean fourPillarsOO) {
		this.fourPillarsOO = fourPillarsOO;
	}






	public boolean isVision() {
		return vision;
	}






	public void setVision(boolean vision) {
		this.vision = vision;
	}






	public String getSN() {
		return SN;
	}






	public String getEW() {
		return EW;
	}

	
	public String roomItems() {
		int counter=0;
		boolean room [] = { isEntrance(),isExit(),isPitDamage(),isFourPillarsOO(),isHealingPotion()};
		for (int x=0;x<room.length;x++) {
			if(room[x]) {
				counter++;
			}
		}
		// count if there is one item in the roomm
		
		
		do {
			if(isEntrance()) {
				return "I";
			}
			else if(isExit()) {
				return "O";
			}else if(isPitDamage()) {
				return "P";
			}
			else if(isFourPillarsOO()) {
				return "F";
			}else if(isMonster()) {
				return "M";
			}else if(isVision()) {
				return "V";
			}
//			else if(isEmpty()){
//				return "E";
//			}
			else if(isHealingPotion())
				return "H";
			
			
			
		}while(counter==1);
		
		if(counter >1) {
			return "M";
		}
		return "E";
		
	}
	/// still working on it  
	public String toString(){
		String [][] str = new String[5][5];
		
		
		return null ;
		
	}
}
