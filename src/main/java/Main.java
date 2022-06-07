public class Main {
    public static void main(String[] args) {
        Outfit tshirt=new TShirt();
        Outfit jeans=new Jeans();
        Outfit sneaker=new Sneaker();

        People tuanba59=new People(tshirt,jeans,sneaker);

        tuanba59.shirt.wear();
        tuanba59.trousers.wear();
        tuanba59.shoes.wear();
    }
}
