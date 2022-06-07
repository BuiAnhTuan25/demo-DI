public class Main {
    public static void main(String[] args) {
        Outfit tshirt=new TShirt();
        Outfit jeans=new Jeans();
        Outfit sneaker=new Sneaker();
        Outfit whiteShirt=new WhiteShirt();
        Outfit redScarf=new RedScarf();
        Outfit tie=new Tie();
        Outfit leatherShoes=new LeatherShoes();

        People people=new People(tshirt,jeans,sneaker);
        People teacher=new Teacher(whiteShirt,jeans,leatherShoes,tie);
        People student=new Student(whiteShirt,jeans,sneaker,redScarf);

        people.outfit();
        System.out.println();
        teacher.outfit();
        System.out.println();
        student.outfit();
    }
}
