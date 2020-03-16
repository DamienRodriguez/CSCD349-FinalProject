package finalProject;
//Hewr Tarkhany

public class Hero {

	private String name ;
	private int potion;
	private int vision;
	private int pillars;
	
	 public Hero(String name, int potion,int vision,int pillars) {
		 this.name=name;
		 this.potion=potion;
		 this.vision=vision;
		 this.pillars=pillars;
		 
	 }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPotion() {
		return potion;
	}

	public void setPotion(int potion) {
		this.potion = potion;
	}

	public int getVision() {
		return vision;
	}

	public void setVision(int vision) {
		this.vision = vision;
	}

	public int getPillars() {
		return pillars;
	}

	public void setPillars(int pillars) {
		this.pillars = pillars;
	}
	public String toString() {
		return "Hero's name: "+ getName()+ " Hero's Potion numbers: "
	           +getPotion()+" Hero's Vision: "+ getVision()+
	           " Pillars that Hero collected: "+ getPillars();
	}
	
}
