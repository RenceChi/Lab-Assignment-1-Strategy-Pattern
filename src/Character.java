import Strategies.AttackStrategy;
import Strategies.Defense.Dodge;
import Strategies.DefenseStrategy;

public class Character {
    private AttackStrategy attackStrategy;
    private DefenseStrategy defenseStrategy;

    public Character(AttackStrategy attackStrategy, DefenseStrategy defenseStrategy) {
        this.attackStrategy = attackStrategy;
        this.defenseStrategy = defenseStrategy;
    }
    public void attack() {
        attackStrategy.attack();
    }

    public void defend() {
        defenseStrategy.defend();
    }

    public void setDefenseStrategy(DefenseStrategy defenseStrategy) {
        this.defenseStrategy = defenseStrategy;
    }
}
