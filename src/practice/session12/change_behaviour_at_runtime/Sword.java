package practice.session12.change_behaviour_at_runtime;

public class Sword implements Weapon {

    @Override
    public void use() {
        System.out.println("Swinging the sword!");
    }
}