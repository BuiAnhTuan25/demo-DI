public class Main {
    public static void main(String[] args) {
        Outfit tshirt = new TShirt();
        Outfit whiteShirt = new WhiteShirt();

        Outfit jeans = new Jeans();
        Outfit shorts = new Shorts();

        Outfit leatherShoes = new LeatherShoes();
        Outfit sneaker = new Sneaker();

        Outfit redScarf = new RedScarf();
        Outfit tie = new Tie();

        People people = new People(tshirt, jeans, sneaker);
        People teacher = new Teacher(whiteShirt, jeans, leatherShoes, tie);
        People student = new Student(whiteShirt, shorts, sneaker, redScarf);

        people.outfit();
        System.out.println();
        teacher.outfit();
        System.out.println();
        student.outfit();
    }
}
