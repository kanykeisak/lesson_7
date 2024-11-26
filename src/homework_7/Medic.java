package homework_7;
//3.
public class Medic extends Hero{
    //5.
    private double healPoints;

    public Medic(int health, int damage, String superAbilityType, double healPoints){
        super(health, damage, superAbilityType);
        this.healPoints = healPoints;
    }

    public double getHealPoints() {
        return healPoints;
    }

    public void increaseExperience(){
        this.healPoints = healPoints * 1.1;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил супер способность " + getSuperAbilityType());
    }
}
