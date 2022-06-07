public class People {
    protected Outfit shirt;
    protected Outfit trousers;
    protected Outfit shoes;

    public People(Outfit shirt, Outfit trousers, Outfit shoes) {
        this.shirt = shirt;
        this.trousers = trousers;
        this.shoes = shoes;
    }

    public void outfit() {
        System.out.println("People");
        this.shirt.wear();
        this.trousers.wear();
        this.shoes.wear();
    }
}
