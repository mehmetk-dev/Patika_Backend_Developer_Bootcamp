package hafta2.oop.game;

public class Archer extends Character {
    public Archer(String name) {
        super(name, 800, 400);
    }

    @Override
    public void attack() {
        System.out.println(name + " oku atmaya başladı " + attackDamage + " hasar verdi.");
    }
}
