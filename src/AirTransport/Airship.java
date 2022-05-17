package AirTransport;
import Interfaces.PassengerTransport;

public class Airship implements PassengerTransport{
    boolean fly = true;
    boolean ground = false;
    boolean rail = false;
    boolean water = false;

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
}

