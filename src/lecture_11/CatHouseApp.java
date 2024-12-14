package lecture_11;

public class CatHouseApp {
    public static void main(String[] args) {

        CatHouse.Cat cat = new CatHouse.Cat();

        CatHouse catHouse = new CatHouse();
        CatHouse.Mouse mouse = catHouse.new Mouse();

        CatHouse.Mouse mouse1 = new CatHouse().new Mouse();
    }
}
