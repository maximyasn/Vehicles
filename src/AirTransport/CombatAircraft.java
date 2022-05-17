package AirTransport;
import Interfaces.BattleTransport;
import Interfaces.PassengerTransport;

public class CombatAircraft implements BattleTransport, PassengerTransport{
    boolean fly = true;
    boolean ground = false;
    boolean rail = false;
    boolean water = false;
    String weapon = "Machine gun";

    public void isFly() {
        System.out.println("Летает? - " + (fly? "Yes" : "No"));
    }
    public void isGround() {
        System.out.println("Наземный? - " + (ground? "Yes" : "No"));
    }
    public void isRail() {
        System.out.println("Ж/Д? - " + (rail? "Yes" : "No"));
    }
    public void isWater() {
        System.out.println("Плавает? - " + (water? "Yes" : "No"));
    }
    public void WeaponType() {
        System.out.println(weapon);
    }
}

