package homework_7;
//4.
public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {
                new Magic(100, 20, "FIREBALL"),
                new Medic(120, 10, "HEALING", 20),
                new Warrior(150, 25, "CRITICAL DAMAGE")
        };

        for (Hero hero : heroes) {
            hero.applySuperAbility();

            //6.
            if (hero instanceof Medic){
                Medic medic = (Medic) hero;
                medic.increaseExperience();
                System.out.println("Medic's heal points increased to: " + medic.getHealPoints());
            }
        }
    }
}
