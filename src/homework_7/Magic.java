package homework_7;
//3.
public class Magic extends Hero{

    public Magic(int health, int damage, String syperAbilityType){
        super(health, damage, syperAbilityType);
    }
    @Override
    public void applySuperAbility() {
        System.out.println("Magic применил супер способность " + getSuperAbilityType());
    }
}
