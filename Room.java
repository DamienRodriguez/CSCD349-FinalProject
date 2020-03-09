package dungeonFinal;
import java.util.Random;

public class Room {
	private int healingPotion;
	private int pitDamage ;
	private boolean exit;
	private boolean Entrance;
	private int fourPillarsOO;
	private boolean vision;
	
	
	public Room(boolean Entrance,int healing,int damage,int pillar,boolean exit,boolean entrance,boolean vision) {
		this.pitDamage= rand(1,20);
		this.healingPotion= rand(5,15);
		this.exit=exit ;
		this.Entrance=entrance;
		this.vision=vision;
		this.fourPillarsOO=pillar;
		
	}
	
	public int getHealingPotion() {
		return healingPotion;
	}

	public int getPitDamage() {
		return pitDamage;
	}

	public boolean isExit() {
		return exit = true;
	}

	public boolean isEntrance() {
		return Entrance= true;
	}

	public int getFourPillarsOO() {
		return fourPillarsOO;
	}

	public void exit() {
		if(isExit()) {
			this.exit=true;
			this.Entrance=false;
			this.healingPotion=0;
			this.pitDamage=0;
			this.fourPillarsOO=0;
		}
		
	}
	public void enterance() {
		if(isEntrance()) {
		this.exit =false;
		this.Entrance=true;
		this.healingPotion=0;
		this.fourPillarsOO=0;
		this.pitDamage=0;
	}}
	
	public int rand(int start, int end) {
		
		Random rand = new Random();
		int i= start;
		for ( ;i<=end;i++ ) {
			i= rand.nextInt();
		}
		return i;
	}
	public String toString() {
		String str =null;
		return str;
	}
}
