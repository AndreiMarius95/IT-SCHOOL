package practice.session12.change_behaviour_at_runtime;

public class GameCharacter {

    private Weapon weapon; //using composition

    public GameCharacter(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        weapon.use();
    }
}