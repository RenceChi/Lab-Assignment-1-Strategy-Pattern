package Strategies.Defense;

import Strategies.DefenseStrategy;

public class Dodge implements DefenseStrategy {
    @Override
    public void defend() {
        System.out.println("Dodgin to avoid attack!");
    }
}
