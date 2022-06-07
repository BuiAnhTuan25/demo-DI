public class Teacher extends People {
    protected Outfit anything;

    public Teacher(Outfit shirt, Outfit trousers, Outfit shoes, Outfit anything) {
        super(shirt, trousers, shoes);
        this.anything = anything;
    }
    public void outfit(){
        System.out.println("Teacher");
        this.shirt.wear();
        this.trousers.wear();
        this.shoes.wear();
        this.anything.wear();
    }
}
