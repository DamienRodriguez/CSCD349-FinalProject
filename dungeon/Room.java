public class Room{


    private boolean hasExit = false;
    private boolean hasEntrance = false;
    private boolean hasMonster = false;
    private boolean hasHealthpotion = false;
    private boolean hasVisionPotion = false;
    private boolean hasPiller = false;
    private int[] coordinates;

    public Room(boolean hasMonster,boolean hasHealthpotion , boolean hasVisionPotion, boolean hasPiller,boolean hasEntrance,boolean hasExit, int[] coordinates) {
        this.hasHealthpotion = hasHealthpotion;
        this.hasMonster=hasMonster;
        this.hasVisionPotion=hasVisionPotion;
        this.hasPiller = hasPiller;
        this.hasEntrance = hasEntrance;
        this.hasExit = hasExit;
    }
    
    public void setCoordinates(final int[] coordinates) {
      this.coordinates = coordinates;
    }
    
    public int[] getCoordinates() {
      return this.coordinates;
    }
    
    public boolean getHasExit() {
        return hasExit;
    }

    public void setHasExit(boolean hasExit) {
        this.hasExit = hasExit;
    }

    public boolean getHasEntrance() {
        return hasEntrance;
    }

    public void setHasEntrance(boolean hasEntrance) {
        this.hasEntrance = hasEntrance;
    }
    public boolean isHasMonster() {
        return hasMonster;
    }

    public void setHasMonster(boolean hasMonster) {
        this.hasMonster = hasMonster;
    }

    public boolean isHasHealthpotion() {
        return hasHealthpotion;
    }

    public void setHasHealthpotion(boolean hasHealthpotion) {
        this.hasHealthpotion = hasHealthpotion;
    }

    public boolean isHasVisionPotion() {
        return hasVisionPotion;
    }

    public void setHasVisionPotion(boolean hasVisionPotion) {
        this.hasVisionPotion = hasVisionPotion;
    }

    public boolean isHasPiller() {
        return hasPiller;
    }

    public void setHasPiller(boolean hasPiller) {
        this.hasPiller = hasPiller;
    }

}
