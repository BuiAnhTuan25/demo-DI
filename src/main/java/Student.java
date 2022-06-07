public class Student extends People {
    protected Outfit anything;

    public Student(Outfit shirt, Outfit trousers, Outfit shoes, Outfit anything) {
        super(shirt, trousers, shoes);
        this.anything = anything;
    }

    public void outfit() {
        System.out.println("Student");
        this.shirt.wear();
        this.trousers.wear();
        this.shoes.wear();
        this.anything.wear();
    }
}
