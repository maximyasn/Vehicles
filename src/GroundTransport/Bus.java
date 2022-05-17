package GroundTransport;
import Interfaces.PassengerTransport;

public class Bus implements PassengerTransport{
    boolean fly = false;
    boolean ground = true;
    boolean rail = false;
    boolean water = false;
    int wheelCount = 6;
    int passCount = 30;

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
    public void WheelCount() {
        System.out.println("Количество колес: " + wheelCount);
    }
    public void PassCount() {
        System.out.println("Количество пассажиров: " + passCount);
    }
}
