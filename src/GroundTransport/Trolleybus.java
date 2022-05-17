package GroundTransport;
import Interfaces.PassengerTransport;

public class Trolleybus implements PassengerTransport {
    boolean fly = false;
    boolean ground = true;
    boolean rail = false;
    boolean water = false;

    public void isFly() {
        System.out.println("Летает? - " + (fly ? "Yes" : "No"));
    }

    public void isGround() {
        System.out.println("Наземный? - " + (ground ? "Yes" : "No"));
    }

    public void isRail() {
        System.out.println("Ж/Д? - " + (rail ? "Yes" : "No"));
    }

    public void isWater() {
        System.out.println("Плавает? - " + (water ? "Yes" : "No"));
    }
}
