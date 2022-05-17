package GroundTransport;

public class SUVs {
    boolean fly = false;
    boolean ground = true;
    boolean rail = false;
    boolean water = false;
    int wheelCount = 4;
    String offRoad = "Супервнедорожник";

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
    public void OffRoad() {
        System.out.println(offRoad);
    }
}
