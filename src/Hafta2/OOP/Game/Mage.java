package Hafta2.OOP.Game;

public class Mage extends Character{
    public Mage(String name) {
        super(name, 1000, 350);
    }

    @Override
    public void attack() {
        System.out.println(name + " asasını alev topu atıyor " + attackDamage + " hasar verdi.");
    }


}
