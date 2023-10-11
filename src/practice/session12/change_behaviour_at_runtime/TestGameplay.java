package practice.session12.change_behaviour_at_runtime;

public class TestGameplay {

    public static void main(String[] args) {
        GameCharacter knight = new GameCharacter(new Sword());

        knight.attack();

        knight.setWeapon(new Bow());
        knight.attack();
    }
}