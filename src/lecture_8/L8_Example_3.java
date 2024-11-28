package lecture_8;

public class L8_Example_3
{
    public final static double DRAGON_POWER_COEFFICIENT = 2.5;

    public static double calculateStrength(int dragonSize)
    {
        return dragonSize * DRAGON_POWER_COEFFICIENT;

    }

    public static void main(String[] args) {
        System.out.println("Fire dragon power: " + calculateStrength(5));
        System.out.println("Water dragon power: " + calculateStrength(3));

    }
}
