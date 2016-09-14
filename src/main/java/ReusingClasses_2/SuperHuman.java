package ReusingClasses_2;

/**
 * Created by evanhitchings on 9/14/16.
 */
public class SuperHuman extends Human {
    private String heroName;
    private String ability;
    private String alignment;


    public SuperHuman(String name, int age, String gender, String occupation, String address, String heroName, String ability, String alignment) {
        super(name, age, gender, occupation, address);
        this.heroName = heroName;
        this.ability = ability;
        this.alignment = alignment;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }
}
