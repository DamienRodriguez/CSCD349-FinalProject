package finalProject;
//Hewr Tarkhany

public class Hero {

	private String name ;
	private int potion;
	private int vision;
	private int pillars;
	private int maximumHitPoints;

	 public Hero(String name, int potion,int vision,int pillars) {
		 this.name=name;
		 this.potion=potion;
		 this.vision=vision;
		 this.pillars=pillars;
		 
	 }
	public boolean alive() {
		
		return maximumHitPoints>0;
	}
	
	// GETTERS AND SETTER 
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
	public int getMaximumHitPoints() {
		return maximumHitPoints;
	}
	public void setMaximumHitPoints(int maximumHitPoints) {
		this.maximumHitPoints = maximumHitPoints;
	}
	
	// END OF GETTER AND SETTERS 
	
	public String toString() {
		return "Hero's name: "+ getName()+ " Maximum Hit Points: "+this.getMaximumHitPoints()+" Hero's Potion numbers: "
	           +getPotion()+" Hero's Vision: "+ getVision()+
	           " Pillars that Hero collected: "+ getPillars();
	}
	
	
}
