package hafta2.oop.başlangıç;

public class CarTest {
    public static void main(String[] args) {

        Car audi = new Car();

        audi.setBrand("AUDI");
        audi.setModel("a4");
        audi.setKM(2000);
        audi.setHorsePower(20000);
        audi.setMaxSpeed(310);

        audi.move();
        //Child ch = new Child();
    }
}
