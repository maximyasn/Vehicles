package GroundTransport;
import Interfaces.BattleTransport;

public class Tank implements BattleTransport {
    String weapon = "Cannon";

    public void WeaponType() {
        System.out.println(weapon);
    }
}
