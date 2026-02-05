import Strategies.Attacks.CastSpell;
import Strategies.Attacks.ShootArrow;
import Strategies.Attacks.SwingSword;
import Strategies.Defense.CreateMagic;
import Strategies.Defense.Dodge;
import Strategies.Defense.Shield;

public class GameApp {
    public static void main(String[] args) {
        Character knight = new Character(new SwingSword(), new Shield());
        Character wizard = new Character(new CastSpell(), new CreateMagic());
        Character archer = new Character(new ShootArrow(), new Dodge());

        System.out.println("--- Knight Logic ---");
        knight.attack();
        knight.defend();
        System.out.println("Knight switches defense...");
        knight.setDefenseStrategy(new Dodge());
        knight.defend(); // Now Dodging
        knight.setDefenseStrategy(new CreateMagic());
        knight.defend(); // Now creating Magic

        System.out.println("--- Wizard Logic ---");
        wizard.attack();
        wizard.defend();

        System.out.println("--- Archer Logic ---");
        archer.attack();
        archer.defend();
    }
}