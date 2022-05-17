package AirTransport;
import Interfaces.PassengerTransport;
import Interfaces.WithoutEngine;

public class Paraglider implements PassengerTransport, WithoutEngine {
    boolean fly = true;
    boolean ground = false;
    boolean rail = false;
    boolean water = false;
    String controlMethod = "Wind";

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
    public void controlMethod() {
        System.out.println(controlMethod);
    }
}

