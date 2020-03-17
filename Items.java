public class Items {
    private String ItemName;
    private String ItemType;
    private String description;

    public Items(String ItemName, String ItemType, String description) {
        this.ItemName = ItemName;
        this.ItemType = ItemType;
        this.description = description;
    }

    public void useItem(Hero hero, Items item) {
        if (item.ItemType.equals("Health potion")) {
            hero.addHP(15);
        } else if (item.ItemType.equals("Vision potion")) {

        }
    }

    private Items Healthpotion() {
        String desc = "a strong healing potion you can feel the energy" +
                " coming from it, its practically jumping around its vial";
        return new Items("potion", "Health Potion", desc);
    }

    private Items VisionPotion() {
        String desc = "As you look at this potion, it feels like " +
                "its looking back at you...";
        return new Items("potion", "Vision potion", desc);
    }
}
