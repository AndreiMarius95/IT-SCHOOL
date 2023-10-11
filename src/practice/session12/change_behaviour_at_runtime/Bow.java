package practice.session12.change_behaviour_at_runtime;

public class Bow implements Weapon {

    @Override
    public void use() {
        System.out.println("Shooting an arrow!");
    }
}