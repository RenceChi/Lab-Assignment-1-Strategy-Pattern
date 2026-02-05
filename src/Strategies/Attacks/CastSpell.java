package Strategies.Attacks;

import Strategies.AttackStrategy;

public class CastSpell implements AttackStrategy {
    @Override
    public void attack(){
        System.out.println("Wizard casts a spell!");
    }
}
